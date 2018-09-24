package top.lijiulong.www;

public class selectSort {
	
	public void sort(int[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			int j = Min(arr, i, arr.length);
			Swap(arr,i,j);
		}
	}
	public int Min(int[] arr,int i, int j) {
		int flag=i;
		for(;i<j;i++) {
			if(arr[i] < arr[flag])
				flag = i;
		}
		return flag;
		
	}
	
	public void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
 	}
	
	public static void main(String[] args) {
		int arr[] = {122,41,51,324,352,234,23,43};
		selectSort test  = new selectSort();
		test.sort(arr);
		for(int i = 0;i <arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
