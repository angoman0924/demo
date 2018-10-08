package com.zacx.core.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.util.*;

public class HttpClient {

	private static final String CHARSET = "UTF-8";
	private static final String APPLICATION_JSON = "application/json";
	private static final String CONTENT_TYPE_TEXT_JSON = "application/x-www-form-urlencoded;charset=UTF-8";

	public static Map<String, Object> jsonPost(String url, Map<String, Object> params) {
		com.alibaba.fastjson.JSONObject json = new com.alibaba.fastjson.JSONObject(params);
		String reqStr = json.toJSONString();
		String respStr = post(url, reqStr);
		com.alibaba.fastjson.JSONObject resp = com.alibaba.fastjson.JSON.parseObject(respStr);
		return resp;
	}

	/**
	 * http post请求
	 * 
	 * @param url
	 *            请求地址
	 * @param params
	 *            请求参数
	 * @return
	 */
	public static String post(String url, Map<String, Object> params) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (Iterator<String> iterator = params.keySet().iterator(); iterator.hasNext();) {
				String key = iterator.next();
				parameters.add(new BasicNameValuePair(key, params.get(key).toString()));
			}
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(parameters, CHARSET);
			uefEntity.setContentType(CONTENT_TYPE_TEXT_JSON);
			httpPost.setEntity(uefEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	
	/** 
	 * @Description: 可以设置超时参数的post请求
	 * @param url
	 * @param params
	 * @param timeout
	 * @return
	 * @author: zivs.zheng
	 * @date: 2017年6月30日  下午1:19:47
	 */
	public static String post(String url, Map<String, Object> params, int timeout) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (Iterator<String> iterator = params.keySet().iterator(); iterator.hasNext();) {
				String key = iterator.next();
				parameters.add(new BasicNameValuePair(key, params.get(key).toString()));
			}
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(parameters, CHARSET);
			uefEntity.setContentType(CONTENT_TYPE_TEXT_JSON);
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeout).setConnectTimeout(timeout)
					.build();
			httpPost.setConfig(requestConfig);
			httpPost.setEntity(uefEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	/**
	 * http post请求
	 * 
	 * @param url
	 *            请求地址
	 * @param params
	 *            请求参数
	 * @return
	 */
	public static String post(String url, String params) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			StringEntity sEntity = new StringEntity(params, CHARSET);
			sEntity.setContentType(CONTENT_TYPE_TEXT_JSON);
			sEntity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
			httpPost.setEntity(sEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public static String get(String fullUrl) {
		return get(fullUrl, null);
	}
	
	public static String get(String fullUrl, int timeout) {
		return get(fullUrl, null,timeout);
	}

	public static String get(String fullUrl, Map<String, String> headerMap,int timeout) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(fullUrl);
			//设置请求查实时间
			RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout)
					.setConnectionRequestTimeout(timeout).setSocketTimeout(timeout).build();
			httpGet.setConfig(requestConfig);
			httpGet.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			if (headerMap != null && !headerMap.isEmpty()) {
				Set<String> keySet = headerMap.keySet();
				for (String key : keySet) {
					String value = headerMap.get(key);
					httpGet.addHeader(key, value);
				}
			}
			CloseableHttpResponse response = httpClient.execute(httpGet);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	public static String get(String fullUrl, Map<String, String> headerMap) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(fullUrl);
			httpGet.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
			if (headerMap != null && !headerMap.isEmpty()) {
				Set<String> keySet = headerMap.keySet();
				for (String key : keySet) {
					String value = headerMap.get(key);
					httpGet.addHeader(key, value);
				}
			}
			CloseableHttpResponse response = httpClient.execute(httpGet);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public static String getUrl(String url, String uri) {
		StringBuffer sb = new StringBuffer();
		sb.append(url);
		if (url.endsWith("/") && uri.startsWith("/")) {
			uri = uri.substring(1);
		} else if (!url.endsWith("/") && !uri.startsWith("/")) {
			sb.append("/");
		}
		sb.append(uri);
		return sb.toString();
	}

	public static void main(String[] args) {
		// String url = "http://api.emailfire.cn/api/createTask.action";
		// String username = "u-mail4";
		// String password = "QWE5678RasdF";
		// long timestamp = System.currentTimeMillis();
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("pid", "pid");
		// params.put("title", "api-tester-1");
		// params.put("timestamp", timestamp);
		// // params.put("sign", MD5.getMD5(sourceStr));
		//
		// String result = post(url, params);
		// System.out.println(result);

		Runnable r = new Runnable() {

			public void run() {
				long start = System.currentTimeMillis();
				for (int i = 0; i < 10000; i++) {
					long start2 = System.currentTimeMillis();
					HttpClient.get("https://crm.xiaoman.cn/generalTagRead/list?page=1&page_size=2000&type=1&_=1470990539960");
					System.out.println("hs:" + (System.currentTimeMillis() - start2) + "ms");
				}
				long end = System.currentTimeMillis();
				System.out.println("hs2:" + (end - start) + "ms");
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}

}
