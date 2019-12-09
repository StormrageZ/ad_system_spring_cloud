package edu.whut.ad.exception;

import edu.whut.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lancer
 * @date 2019/12/9 15:28
 **/
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,"message error");
        return response;
    }
}
