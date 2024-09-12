package Labs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6 {
    // method to check a key exists int the map or not
    public static void checkMapping(HashMap<String, String> map, String key) {
        if (map.containsKey(key)) {
            System.out.println("Map contains " + key + " and value is : " + map.get(key));
        } else {
            System.out.println("Map doesn't contains the key and value");
        }
    }

    public static void main(String[] args) {
        // Question 1
        //  Write a Java program to associate the specified value with the specified key in a HashMap.

        // Declaring the HashMap
        HashMap<String, String> map = new HashMap<>();

        // adding key-value pair in HashMap
        map.put("Madhya Pradesh", "Bhopal");
        map.put("Gujrat", "Gandhinager");
        map.put("Rajsthan", "Jaipur");
        map.put("Punjab", "Chandigarh");
        map.put("Maharashtra", "Mumbai");

        // Printing elements of HashMap
        for (var e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println();

        // Question 2
        // Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.

        // ckecking the key exist in the map
        checkMapping(map, "Rajsthan");
        checkMapping(map, "Goa");
        System.out.println();

        // Question 3
        // create a Map Interface where we can store the cricketer name in it along with his scores and
        // search for the batsman name and display his score

        // Declaring the HashMap
        Map<String, Integer> map2 = new HashMap<>();

        // adding key-value pair in HashMap
        map2.put("Sachin", 100);
        map2.put("Dhoni", 10);
        map2.put("Virat", 79);
        map2.put("Rohit", 43);
        map2.put("Virendra", 38);

        // message for the user
        System.out.print("Enter name of cricketer: ");
        // creating instance of Scanner class for taking input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // checking if map contains name or not
        if (map2.containsKey(name)) {
            System.out.println("Score of " + name + " is " + map2.get(name));
        } else {
            System.out.println(name + " doesn't exists in map");
        }
    }
}
