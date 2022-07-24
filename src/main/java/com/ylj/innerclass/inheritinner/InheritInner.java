package com.ylj.innerclass.inheritinner;

/**
 * @author : ylj
 * create at:  2022/5/21
 */
class WithInner {
    class Inner {

    }
}

public class InheritInner extends WithInner.Inner {
//    InheritInner() {}
    InheritInner(WithInner wi) {
        wi.super();
    }


}