class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        int currArea = 0;
        while(left<right)
        {
            currArea = (right-left)*(Math.min(height[left],height[right]));
            if(maxArea < currArea) {
                maxArea = currArea;
            }
            if(height[left]<height[right])
            {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}