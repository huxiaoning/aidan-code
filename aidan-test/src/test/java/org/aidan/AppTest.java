package org.aidan;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 测试日期加减
     */
    @Test
    public void test1() {
        Date begin = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(begin);
        calendar.add(Calendar.HOUR_OF_DAY, 2);
        Date end = calendar.getTime();
        System.out.println(begin);
        System.out.println(end);
    }

    /**
     * 测试okHttp
     */
    @Test
    public void test2() {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "mobile=341458&type=INTERNAL_TAKE");
        Request request = new Request.Builder()
                .url("")
                .post(body)
                .addHeader("content-type", "application/x-www-form-urlencoded")
//                .addHeader("cache-control", "no-cache")
//                .addHeader("postman-token", "e0fb911c-dcf3-4d4b-b95e-2260d3582933")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 测试 httpclient
     */

    @Test
    public void test3() throws IOException {
        String body = "";
        String url = "";
        String encoding = "UTF-8";
        Map<String,String> map = new HashMap<>();
        map.put("mobile","341458");
        map.put("type","INTERNAL_TAKE");

        //创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //创建post方式请求对象
        HttpPost httpPost = new HttpPost(url);

        //装填参数
        List<NameValuePair> nvps = new ArrayList<>();
        if(map!=null){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        //设置参数到请求对象中
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));

        System.out.println("请求地址："+url);
        System.out.println("请求参数："+nvps.toString());

        //设置header信息
        //指定报文头【Content-type】、【User-Agent】
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
//        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //执行请求操作，并拿到结果（同步阻塞）
        CloseableHttpResponse response = client.execute(httpPost);
        //获取结果实体
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            //按指定编码转换结果实体为String类型
            body = EntityUtils.toString(entity, encoding);
        }
        EntityUtils.consume(entity);
        //释放链接
        response.close();

        System.out.println(body);
    }
}
