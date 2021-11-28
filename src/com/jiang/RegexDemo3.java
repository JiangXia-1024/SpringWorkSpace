package com.jiang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: 江夏
 * @Date: 2021/09/04/10:52
 * @Description:replaceFirst 和 replaceAll 方法
 * replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
 */
public class RegexDemo3 {
    private static String REGEX = "xiaoming";
    private static String INPUT = "xiaoming says hello";
    private static String REPLACE = "jiangxia";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}






