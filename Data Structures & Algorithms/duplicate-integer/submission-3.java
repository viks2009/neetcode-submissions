class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) return true;
        }return false;

        // Map<Integer, Integer> seen = new HashMap<>();
        // for(int i = 0 ; i < nums.length; i++){
        //     if(seen.containsKey(nums[i])){
        //         return true;
        //     }seen.put(nums[i],i);
        // }return false;

        // return !Arrays.equals(Arrays.stream(nums).toArray(),
        //                 Arrays.stream(nums).distinct().toArray());
         
    }
}