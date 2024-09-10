package sept10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFrequency {

    public static void main(String[] args) {
        int[] arr = {12,45,23,12,45,23,23,89};

        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i=0; i<arr.length; i++){
//            if(!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//            } else{
//                map.put(arr[i],map.get(arr[i])+1);
//            }

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Set<Map.Entry<Integer,Integer>> newSet = map.entrySet();

        for(Map.Entry<Integer,Integer> e: newSet){
            System.out.println(e.getKey()+"  "+e.getValue());
        }

//        for(var e: map.entrySet()){
//            System.out.println(e.getKey()+"  "+e.getValue());
//        }

        System.out.println(map);


    }
}
