class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merge = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of nums1
        while (i < m) {
            merge[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while (j < n) {
            merge[k] = nums2[j];
            j++;
            k++;
        }

        int total = m + n;

        // If total number of elements is odd
        if (total % 2 != 0) {
            return merge[total / 2];
        }

        // If total number of elements is even
        return (merge[total / 2] + merge[(total / 2) - 1]) / 2.0;
    }
}