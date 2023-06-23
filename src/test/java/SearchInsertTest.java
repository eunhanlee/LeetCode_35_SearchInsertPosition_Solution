import org.example.Solution;
import static org.junit.Assert.assertEquals;

public class SearchInsertTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Existing target value in the middle
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int expected1 = 2;  // The index where 5 should be inserted
        int insertPosition1 = solution.searchInsert(nums1, target1);
        assertEquals(expected1, insertPosition1);

        // Example 2: Target value should be inserted in the middle
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int expected2 = 1;  // The index where 2 should be inserted
        int insertPosition2 = solution.searchInsert(nums2, target2);
        assertEquals(expected2, insertPosition2);

        // Example 3: Target value should be inserted at the end
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int expected3 = 4;  // The index where 7 should be inserted
        int insertPosition3 = solution.searchInsert(nums3, target3);
        assertEquals(expected3, insertPosition3);

        // Example 4: Target value should be inserted at the beginning
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        int expected4 = 0;  // The index where 0 should be inserted
        int insertPosition4 = solution.searchInsert(nums4, target4);
        assertEquals(expected4, insertPosition4);

        // Example 5: Empty array, target value should be inserted at the beginning
        int[] nums5 = {};
        int target5 = 4;
        int expected5 = 0;  // The index where 4 should be inserted
        int insertPosition5 = solution.searchInsert(nums5, target5);
        assertEquals(expected5, insertPosition5);

        // Example 6: Target value is smaller than the minimum value in the array,
        // should be inserted at the beginning
        int[] nums6 = {5, 7, 9, 11};
        int target6 = 3;
        int expected6 = 0;  // The index where 3 should be inserted
        int insertPosition6 = solution.searchInsert(nums6, target6);
        assertEquals(expected6, insertPosition6);

        // Example 7: Target value is larger than the maximum value in the array,
        // should be inserted at the end
        int[] nums7 = {2, 4, 6, 8};
        int target7 = 10;
        int expected7 = 4;  // The index where 10 should be inserted
        int insertPosition7 = solution.searchInsert(nums7, target7);
        assertEquals(expected7, insertPosition7);
    }
}
