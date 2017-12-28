package cn.gzticc.springbootdemo.base.utils;

/**
 * Created by Administrator on 2017/9/22.
 */
public class StringUtils {
    private StringUtils(){}
    public static boolean isEmpty(String s){
        if(null == s || 0 >= s.length()) {
            return true;
        }
        return false;
    }
}
