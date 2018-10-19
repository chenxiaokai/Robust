package com.meituan.robust.patch;

/**
 * Created by mivanzhang on 16/12/9.
 */

/*
上面的Modify注解并没有完美的标记所有的方法，这是因为在泛型、匿名内部类等问题上，注解会由于泛型的擦除等问题，
会产生移动（我称之为注解的漂移），感兴趣的可以自己写一个泛型的方法，使用命令javac -p -v +your.class查看一下泛型和匿名内部类到底是如何实现的，
RobustModify这个类就是为了解决注解移动的问题，在这个类中有一个方法modify，针对泛型、匿名内部类等需要在泛型方法里面使用RobustModify.modify();
来标注需要打入补丁中的方法。
 */

public final class RobustModify {
    public static final void modify() {

    }
}
