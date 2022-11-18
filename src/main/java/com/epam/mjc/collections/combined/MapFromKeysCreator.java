package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> m = new HashMap<>();
        for(Map.Entry<String, Integer> mapEntry : sourceMap.entrySet())
        {
            if(m.containsKey(mapEntry.getKey().length()))
                m.get(mapEntry.getKey().length()).add(mapEntry.getKey());
            else {
                Set<String> a = new HashSet<>();
                a.add(mapEntry.getKey());
                m.put(mapEntry.getKey().length(), a);
            }
        }
        return m;
    }
}
