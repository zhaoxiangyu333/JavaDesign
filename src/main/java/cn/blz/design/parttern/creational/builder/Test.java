package cn.blz.design.parttern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilderImp courseBuilderImp = new CourseBuilderImp();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilderImp);
        Course course = coach.makeCourse("1", "2", "3", "4", "5");
        System.out.println(course);
    }
}
