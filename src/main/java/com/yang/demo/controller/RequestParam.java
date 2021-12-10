package com.yang.demo.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @
 * @Date: 2021-12-09 23:32
 */
public class RequestParam {
    
    @NotNull(message = "param1不能为空")
    private String param1;
    
    @NotEmpty(message = "param2不能为空")
    private String param2;
    
    @NotBlank(message = "param3不能为空")
    private String param3;
    
    public String getParam1() {
        return param1;
    }
    
    public void setParam1(String param1) {
        this.param1 = param1;
    }
    
    public String getParam2() {
        return param2;
    }
    
    public void setParam2(String param2) {
        this.param2 = param2;
    }
    
    public String getParam3() {
        return param3;
    }
    
    public void setParam3(String param3) {
        this.param3 = param3;
    }
}
