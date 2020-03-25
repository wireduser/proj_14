package com.education_wired_.lambda.work3;

@FunctionalInterface
public interface MyConverter {
    String converStr(String str);
    static boolean isNull(String str){
        return str == null?true:str.equals("");
    };
}
