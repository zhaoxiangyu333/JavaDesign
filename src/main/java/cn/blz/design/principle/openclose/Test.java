package cn.blz.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"测试课程1",100d);
        System.out.println("原价："+((JavaDiscountCourse) iCourse).getOriginalPrice());
    }
}
