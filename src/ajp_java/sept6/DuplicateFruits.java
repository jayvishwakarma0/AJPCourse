package ajp_java.sept6;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateFruits {
    public static ArrayList<String>  removeDuplicate(ArrayList<String> arr){
        HashSet<String> set = new HashSet<>();

        set.addAll(arr);
        arr.clear();
        arr.addAll(set);

        return arr;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("mango");
        arr.add("orange");
        arr.add("apple");
        arr.add("banana");
        arr.add("apple");
        arr.add("graps");

        ArrayList<String> ans = removeDuplicate(arr);

        for(String s: arr){
            System.out.println(s);
        }
    }
}
