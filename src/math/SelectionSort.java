package math;

public class SelectionSort {
    public static int[] selectionSort(int nums[]){

        for(int i = 0; i < nums.length-1; i++){
            int point = i;
            for (int j = i; j < nums.length -1 ; j++){
                if (nums[j+1] < nums[point]){
                   point = j+1;
                }
            }
            int temp = nums[point];
            nums[point] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    public static void main(String[] args){
        int nums[] ={5,2,9,1,8,6,3,10,11,7};
        selectionSort(nums);
        for (int i = 0; i < nums.length; i ++){
            System.out.print(nums[i]+"  ");
        }
    }
}