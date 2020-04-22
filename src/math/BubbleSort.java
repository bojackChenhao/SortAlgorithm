package math;

public class BubbleSort {
	public static int[] bubbleSort(int nums[]){
		for(int i = 0; i< nums.length-1 ; i++){
			for(int j= i+1; j < nums.length ; j++){
				if(nums[j] < nums[i]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
	public static void main (String args[]){
		int nums[] ={5,2,9,1,8,6,3,10,11,7};
		bubbleSort(nums);
		for (int i = 0; i < nums.length; i ++){
			System.out.print(nums[i]+"  ");
		} 
	}

}
