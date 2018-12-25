package cn.blz.design.parttern.creational.abstaractfactory;

public class PythonFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Atricle getAtricle() {
        return new PythonAtricle();
    }
}
