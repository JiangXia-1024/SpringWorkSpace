package com.jiang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: 江夏
 * @Date: 2021/09/04/10:49
 * @Description:matches 和 lookingAt 方法
 */
public class RegexDemo2 {
        //目标字段
        private static final String REGEX = "he";
        private static final String INPUT1 = "hello";
        private static final String INPUT2 = "yousayhello";
        private static Pattern pattern;
        private static Matcher matcher;
        private static Matcher matcher2;

        public static void main(String[] args) {
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(INPUT1);
            matcher2 = pattern.matcher(INPUT2);
            System.out.println("Current REGEX is: " + REGEX);
            System.out.println("Current INPUT is: " + INPUT1);
            System.out.println("Current INPUT2 is: " + INPUT2);
            System.out.println("lookingAt(): " + matcher.lookingAt());
            System.out.println("matches(): " + matcher.matches());
            System.out.println("lookingAt(): " + matcher2.lookingAt());
        }
    }
