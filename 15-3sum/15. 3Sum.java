import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>();  // Set to avoid duplicate triplets
        HashMap<Integer, Integer> map = new HashMap<>();
        int target = 0;

        // Populate the HashMap with values and their corresponding indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Iterate over the array to find triplets
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i] - nums[j];
                
                // Ensure the complement is in the map and does not refer to i or j
                if (map.containsKey(complement)) {
                    int complementIndex = map.get(complement);
                    
                    if (complementIndex != i && complementIndex != j) {
                        // Create the triplet and sort it to avoid duplicates
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        
                        // Add the triplet to the set to ensure uniqueness
                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }

        // Convert the set of unique triplets to the result list
        result.addAll(uniqueTriplets);
        
        return result;
    }
}
