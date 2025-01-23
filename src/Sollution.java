import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> colle = new HashMap<>();

        for(int i=0;i < nums.length; i++){
            int complement = target - nums[i];

            if(colle.containsKey(complement)){
                return new int[]{colle.get(complement),1};
            }
            colle.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
     public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target =9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,target);

        if (result != null){
            System.out.println("Индекс: ["+result[0] + ", "+result[1]+"]");
        }else{
            System.out.println("Пара не найдено.");
        }
     }
}
