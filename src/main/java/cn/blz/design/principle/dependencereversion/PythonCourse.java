package cn.blz.design.principle.dependencereversion;

public class PythonCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
