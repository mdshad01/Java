package Strings_in_java;

public class printlargestString {
    public static void main(String[] args) {
        String fruits[] = {"bananna", "mango", "apple", "papaya"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
