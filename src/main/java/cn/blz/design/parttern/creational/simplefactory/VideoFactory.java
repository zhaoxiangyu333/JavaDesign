package cn.blz.design.parttern.creational.simplefactory;

public class VideoFactory {
    public Video product(String type) {
        if (type.equals("java")) {
            return new JavaVideo();
        } else if (type.equals("python")) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 反射
     */
    public Video productReflex(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
