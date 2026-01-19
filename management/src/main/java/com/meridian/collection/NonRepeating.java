package com.meridian.collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(NonRepeating.class);

    public static int findFirstUnique(String s){
        if (s==null || s.isEmpty()) return -1;

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c,0)+1);
        }
        for (int i =0; i< s.length();i++) {
            if (counts.get(s.charAt(i))==1) {
                return i;
            }
        }

        return -1;
    }

}
