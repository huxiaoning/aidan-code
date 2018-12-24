package org.aidan.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * @author Aidan
 * @创建时间：2018/11/26 3:19 PM
 * @描述: UuidUtil
 */
public class UuidUtil {

    public static String generateUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        String[] s = new String[]{"1", "2", "3"};
        String join = StringUtils.join(s, "-");
        System.out.println(join);
    }
}
