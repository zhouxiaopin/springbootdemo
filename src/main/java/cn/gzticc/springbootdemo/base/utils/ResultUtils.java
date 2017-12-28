package cn.gzticc.springbootdemo.base.utils;


import cn.gzticc.springbootdemo.base.enums.BaseEnum;
import cn.gzticc.springbootdemo.base.pojo.BaseResult;

/**
 * 返回对象工具类
 * Created by Administrator on 2017/11/20.
 */
public class ResultUtils {
    private ResultUtils(){}

    public static BaseResult baseResult(Integer code, String msg){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(code);
        baseResult.setMsg(msg);
        return baseResult;
    }
    public static BaseResult baseResult(BaseEnum baseEnum){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(baseEnum.getCode());
        baseResult.setMsg(baseEnum.getMsg());
        return baseResult;
    }
}
