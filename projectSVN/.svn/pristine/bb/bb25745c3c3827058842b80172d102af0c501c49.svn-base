package com.zacx.core.util;


import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.springframework.web.multipart.MultipartFile;

/**
 * @classDesc: 功能描述:(httpClient工具类)
 * @author: 高媛惠
 * @createTime 2017年11月28日 13:29
 * @version: v1.0
 * @copyright:
 */

public class HttpClientUtils {

    public static CloseableHttpClient initHttpClient(boolean isHttps) {

        RequestConfig globalConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT)
                //设置请求和传输超时时间
                .setConnectTimeout(5000).setConnectionRequestTimeout(3000).setSocketTimeout(5000)
                .build();

        HttpClientBuilder httpClientBuilder = HttpClients.custom()
                .setDefaultRequestConfig(globalConfig);

        if (isHttps) {
            SSLConnectionSocketFactory sslsf = null;
            try {
                SSLContext sslContext = new org.apache.http.ssl.SSLContextBuilder()
                        .loadTrustMaterial(null, new TrustStrategy() {
                            //信任所有证书
                            public boolean isTrusted(X509Certificate[] chain,
                                                     String authType) throws CertificateException {
                                return true;
                            }
                        }).build();
                //跳过证书Hostname验证
                sslsf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
            } catch (KeyManagementException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (KeyStoreException e) {
                e.printStackTrace();
            }

            httpClientBuilder.setSSLSocketFactory(sslsf);
        }

        return httpClientBuilder.build();

    }

//    public static void main(String arg[]) throws Exception {
//    	String url = "http://118.178.152.110/zmvis";
//        JSONObject params = new JSONObject();
//        params.put("sign", "90965479E6004B428FB8D8395A4CD4C0");
//        params.put("phone", "18516503482");
//        params.put("busicode", "75000");
//        params.put("mercode", "20170328000001");
//        params.put("reqtime", "20170406113922");
//        params.put("name", "陈泽昊");
//        params.put("certid", "320923199008085790");
//
//        String ret = doPost(url, params,false).toString();
//        //System.out.println(ret);
//    }

