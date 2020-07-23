package helpers;

public class Enviroment {
    public final static String
            remoteDriverUrl = System.getProperty("remote_driver_url"), // http://autotest.su:4444/wd/hub/
            videoStorageUrl = System.getProperty("video_storage_url"); // http://autotest.su:8080/#/video/
}