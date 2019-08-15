package com.amao.guava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.Comparator;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-09 16:58
 */
@RunWith(MockitoJUnitRunner.class)
public class ArgumentTest {

    @Mock
    private List mockList;

    @Test
    public void shorthand() {
        mockList.add(1);
        verify(mockList).add(1);
    }

    /**
     * 匹配制定参数
     */
    @Test
    public void with_arguments(){
        Comparable comparable = mock(Comparable.class);
        //预设根据不同的参数返回不同的结果
        when(comparable.compareTo("Test")).thenReturn(1);
        when(comparable.compareTo("Omg")).thenReturn(2);
        System.out.println(comparable.compareTo("Test"));
        assertEquals(1, comparable.compareTo("Test"));
        assertEquals(2, comparable.compareTo("Omg"));
        System.out.println(comparable.compareTo("Not stub"));
        //对于没有预设的情况会返回默认值
        assertEquals(0, comparable.compareTo("Not stub"));
    }

    /**
     * 匹配任意参数
     * argThat通过下面下面 extends 继承来实现对比
     */
//    @Test
//    public void with_unspecified_arguments(){
//        List list = mock(List.class);
//        //匹配任意参数
//        when(list.get(anyInt())).thenReturn(1);
//        when(list.contains(argThat(new IsValid()))).thenReturn(true);
//        System.out.println(list.get(2));
//        assertEquals(1, list.get(1));
//        assertEquals(1, list.get(999));
//        assertTrue(list.contains(1));
//        assertTrue(!list.contains(3));
//    }
//
//    private class IsValid implements ArgumentMatcher<List> {
//        @Override
//        public boolean matches(Object o) {
//            return o.equals(1) || o.equals(2);
//        }
//    }

    @Test
    public void all_arguments_provided_by_matchers(){
        Comparator comparator = mock(Comparator.class);
        comparator.compare("nihao","hello");
        //如果你使用了参数匹配，那么所有的参数都必须通过matchers来匹配
        verify(comparator).compare(anyString(),eq("hello"));
        //下面的为无效的参数匹配使用
        //verify(comparator).compare(anyString(),"hello");
    }

    /**
     * 使用方法预期回调接口生成期望值（Answer结构）
     */
    @Test
    public void answerTest(){
        when(mockList.get(anyInt())).thenAnswer(new CustomAnswer());
        assertEquals("hello world:0",mockList.get(0));
        assertEquals("hello world:999",mockList.get(999));
    }

    private class CustomAnswer implements Answer<String> {
        @Override
        public String answer(InvocationOnMock invocation) throws Throwable {
            Object[] args = invocation.getArguments();
            return "hello world:"+args[0];
        }
    }
}
