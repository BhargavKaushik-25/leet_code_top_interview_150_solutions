class Solution {
    //Remove Element solution
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int k = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i]==val){
                count++;
            }else{
                nums[k]=nums[i];
                k++;
            }
        }
        return nums.length - count;
    }
}