class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Check every element
        for (int i = 0; i < nums.length; i++) {

            // Compare it with every next element
            for (int j = i + 1; j < nums.length; j++) {

                // Check if their sum equals target
                if (nums[i] + nums[j] == target) {

                    // Return their indices
                    return new int[]{i, j};
                }
            }
        }

        // This line will never execute because one solution always exists
        return new int[]{};
    }
}