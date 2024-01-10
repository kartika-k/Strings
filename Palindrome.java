public class Palindrome{

    public static Boolean isPalindrome(String s){     //TC - O(n)
        
        int n = s.length();

        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    } 

    public static void main(String args[]){
        String s = "racecar";

        System.out.println(isPalindrome(s));
    }
}