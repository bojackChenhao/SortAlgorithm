package math;

public class ShellSort {
	public static int[] shellSort(int nums[],int k){
		while (k >= 1){
			for (int i = 1;i <= k; i++){
				int m = nums.length-i;
				int times = m/k;
				for (int j = 1 ; j <= times; j++){
					int x = j-1;
					int temp = nums[m-j*k];
					while(x >= 0 && temp > nums[m-x*k]){
							nums[m-(x+1)*k] =  nums[m-x*k];
						    x--;
					}
					nums[m-(x+1)*k] = temp;
				}	
			}
			k/=2;
		}
			return nums;
	}
	public static void main(String[] args){
		int nums[] ={5,2,9,1,8,6,3,10,11,7};
		shellSort(nums,3);
		for (int i = 0; i < nums.length; i ++){
			System.out.print(nums[i]+"  ");
		} 
	}
}
