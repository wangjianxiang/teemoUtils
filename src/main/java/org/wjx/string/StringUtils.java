package org.wjx.string;

/**
 * String 工具类
 */
public class StringUtils {

    /**
     * 字符串是否是空串
     *
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        if (value == null || value.trim().length() < 1) {
            return true;
        }
        return false;
    }

    /**
     * 字符串是否不为空串
     *
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value) {
        return !StringUtils.isEmpty(value);
    }

}
