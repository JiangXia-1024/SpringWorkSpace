package com.jiang;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @Author: 江夏
 * @Date: 2021/09/04/16:23
 * @Description: PatternSyntaxException测试类
 */
public class RegexDemo4 {
    private static String REGEX = "[";
    private static String INPUT = "xiaoming says hello";
    private static String REPLACE = "jiangxia";

    public static void main(String[] args) {
        try{
            Pattern pattern = Pattern.compile(REGEX);

            // get a matcher object
            Matcher matcher = pattern.matcher(INPUT);
            INPUT = matcher.replaceAll(REPLACE);
        } catch(PatternSyntaxException e){
            System.out.println("PatternSyntaxException: ");
            System.out.println("Description: "+ e.getDescription());
            System.out.println("Index: "+ e.getIndex());
            System.out.println("Message: "+ e.getMessage());
            System.out.println("Pattern: "+ e.getPattern());
        }


    }
}
