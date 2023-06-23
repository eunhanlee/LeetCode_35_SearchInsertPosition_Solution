package org.example;

public class Solution {
    /**
     * Searches for the insert position of the target value in the given sorted array.
     *
     * @param nums   The sorted array of integers.
     * @param target The value to search for.
     * @return The index where the target should be inserted.
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid; // Target value found, return the index
            else if (nums[mid] < target)
                low = mid + 1; // Target is in the right half, move low pointer to mid + 1
            else
                high = mid - 1; // Target is in the left half, move high pointer to mid - 1
        }

        // Target value not found, return the insert position indicated by the low pointer
        return low;
    }
}