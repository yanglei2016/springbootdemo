package com.yang.demo.controller;

import cn.hutool.json.JSONUtil;
import com.yang.demo.exception.ResultMsg;
import com.yang.demo.util.ValidatorUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @
 * @Date: 2021-12-10 19:47
 */
@RestController
public class UserController {
    
    @RequestMapping("/query")
    public ResultMsg queryUser(@RequestBody @Validated RequestParam requestParam){
        //ValidatorUtils.validateEntity(requestParam);
        
        System.out.println("(requestParam) = " + JSONUtil.toJsonStr(requestParam));
        
        return ResultMsg.error("error");
    }
    
    @RequestMapping("/query1")
    public ResultMsg queryUser1(@RequestBody @Validated RequestParam requestParam){
        //ValidatorUtils.validateEntity(requestParam);
        
        System.out.println("(requestParam) = " + JSONUtil.toJsonStr(requestParam));
        
        return ResultMsg.error("error");
    }
    
}
