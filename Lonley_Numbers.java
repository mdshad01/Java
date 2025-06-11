import java.util.*;

public class Lonley_Numbers {
    // public static boolean lonleyNumber(ArrayList<Integer> list){
    // int curr = list.get(0);
    // for(int i=1;i<list.size()-1;i++){
    // if(list.get(i-1) != list.get(i)-1 && list.get(i+1) != list.get(i)+1){

    // }
    // }
    // }

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10, 6, 5, 8));
        System.out.println(findLonely(nums));
    }
}
