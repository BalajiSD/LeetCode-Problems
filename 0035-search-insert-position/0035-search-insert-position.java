class Solution {
    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(target<nums[i] || target==nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}