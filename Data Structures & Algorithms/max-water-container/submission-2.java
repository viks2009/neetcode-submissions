class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            int water = min * (r - l);
            ans = Math.max(ans, water);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
