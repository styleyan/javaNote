package com.isyxf.httpClientDemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaofei.yan
 * @Create 2019-08-25 21:56
 * @Descript 测试代理请求
 *
 * 参考地址: https://www.jianshu.com/p/375be5929bed
 */
public class Test {
    /**
     * 发送代理请求
     */
    public String sendProxy(JSONObject proxyInfo, String cookies, String url) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Connection", "keep-alive");
        httpPost.addHeader(new BasicHeader("Cookie", cookies));

        // 配置代理
        HttpHost proxy = new HttpHost(proxyInfo.getString("ip"), proxyInfo.getInteger("port"), "http");
        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
        httpPost.setConfig(config);

        // 请求参数
        Map<String, String> params = new HashMap<String, String>();
        params.put("account", "dh22281");
        params.put("password", "e074e4116509810fc82415a34151801a");
        params.put("sign", "【同盾科技】");
        params.put("phones", "18810218138");
        params.put("content", "这是个测试");

        EntityBuilder builder = EntityBuilder.create();
        builder.setContentType(ContentType.APPLICATION_JSON);
        builder.setContentEncoding("UTF-8");
        builder.setText(JSON.toJSONString(params));
        HttpEntity entityRequest = builder.build();
        httpPost.setEntity(entityRequest);


        // 设置认证
        CredentialsProvider provider = new BasicCredentialsProvider();
        provider.setCredentials(new AuthScope(proxy), new UsernamePasswordCredentials("yxf11", "23300"));
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCredentialsProvider(provider).build();

        try {
            // 发送请求
            CloseableHttpResponse response = httpClient.execute(httpPost);
            try {
                int code = response.getStatusLine().getStatusCode();
                System.out.println("返回的状态码:" + code);

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    return EntityUtils.toString(entity);
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /**
     * 获取代理信息
     * @return
     */
    public JSONObject getPrxyInfo() {
        CloseableHttpResponse response = null;
        Integer SUCCESS_CODE = 200;
        String taskId = RandomStringUtils.randomAlphanumeric(18);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://10.59.3.165:8088/octopus-proxy/api/v1/proxy" + "?app=octopus-box&taskId=" + taskId);

        try {
            response = httpClient.execute(get);
            if (response != null && response.getStatusLine().getStatusCode() == SUCCESS_CODE) {
                JSONObject content = JSON.parseObject(EntityUtils.toString(response.getEntity(),"UTF-8"));

                if (content.getLong("code") == 0) {
                    String[] strData = content.getJSONObject("data").getString("ip").split("-");
                    JSONObject result = new JSONObject();

                    result.put("ip", strData[0]);
                    result.put("port", strData[1]);

                    return result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();

                if(response != null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
