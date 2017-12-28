package cn.gzticc.springbootdemo.base.utils;

import com.google.gson.Gson;


public class GsonUtils {
    private GsonUtils(){}
    public static String objToJsonStr(Object o){
        Gson gson = new Gson();
        return gson.toJson(o);
    }
}
