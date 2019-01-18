import java.util.*;

/**
 * Created by lsc on 2018/11/10.
 */
public class Main {
    public static void main(String[] args) {
            int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
            List<List<Integer>> list = new ArrayList<>();
            Solution solution = new Solution();
            list = solution.threeSum(nums);
            for(List<Integer> list1 : list) {
                System.out.println(list1.toString());
            }


            Map<String ,List<String>>map = new HashMap<>();
            List<String>list1 = new ArrayList<>();
            list1.add("hejksd");
            map.put("lsc",map.getOrDefault("lsc",list1));
            System.out.println(map.get("lsc"));

//
//            Set<int[]>set = new HashSet<>();
//            int[] nums = new int[] {1 , 3,2};
//        System.out.println(set.add(nums));
//            nums[1] = 8;
//
////            System.out.println(nums.equals(nu));
//
//            System.out.println(set.add(nums));
//
//            System.out.println(set.contains(nums)+" "+ set.size());
//
//            Iterator it = set.iterator();
//            while (it.hasNext()) {
//                int[] num = (int[]) it.next();
//                for(int i : num) {
//                    System.out.println(i);
//                }
//            }
//
    }

}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        if (nums.length < 3) return null;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {


                        List<Integer> smallList = new ArrayList<>();


                        smallList.add(nums[i]);
                        smallList.add(nums[j]);
                        smallList.add(nums[k]);

                        if(!(set.contains(nums[i]) && set.contains(nums[j]) && set.contains(nums[k]))) {
                            list.add(smallList);
                            set.add(nums[i]);
                            set.add(nums[j]);
                            set.add(nums[k]);
                        }

                    }
                }
            }
        }



        return list;
    }
}