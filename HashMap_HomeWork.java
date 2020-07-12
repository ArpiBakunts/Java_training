import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_HomeWork {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Orange");
        hashMap.put(3, "Banana");

        //13
        associateKeyValue(hashMap);

        //14
        hashMapSize(hashMap);

        //15
        copyMappings(hashMap);

        //16
//        removeMappings(hashMap);

        //17
        isHashMapIsEmpty(hashMap);

        //18
        shallowCopyHashMap(hashMap);

        //19
        isHashMapContainsKey(hashMap, 1);
        isHashMapContainsKey(hashMap, 78);

        //20
        isHashMapContainsValue(hashMap, "Apple");
        isHashMapContainsValue(hashMap, "Pineapple");

        //21
        setFromMap(hashMap);

        //22
        getValueFromMap(hashMap, 1);
        getValueFromMap(hashMap, 2333);

        //23
        setOfMapKeys(hashMap);

        //24
        collectionViewOfValues(hashMap);
    }

    //13. Write a Java program to associate the specified value with the specified key in a HashMap.
    private static void associateKeyValue(HashMap<Integer, String> hashMap) {
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //14. Write a Java program to count the number of key-value (size) mappings in a map.
    private static void hashMapSize(HashMap<Integer, String> hashMap) {
        System.out.println("The size is " + hashMap.size());
    }

    //15. Write a Java program to copy all of the mappings from the specified map to another map.
    private static void copyMappings(HashMap<Integer, String> hashMap) {
        HashMap <Integer,String> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap);
        System.out.println("Copied hashmap is " + hashMap2);
    }

    //16. Write a Java program to remove all of the mappings from a map.
    private static void removeMappings(HashMap<Integer, String> hashMap) {
        hashMap.clear();
        System.out.println("Clear hashmap " + hashMap);
    }

    //17. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    private static void isHashMapIsEmpty(HashMap<Integer, String> hashMap) {
        if (hashMap.isEmpty()) {
            System.out.println("Yeees!!!");
        } else {
            System.out.println("Nooooo :( ");
        }
    }

    //18. Write a Java program to get a shallow copy of a HashMap instance.
    private static void shallowCopyHashMap(HashMap<Integer, String> hashMap) {
        HashMap newHashMap;
        newHashMap = (HashMap)hashMap.clone();
        System.out.println("Cloned map: " + newHashMap);
    }

    //19. Write a Java program to test if a map contains a mapping for the specified key.
    private static void isHashMapContainsKey(HashMap<Integer, String> hashMap, Integer key) {
        if (hashMap.containsKey(key)) {
            System.out.println("Yes it is ");
        } else {
            System.out.println("No it is not ");
        }
    }

    //20. Write a Java program to test if a map contains a mapping for the specified value.
    private static void isHashMapContainsValue(HashMap<Integer, String> hashMap, String value) {
        if (hashMap.containsValue(value)) {
            System.out.println("Yes it is ");
        } else {
            System.out.println("No it is not ");
        }
    }

    //21. Write a Java program to create a set of the mappings contained in a map. ( hint: myHashmap.entrySet() )
    private static void setFromMap(HashMap<Integer, String> hashMap) {
        Set set = hashMap.entrySet();
        System.out.println("HashMap: " + hashMap);
        System.out.println("Set: " + set);
    }

    //22. Write a Java program to get the value of a specified key in a map.
    private static void getValueFromMap(HashMap<Integer, String> hashMap, Integer key) {
        System.out.println("The value of this key is the " + hashMap.get(key));
    }

    //23. Write a Java program to get a set of the keys contained in this map. (hint: google it)
    private static void setOfMapKeys(HashMap<Integer, String> hashMap) {
        Set keySet = hashMap.keySet();
        System.out.println("HashMap: " + hashMap);
        System.out.println("Set of the keys: " + keySet);
    }

    //24. Write a Java program to get a collection view of the values contained in this map.
    private static void collectionViewOfValues(HashMap<Integer, String> hashMap) {
        System.out.println("The values of the Hash Map: " + hashMap.values());
    }
}
