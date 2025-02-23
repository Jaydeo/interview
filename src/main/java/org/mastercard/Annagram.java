package org.mastercard;

import java.util.*;

public class Annagram {

    public static void main(String[] args) {
        //Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        for (String str : list) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);
            map.computeIfAbsent(key,
                    k -> new ArrayList<>()).add(str);
        }
        System.out.println((map.values()));
    }


}
