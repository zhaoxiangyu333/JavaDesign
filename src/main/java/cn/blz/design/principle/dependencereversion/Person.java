package cn.blz.design.principle.dependencereversion;

public class Person {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        this.iCourse.studyCourse();
    }
}
