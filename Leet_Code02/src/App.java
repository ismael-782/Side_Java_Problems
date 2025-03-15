class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int holder = 0;

        for (int i = 1; i < ans.length; i++) {
            if (ans[holder] != nums[i]) {
                ans[holder + 1] = nums[i];
                holder++;
            }
        }

        return holder+1;
    }
}