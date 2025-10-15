public class Tut_66 {
    static int binarySearchRotatedSortedArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // target lies in left half
                } else {
                    low = mid + 1; // target lies in right half
                }
            }
            // Otherwise, right half must be sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; // target lies in right half
                } else {
                    high = mid - 1; // target lies in left half
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int target = 2;
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(binarySearchRotatedSortedArray(nums, target));
    }
}
