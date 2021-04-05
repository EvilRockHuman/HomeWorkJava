package Task14;

import java.util.*;

public class Task08{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Gang2","Gang4");
        map.put("Gang3","Gang5");
        map.put("Gang4","Gang3");
        System.out.println(map);
        System.out.println(reverse(map));
        System.out.println(map);

    }

    static <K,V> Map<V, Collection<K>> reverse(Map<K,V> map){
        Map<V,Collection<K>> map2 = new HashMap<>();
        Set<K> keys = map.keySet();
        for(K key : keys){
            V value = map.get(key);
            map2.compute(value, (v, collection) -> {
                if (collection==null){
                    collection = new HashSet<>();
                }
                collection.add(key);
                return collection;
            });
        }
    return map2;
    }
    }


