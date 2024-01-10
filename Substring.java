public class Substring{   

    // public static String Substring(String s, int si, int ei){
    //     //initialise one empty substring
    //     String subStr = "";

    //     for(int i = si; i < ei; i++){
    //         subStr += s.charAt(i);
    //     }

    //     return subStr;
    // }

    public static void main(String args[]){

        String s = "HelloWorld";
        int si = 0;
        int ei = 5;

        //inbuilt substring function in java
        System.out.println(s.substring(si,ei));

        // System.out.println(Substring(s, si, ei));
    }
}