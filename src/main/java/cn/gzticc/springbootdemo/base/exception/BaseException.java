package cn.gzticc.springbootdemo.base.exception;


import cn.gzticc.springbootdemo.base.enums.BaseEnum;

/**
 * 自定义异常
 * Created by Administrator on 2017/11/20.
 */
public class BaseException extends RuntimeException{
    private Integer code;

    public BaseException(BaseEnum baseEnum) {
        super(baseEnum.getMsg());
        this.code = baseEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
