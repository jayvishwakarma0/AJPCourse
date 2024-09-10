package sept10;

import java.util.HashMap;

// Radika --- radikaa have multiple shocks   by an arr it color of sigle
// shocks so you to find how many pairs of shock raddika have

public class FindPair {
    public static void main(String[] args) {
        int neArr[]  = {12,34,12,53,12,34,53,21,21,45} ;
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i=0; i<neArr.length; i++){
            map.put(neArr[i],map.getOrDefault(neArr[i],0)+1);
        }

        System.out.println(map);

        int totalPairs = 0;

        for (int count : map.values()) {
            totalPairs += count/2;
        }
        System.out.println(totalPairs);

    }
}
