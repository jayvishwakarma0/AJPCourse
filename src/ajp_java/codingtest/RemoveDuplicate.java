package ajp_java.codingtest;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,4,1,4,5,6,3,1,9};
        HashSet<Integer> set = new HashSet<>();
        for(int val: arr){
            set.add(val);
        }

        System.out.println(set);
    }
}
