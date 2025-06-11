package Recursion;

public class m1 {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
        }
        else{
            char currChar = str.charAt(idx);
            if(map[currChar-'a'] == true){
                // duplicate
                removeDuplicate(str, idx+1, newStr, map);
            }
            else{
                map[currChar-'a'] = true;
                removeDuplicate(str, idx+1, newStr.append(currChar), map);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
