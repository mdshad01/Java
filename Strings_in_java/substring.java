package Strings_in_java;

public class substring {
    public static String SubString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String name = "HelloWolrd";
        System.out.println(SubString(name, 0, 5));
    }
}
