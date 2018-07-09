package com.eureka.api.result;


/**
 * Rest鎺ュ彛浼犻�掔殑缁撴灉妯″瀷锛屼娇鐢ㄦ硾鍨嬨��<br>
 * 浼犻�掑垎椤靛櫒瀵硅薄
 * 
 * <p>鐩存帴浼犻�掓硾鍨嬪璞�</p>
 * 
 * @author masai
 * @version $Id: RestPaginatorResult.java, v 0.1 2017骞�5鏈�9鏃� 涓嬪崍3:57:45 masai Exp $
 */
public class RestPaginatorResult<T> {
    /** 澶勭悊缁撴灉 */
    private boolean      success;

    /** 杩斿洖鐮� */
    private String       code;

    /** 杩斿洖淇℃伅 */
    private String       message;

    /** 杩斿洖鏁版嵁 */
    private Paginator<T> data;

    /**
     * 鏋勯�犲嚱鏁�
     * 
     */
    public RestPaginatorResult() {

    }

    /**
     * 鏋勯�犲嚱鏁�
     * 
     * @param success 澶勭悊缁撴灉
     * @param code 杩斿洖鐮�
     * @param message 杩斿洖淇℃伅
     * @param data 杩斿洖鏁版嵁
     */
    public RestPaginatorResult(boolean success, String code, String message, Paginator<T> data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 鏋勯�犲嚱鏁帮紝鐢ㄦ潵鏋勯�犱竴涓繑鍥炲鐞嗘垚鍔熺殑瀵硅薄
     * 
     * @param data 杩斿洖鏁版嵁
     */
    public RestPaginatorResult(Paginator<T> data) {
        this.success = true;
        this.data = data;
    }

    /**
     * 鏋勯�犲嚱鏁帮紝鐢ㄦ潵鏋勯�犱竴涓繑鍥炲鐞嗗け璐ョ殑瀵硅薄
     * 
     * @param errorCode 杩斿洖閿欒鐮�
     * @param errorMessage 杩斿洖閿欒淇℃伅
     */
    public RestPaginatorResult(String errorCode, String errorMessage) {
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

    public Paginator<T> getData() {
        return data;
    }

    public void setData(Paginator<T> data) {
        this.data = data;
    }
}
