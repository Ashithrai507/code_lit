class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0,rigth=nums.length-1;

        while(left<=rigth)
        {
            if(nums[left]==val)
            {
                nums[left]=nums[rigth];
                rigth--;
            }
            else
            {
                left++;
            }
        }
        return left;
    }
}