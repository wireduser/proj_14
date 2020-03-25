package com.education_wired_.lambda.work3;

public interface MyConverter {
    public abstract String converStr(String str);
    public static boolean isNull(String str){
        return str == null;
    };
}
