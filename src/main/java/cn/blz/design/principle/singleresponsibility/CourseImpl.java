package cn.blz.design.principle.singleresponsibility;

public class CourseImpl implements ICourseContext,ICourseManager {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public byte[] getVideo() {
        return new byte[0];
    }

    @Override
    public void buyCourse() {

    }

    @Override
    public void returnCourse() {

    }
}
