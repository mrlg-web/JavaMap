package main.java.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args){
        System.out.println();

        Map <Integer, String> temp = new HashMap<>();
        temp.put(1, "House");
        temp.put(2, "Tree");
        temp.put(3, "Goal");
        temp.put(4, "Fun");
    String store = temp.get(3);  // To ask Kostas: How to explain this line
    System.out.println(store);

        System.out.println();

    boolean result = temp.containsValue("One"); // returns true if the value is found in the HashMap false otherwise
                                                // the return from calling the method containsValue() is saved in a
                                                // variable of type boolean
    //System.out.println(result); // checks that the value "One" exists in our HashMap

        for (Map.Entry<Integer, String> entry : temp.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            if (entry.getValue().equals("Fun")){
                System.out.println("found entry " + entry);
            }
        }
    }
}
