package LeetCode.String;

import java.util.*;

public class Valid_anagrams {
    public static boolean isAnagram(String s, String t) { 
        if(s.length() != t.length()){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static boolean isAnagram2(String s, String t) {
        int arr[] = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramOptimized(String s, String t) { // not in leetcode but O(n)
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c: t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return false;
            }
            map.put(c,map.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
}
