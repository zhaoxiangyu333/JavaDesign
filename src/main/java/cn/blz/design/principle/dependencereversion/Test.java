package cn.blz.design.principle.dependencereversion;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setiCourse(new JavaCourse());
        person.studyCourse();
        person.setiCourse(new PythonCourse());
        person.studyCourse();
    }
}
