package org.aidan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String str = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxe287a02bc46eb010&redirect_uri=https://owstest.deppon.com/testenv/2/wechat/www/index.html%23/send&response_type=code&scope=snsapi_userinfo&state=预约寄件#wechat_redirect";
        String regex = "state=(.+)#wechat_redirect";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
