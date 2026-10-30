class Solution {
    public int maxArea(int[] height) {
        int l = 0 ;
        int r = height.length-1;
        
         int curr =0, max=0;
        while(r>l){
            int width = r-l;
            curr = Math.min(height[l], height[r]);
            max = Math.max(max, curr*width);
            if(height[l]>height[r]){
                r--;
            }else l++;

           
        }
        return max;
        
    }
}
