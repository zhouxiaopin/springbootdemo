package cn.gzticc.springbootdemo.base.pojo;


import cn.gzticc.springbootdemo.base.constant.BaseConstant;

/**
 * 基本返回实体类
 */
public class BaseResult {
    private boolean status = true;
    private int code = BaseConstant.SUCCESS_CODE;
    private String msg = BaseConstant.SUCCESS_MSG;

    public void setCode(int code) {
        this.code = code;
        this.status = BaseConstant.SUCCESS_CODE <= code ? true : false;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "status=" + status +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
