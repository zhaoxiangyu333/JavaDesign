package cn.blz.design.principle.demeter;

/**
 * 迪米特原则
 */
public class Test {
    public static void main(String[] args) {
        new A().count(new B());
    }
}
