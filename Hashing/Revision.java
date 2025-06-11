package Hashing;

import java.util.*;

public class Revision {
    // static class HashMap<K, V> {
    // private class Node {
    // K key;
    // V val;

    // public Node(K key, V val) {
    // this.key = key;
    // this.val = val;
    // }
    // }

    // private int N;
    // private int n;
    // private LinkedList<Node> bucket[];

    // @SuppressWarnings("unchecked")
    // public HashMap() {
    // this.N = 4;
    // this.bucket = new LinkedList[4];

    // for (int i = 0; i < 4; i++) {
    // this.bucket[i] = new LinkedList<>();
    // }
    // }

    // public int hashfunction(K key) {
    // int hc = key.hashCode();
    // return Math.abs(hc) % N;
    // }

    // public int searchInLL(int bi, K key) {
    // LinkedList<Node> ll = bucket[bi];
    // int di = 0;
    // for (int i = 0; i < ll.size(); i++) {
    // Node node = ll.get(i);
    // if (node.key.equals(key)) {
    // return di;
    // }
    // di++;
    // }
    // return -1;
    // }

    // private void rehash() {
    // LinkedList<Node> oldbuck[] = bucket;
    // bucket = new LinkedList[2 * N];
    // N = 2 * N;
    // for (int i = 0; i < bucket.length; i++) {
    // bucket[i] = new LinkedList<>();
    // }
    // for (int i = 0; i < oldbuck.length; i++) {
    // LinkedList<Node> ll = oldbuck[i];
    // for (int j = 0; j < ll.size(); j++) {
    // Node node = ll.remove();
    // put(node.key, node.val);
    // }
    // }
    // }

    // public void put(K key, V val) {
    // int bi = hashfunction(key);
    // int di = searchInLL(bi, key);

    // if (di != -1) {
    // Node node = bucket[bi].get(di);
    // node.val = val;
    // } else {
    // bucket[bi].add(new Node(key, val));
    // n++;
    // }
    // double lamda = (double) n / N;
    // if (lamda > 2.0) {
    // rehash();
    // }
    // }

    // public boolean containsKey(K key) {
    // int bi = hashfunction(key);
    // int di = searchInLL(bi, key);

    // if (di != -1) {
    // return true;
    // }
    // return false;
    // }

    // public V remove(K key) {
    // int bi = hashfunction(key);
    // int di = searchInLL(bi, key);

    // if (di != -1) {
    // Node node = bucket[bi].remove(di);
    // n--;
    // return node.val;
    // }
    // return null;
    // }

    // public V get(K key) {
    // int bi = hashfunction(key);
    // int di = searchInLL(bi, key);

    // if (di != -1) {
    // Node node = bucket[bi].get(di);
    // return node.val;
    // } else {
    // return null;
    // }
    // }

    // public ArrayList<K> keySet() {
    // ArrayList<K> keys = new ArrayList<>();
    // for (int i = 0; i < bucket.length; i++) {
    // LinkedList<Node> ll = bucket[i];
    // for (Node node : ll) {
    // keys.add(node.key);
    // }
    // }
    // return keys;
    // }

    // public boolean isEmpty() {
    // return n == 0;
    // }
    // }

    public static void majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer i : map.keySet()) {
            if (map.get(i) > arr.length / 3) {
                System.err.println(i);
            }
        }
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Count of Distinct : " + set.size());
    }

    public static void unionAndIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        System.out.println("Union = " + set.size() + " " + set);

        set.clear();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            if (set.contains(i)) {
                set1.add(i);
            }
        }

        System.out.println("Intersection = " + set1.size() + set1);
    }

    public static String itinerary(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String k : map.keySet()) {
            revMap.put(map.get(k), k);
        }

        for (String k : map.keySet()) {
            if (!revMap.containsKey(k)) {
                return k;
            }
        }
        return null;
    }

    public static void printItinearay(HashMap<String, String> map) {
        String start = itinerary(map);
        System.out.print(start);

        // for (String s : map.keySet()) {
        // System.out.print("-> " + map.get(start));
        // start = map.get(start);
        // }

        while (start != null && map.containsKey(start)) {
            System.out.print("-> " + map.get(start));
            start = map.get(start);
        }
    }

    public static void largestSubArrayWithZero(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("Maximum sub array length : " + len);
    }

    public static void subArraySumEqualToK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int sum = 0;
        map.put(0, 1);
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                len += map.get(sum - k);
            } else {
                map.put(sum, map.getOrDefault(map.get(sum), 0) + 1);
            }
        }
        System.out.println("Largest sub array sum : " + len);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -10, 10 };
        int k = 10;
        subArraySumEqualToK(arr, k);
    }
}
