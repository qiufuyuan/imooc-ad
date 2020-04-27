package com.imooc.ad.advice;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理
*@Author  wanbao
*@Date 2020/4/27 16:43
*/
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerException(HttpServletRequest request, AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,"error");
        response.setData(ex.getMessage());
        return response;
    }
}
