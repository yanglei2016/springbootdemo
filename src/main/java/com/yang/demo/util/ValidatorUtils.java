package com.yang.demo.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @
 * @Date: 2021-12-10 21:15
 */
public class ValidatorUtils {
    
    private static Validator validator;
    
    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
    
    public static void validateEntity(Object object, Class<?>... groups){
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(object, groups);
        
        if(!constraintViolationSet.isEmpty()){
            constraintViolationSet.forEach(e -> {
                throw new RuntimeException("400:" + e.getMessage());
            });
        }
        
    }
    
}
