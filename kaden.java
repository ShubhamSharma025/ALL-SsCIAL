public class kaden {

    public static int maxArray(int[]nums){
        int maxSum=nums[0];
        int curent=nums[0];

        for(int i=1;i<nums.length;i++){
            curent=Math.max(nums[i],curent+nums[i]);
            maxSum=Math.max(maxSum,curent);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum1= maxArray(nums);
        System.out.println("maximum Subarray sum:"+maxSum1); 
    }
}
