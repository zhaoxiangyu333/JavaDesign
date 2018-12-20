package cn.blz.design.principle.dependencereversion;

/**
 * 依赖倒置原则
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setiCourse(new JavaCourse());
        person.studyCourse();
        person.setiCourse(new PythonCourse());
        person.studyCourse();
    }
}
