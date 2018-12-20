package cn.blz.design.principle.dependencereversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}
