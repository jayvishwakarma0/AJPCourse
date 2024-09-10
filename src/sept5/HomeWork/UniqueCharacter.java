package sept5.HomeWork;

import java.util.HashMap;

public class UniqueCharacter {
    public static String findUnique(String s){
        s = s.toLowerCase();
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,1);
           } else {
               map.put(ch,map.get(ch)+1);
           }
       }
       String newString  = "";
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(map.get(ch)==1){
               newString += ch;
           }
       }
       return newString;
    }
    public static void main(String[] args) {

        String ans = findUnique("java");

        System.out.println(ans);
    }
}
