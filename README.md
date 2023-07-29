# LeetCode 35. Search Insert Position Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-35-search-insert-position-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-35-search-insert-position-java.html

## Problem

[Search Insert Position - LeetCode](https://leetcode.com/problems/search-insert-position/)

### Problem Solving Approach

- The given problem deals with a sorted array.
- The condition is to solve it in O(log n) time complexity.
- The only method to achieve this in a sorted list is Binary Search.
- This problem tests your understanding of Binary Search and its implementation.
- When implementing Binary Search, you need to decide whether to use recursion or iteration.
- Since this problem does not require previous results or sub-problems, it is more effective to implement it using iteration.
- When the target value is not found, the function should return the index where the target should be inserted.
- The function returns 'low' value because it is closer to the target than 'high', where 'mid' is unchanged and 'mid' divided by 2 and floored is less than or equal to 'high'.

## Github Link

[https://github.com/eunhanlee/LeetCode_35_SearchInsertPosition_Solution.git](https://github.com/eunhanlee/LeetCode_35_SearchInsertPosition_Solution.git)

## Time Complexity: O(log n), Space Complexity: O(1)

```java
class Solution {
    /**
     * Search for the insertion position of the target value in the given sorted array.
     *
     * @param nums   Sorted integer array.
     * @param target Value to search for.
     * @return The index where the target should be inserted.
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid; // Return the index if the target value exists.
            else if (nums[mid] < target)
                low = mid + 1; // Move to the right half if the target is greater than the current middle value.
            else
                high = mid - 1; // Move to the left half if the target is less than the current middle value.
        }

        // If the loop exits, it means the target does not exist in the array, and 'low' indicates the insertion position.
        return low;
    }
}
```