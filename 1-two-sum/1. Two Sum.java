class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++)
        {
            map.put(nums[i], i);
        }
        for(int i = 0; i<n; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }

        return new int[]{};
    }
}