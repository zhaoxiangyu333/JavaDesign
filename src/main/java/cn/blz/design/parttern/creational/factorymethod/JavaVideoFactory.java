package cn.blz.design.parttern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
