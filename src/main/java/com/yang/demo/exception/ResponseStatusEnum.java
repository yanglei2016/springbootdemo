package com.yang.demo.exception;

/**
 * @
 * @Date: 2021-12-10 21:58
 */
public enum ResponseStatusEnum {
    RESP_SUCC("0000", "成功"),
    RESP_ERROR("9999", "失败");
    
    private String code;
    private String msg;
    
    ResponseStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
