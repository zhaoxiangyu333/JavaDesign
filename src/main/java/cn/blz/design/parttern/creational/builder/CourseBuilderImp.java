package cn.blz.design.parttern.creational.builder;

public class CourseBuilderImp extends CourseBuilder {
    private Course c = new Course();

    @Override
    public void builderName(String name) {
        c.setName(name);
    }

    @Override
    public void builderPpt(String ppt) {
        c.setPpt(ppt);
    }

    @Override
    public void builderVideo(String video) {
        c.setVideo(video);
    }

    @Override
    public void builderArticle(String article) {
        c.setArticle(article);
    }

    @Override
    public void builderQa(String qa) {
        c.setQa(qa);
    }

    @Override
    public Course returnCourse() {
        return c;
    }
}
