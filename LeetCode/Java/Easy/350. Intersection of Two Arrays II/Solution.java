import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = Math.min(nums1.length, nums2.length);
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    result[k] = nums1[i];

                    k++;

                    nums2[j] = -1;

                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
}