    /**
     * POST提交name=[value|file] 请求
     *
     * @param url
     * @param textParams
     * @param fileParams
     * @param isHttps
     * @param charset
     * @return
     * @author zhaoyun
     */
//    public static StatusEntityPair doPostMultipart(String url, Map<String, String> textParams, Map<String, MultipartFile> fileParams, boolean isHttps, String charset) {
//        StatusEntityPair statusEntityPair = new StatusEntityPair();
//
//        boolean isMultipart = false;
//        if (fileParams != null && !fileParams.isEmpty()) {
//            for (MultipartFile multipartFile : fileParams.values()) {
//                if (multipartFile != null && !multipartFile.isEmpty()) {
//                    isMultipart = true;
//                    break;
//                }
//            }
//        }
//        if (!isMultipart) {
//            statusEntityPair.setEntity(doPostNameValue(url, textParams, isHttps, charset));
//            if (!TextUtils.isEmpty(statusEntityPair.getEntity())) {
//                statusEntityPair.setStatusCode(HttpStatus.SC_OK);
//            }
//            return statusEntityPair;
//        }
//
//        CloseableHttpClient closeableClient = initHttpClient(isHttps);
//        CloseableHttpResponse closeableClientResponse = null;
//        HttpPost post = new HttpPost(url);
//
//        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
//        //先录入textParams
//        for (String s : textParams.keySet()) {
//            multipartEntityBuilder.addTextBody(s, textParams.get(s) == null ? "" : textParams.get(s), ContentType.create("text/plain", charset));
//        }
//        //再录入fileParams
//        for (String s : fileParams.keySet()) {
//            MultipartFile multipartFile;
//            if ((multipartFile = fileParams.get(s)) != null && !multipartFile.isEmpty()) {
//                try {
//                    multipartEntityBuilder.addBinaryBody(s, multipartFile.getBytes(), ContentType.create(multipartFile.getContentType()), charset);
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        }
//        try {
//            HttpEntity requestEntity = multipartEntityBuilder.build();
//            post.setEntity(requestEntity);
//            //发起请求 返回响应
//            closeableClientResponse = closeableClient.execute(post);//自动销毁InputStream的HttpResponse
//            statusEntityPair.setStatusCode(closeableClientResponse.getStatusLine().getStatusCode());
//            HttpEntity responseEntity = closeableClientResponse.getEntity();
//            String strResponse = (responseEntity == null ? "" : EntityUtils.toString(responseEntity, "UTF-8"));
//            statusEntityPair.setEntity(strResponse);
//            // 销毁closeable的response
//            if (responseEntity != null) {
//                EntityUtils.consume(responseEntity);
//            }
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        } finally {
//            try {
//                if (closeableClientResponse != null) {
//                    closeableClientResponse.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (closeableClient != null) {
//                    closeableClient.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return statusEntityPair;
//        }
//    }

    /**
     * POST提交name value 请求
     *
     * @param url
     * @param params
     * @param isHttps
     * @param charset
     * @return
     */

    public static String doPostNameValue(String url, Map<String, String> params, boolean isHttps, String charset) {

        CloseableHttpClient client = initHttpClient(isHttps);
        HttpPost post = new HttpPost(url);
        String response = "";
        try {
            List<BasicNameValuePair> reqparams = new ArrayList<BasicNameValuePair>();
            Set<String> keys = params.keySet();
            for (String key : keys) {
                reqparams.add(new BasicNameValuePair(key, params.get(key)));
            }
            if (reqparams.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(reqparams, charset);
                post.setEntity(entity);
            }
            HttpResponse res = client.execute(post);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                response = EntityUtils.toString(res.getEntity());// 返回json格式：
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    /**
     * httpClient的get请求方式2
     *
     * @return
     * @throws Exception
     */
    public static String doGet(String url, String charset)
            throws Exception {
        /*
         * 使用 GetMethod 来访问一个 URL 对应的网页,实现步骤: 1:生成一个 HttpClinet 对象并设置相应的参数。
		 * 2:生成一个 GetMethod 对象并设置响应的参数。 3:用 HttpClinet 生成的对象来执行 GetMethod 生成的Get
		 * 方法。 4:处理响应状态码。 5:若响应正常，处理 HTTP 响应内容。 6:释放连接。
		 */
        /* 1 生成 HttpClinet 对象并设置参数 */
        HttpClient httpClient = new HttpClient();
        // 设置 Http 连接超时为5秒
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
        /* 2 生成 GetMethod 对象并设置参数 */
        GetMethod getMethod = new GetMethod(url);
        // 设置 get 请求超时为 5 秒
        getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
        // 设置请求重试处理，用的是默认的重试处理：请求三次
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
        String response = "";
        /* 3 执行 HTTP GET 请求 */
        try {
            int statusCode = httpClient.executeMethod(getMethod);
            /* 4 判断访问的状态码 */
            if (statusCode != HttpStatus.SC_OK) {
                //System.err.println("请求出错: " + getMethod.getStatusLine());
            }
            /* 5 处理 HTTP 响应内容 */
            // HTTP响应头部信息，这里简单打印
            Header[] headers = getMethod.getResponseHeaders();
            for (Header h : headers)
                System.out.println(h.getName() + "------------ " + h.getValue());
            // 读取 HTTP 响应内容，这里简单打印网页内容
            byte[] responseBody = getMethod.getResponseBody();// 读取为字节数组
            response = new String(responseBody, charset);
            //System.out.println("----------response:" + response);
            // 读取为 InputStream，在网页内容数据量大时候推荐使用
            // InputStream response = getMethod.getResponseBodyAsStream();
        } catch (HttpException e) {
            // 发生致命的异常，可能是协议不对或者返回的内容有问题
            //System.out.println("请检查输入的URL!");
            e.printStackTrace();
        } catch (IOException e) {
            // 发生网络异常
            //System.out.println("发生网络异常!");
            e.printStackTrace();
        } finally {
            /* 6 .释放连接 */
            getMethod.releaseConnection();
        }
        return response;
    }


    public static String doGet(String url, boolean isHttps)
            throws Exception {
       CloseableHttpClient client = initHttpClient(isHttps);
        /* 2 生成 GetMethod 对象并设置参数 */
        String response = "";
        try {
        	HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse res = client.execute(httpget);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                response = EntityUtils.toString(res.getEntity());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }


    /**
     * @param url
     * @param json
     * @param isHttps
     * @methodDesc: 功能描述:(post请求)
     * @author: 高媛惠
     * @createTime 2017年11月29日 9:56
     * @returnType java.lang.String
     * @copyright:
     */
    public static String doPost(String url, String json, boolean isHttps) {

        CloseableHttpClient client = initHttpClient(isHttps);
        HttpPost post = new HttpPost(url);
        String result = null;
        try {
            if (json != null && !"".equals(json)) {
                StringEntity s = new StringEntity(json, "UTF-8");
                s.setContentEncoding("UTF-8");
                s.setContentType("application/json");//发送json数据需要设置contentType
                post.setEntity(s);
            }
            HttpResponse res = client.execute(post);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(res.getEntity());// 返回json字符串格式：
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    /**
     * @param url
     * @param json json字符串
     * @return String
     * @methodDesc: 功能描述:(doPostJson)
     * @author: 王利铭
     * @createTime:2017年7月12日 上午9:51:57
     * @copyright:
     */
    public static String doPostJson(String url, String json) {
        boolean isHttps = url.startsWith("https://");

        // 创建Httpclient对象  
        CloseableHttpClient httpClient = initHttpClient(isHttps);
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求  
            HttpPost httpPost = new HttpPost(url);
            // 创建请求内容  
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求  
            response = httpClient.execute(httpPost);

            // 判断返回状态是否为200  
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }


    public static class StatusEntityPair {
        private int statusCode;
        private String entity;

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public String getEntity() {
            return entity;
        }

        public void setEntity(String entity) {
            this.entity = entity;
        }
    }

    /**
     * 发送post请求 json数据格式
     *
     * @param jsonParmsString
     * @param url
     * @return
     */
    public static String doPostByJson(String jsonParmsString, String url) {
        CloseableHttpResponse response = null;
        String info = null;
        CloseableHttpClient httpClient = null;
        httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost(url);
        // todo
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000).build();//设置请求和传输超时时间
//        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(2000).setConnectionRequestTimeout(5000).setSocketTimeout(2000).build();
        postMethod.addHeader("Content-type", "application/json; charset=utf-8");
        postMethod.setHeader("Accept", "application/json");
        postMethod.setConfig(requestConfig);
        postMethod.setEntity(new StringEntity(jsonParmsString, Charset.forName("UTF-8")));
        try {
            response = httpClient.execute(postMethod);
            System.out.println("HttpClientUtils.doPost, response:" + response);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                info = EntityUtils.toString(entity, "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return info;
    }
}
