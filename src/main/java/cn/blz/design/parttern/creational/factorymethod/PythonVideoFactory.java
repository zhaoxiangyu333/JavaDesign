package cn.blz.design.parttern.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
