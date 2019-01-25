package cn.blz.design.parttern.creational.singleton.lazy;

/**
 * @author blz
 */
public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
       Thread t1 = new Thread(new MyThread());
       Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("exit 0");
    }
}
