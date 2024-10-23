package ajp_java.codingtest;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,4,1,4,5,6,3,1,9};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int val: arr){
            set.add(val);
        }

        int[] newArr = new int[set.size()];
        int i=0;
        for(int num: set){
            newArr[i++] = num;
        }

        for(int num: newArr){
            System.out.print(num+" ");
        }
    }
}
