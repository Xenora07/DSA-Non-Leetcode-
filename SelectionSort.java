 import java.util.Arrays;
class Ssort{

    public static void main (String [] args){
        int [] nums = {9, 3, 6, 1, 5};  // [ 1 2 3 4 5 ]
        System.out.println(Arrays.toString(sort(nums)));
    }

    static int[] sort(int[] nums){

        for( int i = 0 ; i < nums.length ; i++){
            int maxindex = i ;
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[j]<nums[maxindex]){
                    maxindex = j;   
                }
            }
          int  temp =  nums[i] ;
          nums[i] = nums[maxindex];
          nums[maxindex] = temp;
        }
        return nums;
    }
}