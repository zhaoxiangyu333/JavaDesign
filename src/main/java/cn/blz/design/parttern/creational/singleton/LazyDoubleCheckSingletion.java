package cn.blz.design.parttern.creational.singleton;

/**
 * double check双重检查
 *
 * @author blz
 */
public class LazyDoubleCheckSingletion {
    private volatile static LazyDoubleCheckSingletion lazyDoubleCheckSingletion = null;

    private LazyDoubleCheckSingletion() {

    }

    public static LazyDoubleCheckSingletion getInstance() {
        if (lazyDoubleCheckSingletion == null) {
            synchronized (LazyDoubleCheckSingletion.class) {
                if (lazyDoubleCheckSingletion == null) {
                    lazyDoubleCheckSingletion = new LazyDoubleCheckSingletion();
                }
            }
        }
        return lazyDoubleCheckSingletion;
    }
}
