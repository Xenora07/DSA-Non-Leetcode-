import  java.util.Arrays ; 
class Isort{
    public static void main(String [] args){
        int [] nums = {3,8,7,5,1};
       System.out.println(Arrays.toString(Insertion(nums)));
    }
    static int[] Insertion(int[] nums){
        for( int i = 1  ; i < nums.length ; i++){
               int key = nums[i] ;
               int j = i-1;
           
             while(j>=0 && nums[j] > key){
                 nums[j + 1] = nums[j];
                 j--;
             }
             nums[j+1] = key;
             }
           return nums ; 
    }
       
    }
