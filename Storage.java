package pl.sdajavapol141.Task04;

import java.util.*;

public class Storage {
    private final Map<String, Collection<String>> map;

    public Storage() {
        map = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        map.putIfAbsent(key, new ArrayList<>());// new HushSet też będzie działać
//        Collection<String> names = map.get(key);
//        names.add(value);
        map.get(key).add(value);
    }
    public void printValues(String key){
        Collection<String> list = map.get(key);
        if (list == null){
            return;
        }
        System.out.println(list.stream().sorted().toList());
    }
    public void findValues(String value){
        List<String>keys = new ArrayList<>();
        for ( var entry : map.entrySet()) {
            if (entry.getValue().contains(value)){
                keys.add(entry.getKey());
            }
        }
        System.out.println(keys);
    }
}
//            if (entry.getValue().stream().anyMatch(name-> Objects.equals(name,value))){
//                keys.add(entry.getKey());