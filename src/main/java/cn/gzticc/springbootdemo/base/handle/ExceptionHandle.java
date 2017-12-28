package cn.gzticc.springbootdemo.base.handle;


import cn.gzticc.springbootdemo.base.enums.BaseEnum;
import cn.gzticc.springbootdemo.base.exception.BaseException;
import cn.gzticc.springbootdemo.base.pojo.BaseResult;
import cn.gzticc.springbootdemo.base.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理器
 * Created by Administrator on 2017/11/20.
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult handle(Exception e) {
        if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            return ResultUtils.baseResult(baseException.getCode(), baseException.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResultUtils.baseResult(BaseEnum.SYS_UNKNOWN_ERROR.getCode(), BaseEnum.SYS_UNKNOWN_ERROR.getMsg());
        }
    }
}
