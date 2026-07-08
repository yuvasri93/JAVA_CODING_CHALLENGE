#Problem Link Leetcode: https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

package Arrays.Merge Sorted Array;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
