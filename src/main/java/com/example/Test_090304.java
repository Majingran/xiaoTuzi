package com.example;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Test_090304 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String i : strs) {
            String sorted = sort(i);
            if (map.containsKey(sorted)) {
                List<String> temp = map.get(sorted);
                temp.add(i);
                map.put(sorted, temp);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(i);
                map.put(sorted, temp);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (String s : map.keySet()) {
            output.add(map.get(s));
        }
        return output;
    }

    public String sort(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] src = {}, dst;
        dst = new String(src,"GBK").getBytes("UTF-8");
//        dst=String.fromBytes(src,"GBK").getBytes("UTF-8");
//        dst=new String("GBK",src).getBytes();
//        dst=String.encode(String.decode(src,"GBK")),"UTF-8");
        Test_090304 test_090304 = new Test_090304();
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        test_090304.groupAnagrams(s);
    }
}
