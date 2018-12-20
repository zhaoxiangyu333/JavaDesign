package cn.blz.design.principle.demeter;

import java.util.Arrays;
import java.util.List;

public class B {

    public void count() {
        List<C> list = Arrays.asList(new C(),new C(),new C(),new C(),new C());
        System.out.println(list.size());
    }
}
