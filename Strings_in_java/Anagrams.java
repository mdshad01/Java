package Strings_in_java;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String str = "earth";
        String str1 = "heart";
        
        if(str.length() == str1.length()){
            // .toCharArray(); function convert String to character array
            char strArray[] = str.toCharArray(); 
            char str1Array[] = str1.toCharArray(); 
            // function use to sort array
            Arrays.sort(strArray); 
            Arrays.sort(str1Array);
                         // Arrays.equals(str1,str2) use to compare to arrays
            boolean result = Arrays.equals(strArray,str1Array);
            if(result){
                System.out.println(str + " and " + str1 + " are Anagrams to each other");
            }
            else{
                System.out.println(str + " and " + str1 + " are not Anagrams to each other");
            }
        }
        else{
            System.out.println(str + " and " + str1 + " are not Anagrams to each other");
        }
    }
}
