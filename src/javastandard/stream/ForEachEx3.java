package javastandard.stream;

import java.util.Arrays;
public class ForEachEx3 {
    public static void main(String[] args) {
        String[]aaa={"a","b","c","d","e"};
        Arrays.stream(aaa).forEach(yyy-> System.out.println(yyy));
    }
}
