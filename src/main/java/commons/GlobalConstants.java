package commons;

import java.io.File;

public class GlobalConstants {
    public static final String ADMIN_LOGIN = "https://admin.longhaii.com/";

    public static String ACCOUNT = "adminqc";
    public static String PASSWORD = "admin@11";

    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String JAVA_VERSION = System.getProperty("java.version");

    public static final String REPORTNGSCREENSHOT = PROJECT_PATH + File.separator + "reportNGImages" + File.separator;

    public static final long SHOT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 10;

}
