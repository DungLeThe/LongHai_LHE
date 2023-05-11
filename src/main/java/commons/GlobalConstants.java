package commons;

import java.io.File;

public class GlobalConstants {
    public static final String ADMIN_LOGIN = "https://admin.longhaii.com/";
    public static final String NPP_LOGIN = "https://npp.longhaii.com/";
    public static String ACCOUNT = "adminqc";
    public static String PASSWORD = "admin@11";
    public static String NPP_ACCOUNT ="npp.lhe";
    public static String NPP_PASSWORD ="lhe@1234";
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String REPORT_NG_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGImages" + File.separator;
    public static final int SHORT_TIMEOUT = 1;
    public static final int THREE_SECONDS = 3;
    public static final long LONG_TIMEOUT = 20;
}
