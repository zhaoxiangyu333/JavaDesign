package cn.blz.design.principle.demeter;

public class A {
    public void count(B b){
        b.count();
    }
}
