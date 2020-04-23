package math;

public class ShellSortOne {
    public static int[] shellSortOne(int nums[],int k){
        while(k >= 1){
            for(int i = k; i< nums.length ; i++ ){
                int j = i-k;
                int temp = nums[i];
                while(j >= 0 && nums[j] > temp ){
                    nums[j+k] = nums[j];
                    j-=k;
                }
                nums[j+k] = temp;
            }

            k/=2;
        }

        return nums;
    }
    public static void main(String[] args){
        int nums[] ={5,2,9,1,8,6,3,10,11,7};
        shellSortOne(nums,5);
        for (int i = 0; i < nums.length; i ++){
            System.out.print(nums[i]+"  ");
        }
    }
}

