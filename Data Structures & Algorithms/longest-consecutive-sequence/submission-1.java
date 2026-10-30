class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
       for(int i : nums){set.add(i);}
         int max=0;
       for(int i = 0 ; i < nums.length; i++){
        int r=1;
        if(!set.contains(nums[i]-1)){
            while(set.contains(nums[i]+r)){
            r++;
        }
        }
         max = Math.max(max,r);
       }
       return max;

        
    }
}
