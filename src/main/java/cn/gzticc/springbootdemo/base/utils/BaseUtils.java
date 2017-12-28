package cn.gzticc.springbootdemo.base.utils;

import java.util.Collection;

/**
 * Created by Administrator on 2017/10/31.
 */
public class BaseUtils {
    private BaseUtils(){}
    public static boolean collectionIsEmpty(Collection collection){
        if(null == collection || 1 > collection.size()) {
            return true;
        }
        return false;
    }
}
