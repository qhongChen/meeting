package xin.qhongchen.meeting.util;

public class StringUtil {

    public static boolean isNullOrEmpty(String str) {

        return null == str || str.length() == 0;

    }

    public static boolean isNotNullOrEmpty(String str) {
        return !isNullOrEmpty(str);
    }
}
