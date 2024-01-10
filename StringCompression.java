public class StringCompression{

    public static String compress(String str){  //TC - O(n)

        // String newStr = "";

        // for(int i=0; i<str.length(); i++){

        //     Integer count = 1;

        //     while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr += str.charAt(i);
        //     if(count > 1){
        //         newStr += count.toString();
        //     }
        // }
        // return newStr;

        //**************************************** BY STRINGBUILDER *************************************/
        
        StringBuilder newStr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){

            Integer count = 1;

            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    public static void main(String args[]){

        String str = "aaabbcccdd";
        // String str = "abc";

        System.out.println(compress(str));
    }
}