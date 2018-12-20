package cn.blz.design.principle.openclose;

/**
 * 开闭原则,接口类尽量不修改
 */
public interface ICourse {
    Integer id();
    String getName();
    Double getPrice();
}
