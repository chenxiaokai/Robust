package com.meituan.robust;

/**
 * Created by c_kunwu on 16/5/10.
 */

//这个接口在上面的代码结构中出现的频率比较高，我们在代码中插入的字段就是这个接口，同时这个接口也是xxcontrol的实现接口，这个接口包含了两个方法:
public interface ChangeQuickRedirect {

    //在自动化补丁中这是对补丁方法的转发。
    Object accessDispatch(String methodName, Object[] paramArrayOfObject);

    //方法isSupport是用来判断方法是否需要被替换
    boolean isSupport(String methodName, Object[] paramArrayOfObject);
}
