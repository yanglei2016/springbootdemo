package com.yang.demo.exception;

import cn.hutool.json.JSONUtil;

/**
 * @
 * @Date: 2021-12-10 21:52
 */
public class ResultMsg {
    private String responseCode;
    private String responseMsg;
    private Object model;
    
    public ResultMsg(String responseCode, String responseMsg, Object model) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.model = JSONUtil.toJsonStr(model);
    }
    
    public static ResultMsg succ(Object model){
        return new ResultMsg(ResponseStatusEnum.RESP_SUCC.getCode(), ResponseStatusEnum.RESP_SUCC.getMsg(), model);
    }
    
    public static ResultMsg err(Object model){
        return new ResultMsg(ResponseStatusEnum.RESP_ERROR.getCode(), ResponseStatusEnum.RESP_ERROR.getMsg(), model);
    }
    
    public static ResultMsg error(Object model){
        return new ResultMsg(ResponseStatusEnum.RESP_ERROR.getCode(), ResponseStatusEnum.RESP_ERROR.getMsg(), model);
    }
    
    public String getResponseCode() {
        return responseCode;
    }
    
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    
    public String getResponseMsg() {
        return responseMsg;
    }
    
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
    
    public Object getModel() {
        return model;
    }
    
    public void setModel(Object model) {
        this.model = model;
    }
}
