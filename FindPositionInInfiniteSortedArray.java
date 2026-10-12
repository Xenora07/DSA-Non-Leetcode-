class Solution{
    public static void main( String[] args){
        int[] nums = {2,3,5,6,9,12,15,17,23,34,45,56,60};
        int target = 57;

        System.out.println(Position(nums , target));
    }

    public static int Position(int[] nums , int target){

        int start = 0;
        int end = 1 ; 

        while(nums[end]<target){
           int newstart = end + 1 ;
           end = Math.min(end + (end - start + 1) * 2,nums.length - 1);   // without math min and num.length if the target is at end it will give out of bound error 
         start = newstart;
        }
        return BS(nums , target , start ,end);
    }

    public static int BS(int[] nums , int target , int start , int end){

        while(start<=end){
            int mid = start +( end- start) / 2;

            if(nums[mid]<target){
                start = mid + 1 ;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1 ;
    }
}