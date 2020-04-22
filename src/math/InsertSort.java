package math;

public class InsertSort {
	public static int[] insertSort(int nums[]){
		for (int i = 1; i < nums.length; i ++){
			int j = i-1;
			int temp = nums[i];
			while(j >= 0 && nums[j] > temp){
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
		return nums;
	}
	public static void main(String[] args){
		int nums[] ={5,2,3,1,8,6};
		insertSort(nums);
		for (int i = 0; i < nums.length; i ++){
			System.out.print(nums[i]+"  ");
		} 
		
	}
}
