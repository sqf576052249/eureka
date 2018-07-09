package com.eureka.api.result;


import java.util.List;

/**
 * Rest鎺ュ彛浼犻�掔殑缁撴灉妯″瀷锛屼娇鐢ㄦ硾鍨嬨��<br>
 * 浼犻�掓暟缁勫璞�
 * 
 * <p>鐩存帴浼犻�掓硾鍨嬪璞�</p>
 * 
 * @author masai
 * @version $Id: RestArrayResult.java, v 0.1 2017骞�5鏈�9鏃� 涓嬪崍2:57:46 masai Exp $
 */
public class RestArrayResult<T> {
    /** 澶勭悊缁撴灉 */
    private boolean success;

    /** 杩斿洖鐮� */
    private String  code;

    /** 杩斿洖淇℃伅 */
    private String  message;

    /** 杩斿洖鏁版嵁 */
    private List<T> data;

    /**
     * 鏋勯�犲嚱鏁�
     * 
     */
    public RestArrayResult() {

    }

    /**
     * 鏋勯�犲嚱鏁�
     * 
     * @param success 澶勭悊缁撴灉
     * @param code 杩斿洖鐮�
     * @param message 杩斿洖淇℃伅
     * @param data 杩斿洖鏁版嵁鍒楄〃
     */
    public RestArrayResult(boolean success, String code, String message, List<T> data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 鏋勯�犲嚱鏁帮紝鐢ㄦ潵鏋勯�犱竴涓繑鍥炲鐞嗘垚鍔熺殑瀵硅薄
     * 
     * @param data 杩斿洖鏁版嵁鍒楄〃
     */
    public RestArrayResult(List<T> data) {
        this.success = true;
        this.data = data;
    }

    /**
     * 鏋勯�犲嚱鏁帮紝鐢ㄦ潵鏋勯�犱竴涓繑鍥炲鐞嗗け璐ョ殑瀵硅薄
     * 
     * @param errorCode 杩斿洖閿欒鐮�
     * @param errorMessage 杩斿洖閿欒淇℃伅
     */
    public RestArrayResult(String errorCode, String errorMessage) {
        this.success = false;
        this.code = errorCode;
        this.message = errorMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * 鍒ゆ柇杩斿洖缁撴灉鏄惁涓虹┖鏁扮粍
     * 
     * @param result
     * @return
     */
    public static boolean isNotEmpty(RestArrayResult result) {
        return result != null && result.isSuccess()
               && (result.data != null && result.data.size() > 0);
    }

    /**
     * 鍒ゆ柇杩斿洖缁撴灉鏄惁涓虹┖鏁扮粍
     * 
     * @param result
     * @return
     */
    public static boolean isEmpty(RestArrayResult result) {
        return !isNotEmpty(result);
    }
}
