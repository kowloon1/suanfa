package top.lijiulong.www;

public class insertSort {
	
	public static void insert_sort(int []array) {
		for(int i = 1; i < array.length;i++) {
			int key=array[i];
			int j = i - 1;
			while(j>0&&key<array[j]) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,4,6,5,8,41,51,346,15255};
		insert_sort(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
