package org.mastercard;

import java.util.*;

public class Annagram {

    public static void main(String[] args) {
        //Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> result = getResult(list);
        result.stream().forEach(e-> System.out.println(e));
    }

    private static List<List<String>> getResult(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : list) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
