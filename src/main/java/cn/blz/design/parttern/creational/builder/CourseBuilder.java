package cn.blz.design.parttern.creational.builder;

public abstract class CourseBuilder {
    public abstract void builderName(String name);

    public abstract void builderPpt(String ppt);

    public abstract void builderVideo(String video);

    public abstract void builderArticle(String article);

    public abstract void builderQa(String qa);

    public abstract Course returnCourse();
}
