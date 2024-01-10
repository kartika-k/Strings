public class StringCompare{
    public static void main(String args[]){
        
        String s1 = "Tony";
        String s2 = "Tony";              //String without new keyword points to old string only
        String s3 = new String ("Tony");  //String with new keyword points a new string that's why s1 and s3 are not equal

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //Here we use .equals() method
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}