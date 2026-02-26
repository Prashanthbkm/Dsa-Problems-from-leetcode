class Solution {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, target, 0, -1, -1);
    }

    public int[] search(int[] nums, int target, int i, int first, int last) {
        if (i == nums.length) {
            return new int[]{first, last};
        }

        if (nums[i] == target) {
            if (first == -1) {
                first = i;
            }
            last = i;
        }

        return search(nums, target, i + 1, first, last);
    }
}