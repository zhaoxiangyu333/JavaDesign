package cn.blz.design.parttern.creational.builder;

import lombok.Data;

@Data
public class Coach {
    private CourseBuilder courseBuilder;

    public Course makeCourse(String name, String ppt, String video, String article, String qa) {
        this.courseBuilder.builderName(name);
        this.courseBuilder.builderPpt(ppt);
        this.courseBuilder.builderVideo(video);
        this.courseBuilder.builderArticle(article);
        this.courseBuilder.builderQa(qa);

        return this.courseBuilder.returnCourse();
    }

}
