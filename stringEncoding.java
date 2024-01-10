import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String message) {
		int n = message.length();
		// String newStr = "";
		StringBuilder newStr = new StringBuilder("");
		for(int i=0; i<n ; i++){
			Integer count = 1;
			while(i<n-1 && message.charAt(i) == message.charAt(i+1)){
				count++;
				i++;
			}
			newStr.append(message.charAt(i));
			newStr.append(count);
		}
		return newStr.toString();
	}
}

