package cn.blz.design.parttern.creational.singleton.lazy;

/**
 * 懒汉式多线程Debug
 * @author blz
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton ==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
