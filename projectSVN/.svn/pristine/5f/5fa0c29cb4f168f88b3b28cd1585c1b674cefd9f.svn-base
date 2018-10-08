package com.zacx.serivce.basic.util;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.zacx.core.util.HttpClientUtils;
import com.zacx.core.util.MD5Utils;
import lombok.extern.slf4j.Slf4j;

//import com.baidubce.auth.DefaultBceCredentials;
//import com.baidubce.services.smsv3.SmsClient;
//import com.baidubce.services.smsv3.SmsClientConfiguration;
//import com.baidubce.services.smsv3.model.SendMessageV3Request;
//import com.baidubce.services.smsv3.model.SendMessageV3Response;

/** 
 * @Description: 
 * @author: jizhuolin
 * @date: 2017年5月4日
 */
@Slf4j
public class SmsUtil {
	private final static String URL = "http://www.dh3t.com/json/sms/Submit";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    private static final String ACCESS_KEY_ID = "LTAILW0X8MvOymZb";
    private static final String ACCESS_KEY_SECRET = "G73DxWt9ToDGRRlIYWoKMB2ShivaXO";
    private static final String ALIYUN_SMS_SIGN = "拜米出行";


    /**
     * 构建大三通短信请求必须数据
     *
     * @param phones
     * @param content
     * @return
     */
    private static String createSmsData(String phones, String content) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("account", "dh84671");
        jsonObject.put("password", MD5Utils.MD5Encode("2CGoN8p1"));
        jsonObject.put("subcode", "35731");
        jsonObject.put("phones", phones);
        jsonObject.put("content", content);
        jsonObject.put("sign", "【出行】");
        jsonObject.put("sendtime", "");
        jsonObject.put("msgid", "");
        return jsonObject.toJSONString();
    }
    /**
     * http发送验证码
     *
     * @param phones
     * @param content
     * @return
     * @throws Exception
     */
    public static boolean sendSms(String phones, String content) throws Exception {
        String data = createSmsData(phones, content);
        String result = HttpClientUtils.doPostByJson(data, URL);
        log.info("sendSms:"+result);
        if (result.indexOf("result\":\"0") != -1) {
            return true;
        }
        return false;
    }



    /**
     * Aliyun发送短信
     *
     * @param phones
     * @return
     * @throws Exception
     */
    public static boolean sendSmsAliyun(String phones,String msg, String templateCode) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", msg);
        boolean r = sendSmsAliyunObject(phones, jsonObject, templateCode);
        return r;
    }

    /**
     * 发送异常预警短信提示
     * @param phones
     * @param msg
     * @return
     */
    public static boolean sendExceptionWarning(String phones,String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", msg);
        return sendSmsAliyunObject(phones,jsonObject,"SMS_138073670");
    }

    public static boolean sendSmsAliyunObject(String phones, JSONObject jsonObject, String templateCode) {
        //产品名称:云通信短信API产品,开发者无需替换
        String product = "Dysmsapi";
        //产品域名,开发者无需替换
        String domain = "dysmsapi.aliyuncs.com";

        try {
            String paramString = jsonObject.toJSONString();

            //可自助调整超时时间
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");

            //初始化acsClient,暂不支持region化
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", ACCESS_KEY_ID, ACCESS_KEY_SECRET);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);

            //组装请求对象-具体描述见控制台-文档部分内容
            SendSmsRequest request = new SendSmsRequest();
            //必填:待发送手机号
            request.setPhoneNumbers(phones);
            //必填:短信签名-可在短信控制台中找到
            request.setSignName(ALIYUN_SMS_SIGN);
            //必填:短信模板-可在短信控制台中找到
            request.setTemplateCode(templateCode);
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            request.setTemplateParam(paramString);

            //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
            //request.setSmsUpExtendCode("90997");

            //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
            //request.setOutId("yourOutId");

            //hint 此处可能会抛出异常，注意catch
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            log.info("httpResponse{}", phones, sendSmsResponse);
            if("OK".equals(sendSmsResponse.getCode())){
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("task.sendSmsAliyun error:" + e.getMessage());
            return false;
        }
    }
    
    /**
     * @Description: 通过百度发送短信
     * @author: litao
     * @date: 2017年12月15日  下午3:54:24
     */
    public static boolean sendSmsByBaidu(String mobile, String msg, String template) {
    	try {
    	    return true;

//			String ACCESS_KEY_ID = "9b852c1855ef4f5d8e219addd17dbb3e"; //  ak
//			String SECRET_ACCESS_KEY = "ee2f248c4bc047bc94ef72f0bd7b9d31"; // sk
//
//			SmsClientConfiguration config = new SmsClientConfiguration();
//			config.setCredentials(new DefaultBceCredentials(ACCESS_KEY_ID, SECRET_ACCESS_KEY));
//			SmsClient smsClient = new SmsClient(config);
//			String type = "normal";
//			String sign = "拜米电单车";
//			Map<String, String> vars = new HashMap<String, String>(); // 若模板内容为：${content}
//			vars.put("code", msg);

//			//实例化请求对象
//			SendMessageV3Request request = new SendMessageV3Request();
//			request.withMobile(mobile)
//			.withTemplate(template)
//			.withSign(sign)
//			.withType(type)
//			.withContentVar(vars);
//			// 发送请求
//			SendMessageV3Response response = smsClient.sendMessage(request);
//
//			// 解析请求响应 response.isSuccess()为true 表示成功
//			if (response != null && response.isSuccess()) {
//				return true;
//			} else {
//				log.warn("sendSmsBaidu faile, mobile:{}, msg:{}, template:{}", mobile, msg, template);
//				return false;
//			}
		} catch (Exception e) {
			log.error("ERROR sendSmsBaidu faile, mobile:{}, msg:{}, template:{}, e:{}", mobile, msg, template, e);
			return false;
		}
		//return false;
	}
    
    public static void main(String[] args) {
//    	String code = CodeUtil.code2();
    	/*try {
			Boolean r = sendSms("TODO手机号", "jj");
			System.out.println(r);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

        sendSmsAliyun("TODO手机号", "123456", "SMS_128580053");


//    	sendSmsAliyun("TODO手机号", "45", "SMS_69205451");
    	//sendSmsByBaidu("TODO手机号", "1234", "smsTpl:a5bbb860-321e-4585-b93f-b2b421707372");
	}
	
}
