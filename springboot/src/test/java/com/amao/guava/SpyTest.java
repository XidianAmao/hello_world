package com.amao.guava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-09 17:40
 */
public class SpyTest {
    /**
     * Mock不是真实的对象，它只是用类型的class创建了一个虚拟对象，并可以设置对象行为
     * Spy是一个真实的对象，但它可以设置对象行为
     * InjectMocks创建这个类的对象并自动将标记@Mock、@Spy等注解的属性值注入到这个中
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void spy_on_real_objects() {
        List list = new LinkedList();
        List spy = spy(list);
        //1。下面预设的spy.get(0)会报错，因为会调用真实对象的get(0)，所以会抛出越界异常
        //when(spy.get(0)).thenReturn(3);

        //2。使用doReturn-when可以避免when-thenReturn调用真实对象api
        doReturn(999).when(spy).get(999);
        //预设size()期望值
        when(spy.size()).thenReturn(100);

        //3。调用真实对象的api
        spy.add(1);
        spy.add(2);
        assertEquals(100, spy.size());
        assertEquals(1, spy.get(0));
        assertEquals(2, spy.get(1));
        verify(spy).add(1);
        verify(spy).add(2);
        assertEquals(999, spy.get(999));
        spy.get(2);
    }

    /**
     * 真实的部分mock
     */
    @Test
    public void real_partial_mock() {
        //通过spy来调用真实的api
        List list = spy(new ArrayList());
        assertEquals(0, list.size());
        A a = mock(A.class);
        //通过thenCallRealMethod来调用真实的api
        when(a.doSomething(anyInt())).thenCallRealMethod();
        assertEquals(999, a.doSomething(999));
    }

    class A {
        public int doSomething(int i) {
            return i;
        }
    }

    /**
     * 重置mock
     */
    @Test
    public void reset_mock() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10);
        list.add(1);
        assertEquals(10, list.size());
        //重置mock，清除所有的互动和预设
        reset(list);
        assertEquals(0, list.size());
    }

    /**
     * 验证调用次数
     */
    @Test
    public void verifying_number_of_invocations() {
        List list = mock(List.class);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        //验证是否被调用一次，等效于下面的times(1)
        verify(list).add(1);
        verify(list, times(1)).add(1);
        //验证是否被调用2次
        verify(list, times(2)).add(2);
        //验证是否被调用3次
        verify(list, times(3)).add(3);
        //验证是否从未被调用过
        verify(list, never()).add(4);
        //验证至少调用一次
        verify(list, atLeastOnce()).add(1);
        //验证至少调用2次
        verify(list, atLeast(2)).add(2);
        //验证至多调用3次
        verify(list, atMost(3)).add(3);
    }

    /**
     * 验证连续调用
     */
    @Test(expected = RuntimeException.class)
    public void consecutive_calls() {
        List mockList = mock(List.class);
        //模拟连续调用返回期望值，如果分开，则只有最后一个有效
        when(mockList.get(0)).thenReturn(0);
        when(mockList.get(0)).thenReturn(1);
        when(mockList.get(0)).thenReturn(2);
        when(mockList.get(1)).thenReturn(0).thenReturn(1).thenThrow(new RuntimeException());
        assertEquals(2, mockList.get(0));
        assertEquals(2, mockList.get(0));
        assertEquals(0, mockList.get(1));
        assertEquals(1, mockList.get(1));
        //第三次或更多调用都会抛出异常
        mockList.get(1);
    }
}
