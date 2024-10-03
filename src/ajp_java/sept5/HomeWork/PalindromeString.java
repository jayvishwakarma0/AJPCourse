package ajp_java.sept5.HomeWork;

public class PalindromeString {
    public static boolean checkPalindrome(String s){
        s = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
      if(checkPalindrome("Madam")){
          System.out.println("String is palindrome");
      } else{
          System.out.println("String is not palindrome");
        }
    }
}
