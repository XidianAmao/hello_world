package com.amao.guava;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Mockito并不是创建一个真实的对象，而是模拟这个对象，
 * 他用简单的when(mock.method(params)).thenRetrun(result)语句设置mock对象的行为，如下语句：
 *
 * // 设置mock对象的行为 － 当调用其get方法获取第0个元素时，返回"first"
 * Mockito.when(mockedList.get(0)).thenReturn("first");
 *
 * 在Mock对象的时候，创建一个proxy对象，保存被调用的方法名（get），以及调用时候传递的参数（0），
 * 然后在调用thenReturn方法时再把“first”保存起来，这样，就有了构建一个stub方法所需的所有信息，构建一个stub。
 * 当get方法被调用的时候，实际上调用的是之前保存的proxy对象的get方法，返回之前保存的数据。
 *
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-08 19:17
 */
public class AppTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    /**
     * 验证行为发生
     * mock一个类
     * 验证这个类的方法
     */
    @Test
    public void verify_behaviour() {
        //模拟创建一个List对象
        List mock = mock(List.class);
        //使用mock的对象
        mock.add(1);
        mock.clear();
        //验证add(1)和clear()行为是否发生
        verify(mock).add(1);
        verify(mock).clear();
    }

    /**
     * 测试期望的结果1
     * mock搭配when，thenReturn
     * 返回需要的mock值
     * 同对应的结果坐判断
     */
    @Test
    public void when_thenReturn() {
        //mock一个Iterator类
        Iterator iterator = mock(Iterator.class);
        //预设当iterator调用next()时第一次返回hello，第n次都返回world
        when(iterator.next()).thenReturn("hello").thenReturn("world");
        //使用mock的对象
        String result = iterator.next() + " " + iterator.next() + " " + iterator.next();
        //验证结果
        assertEquals("hello world world", result);
    }

    /**
     * 测试期望的结果2
     * mock对应的类
     * 当实现对应的方法时，比如close
     * 期望出现的异常
     */
    @Test(expected = IOException.class)
    public void when_thenThrow() throws IOException {
        OutputStream outputStream = mock(OutputStream.class);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        //预设当流关闭时抛出异常
        doThrow(new IOException()).when(outputStream).close();
        outputStream.close();
    }

    @Test(expected = RuntimeException.class)
    public void doThrow_when() {
        List list = mock(List.class);
        doThrow(new RuntimeException()).when(list).add(1);
        list.add(1);
    }

    /**
     * RETURNS_DEEP_STUBS也是创建mock对象时的备选参数
     * <p>
     * RETURNS_DEEP_STUBS参数程序会自动进行mock所需的对象，方法deepstubsTest和deepstubsTest2是等价的
     */
    @Test
    public void deepstubsTest() {
        Account account = mock(Account.class, RETURNS_DEEP_STUBS);
        when(account.getRailwayTicket().getDestination()).thenReturn("Beijing");
        account.getRailwayTicket().getDestination();
        verify(account.getRailwayTicket()).getDestination();
        assertEquals("Beijing", account.getRailwayTicket().getDestination());
    }

    @Test
    public void deepstubsTest2() {
        Account account = mock(Account.class);
        RailwayTicket railwayTicket = mock(RailwayTicket.class);
        when(account.getRailwayTicket()).thenReturn(railwayTicket);
        when(railwayTicket.getDestination()).thenReturn("Beijing");

        account.getRailwayTicket().getDestination();
        verify(account.getRailwayTicket()).getDestination();
        assertEquals("Beijing", account.getRailwayTicket().getDestination());
    }

    public class RailwayTicket {
        private String destination;

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }
    }

    public class Account {
        private RailwayTicket railwayTicket;

        public RailwayTicket getRailwayTicket() {
            return railwayTicket;
        }

        public void setRailwayTicket(RailwayTicket railwayTicket) {
            this.railwayTicket = railwayTicket;
        }
    }

    /**
     * 使用注解来快速模拟
     */
    @Mock
    private List mockList;
    public AppTest(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }



}