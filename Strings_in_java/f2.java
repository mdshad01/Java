package Strings_in_java;
public class f2 {
    public static boolean ispalindrome(String str){
    for(int i=0; i<=str.length()/2; i++){
     if(str.charAt(i) != str.charAt(str.length()-i-1)){
        return false;
     }  
    }
    return true;
}
    public static void main(String[] args) {
        String name = "racecar";
        System.out.println(ispalindrome(name));
    }
}
