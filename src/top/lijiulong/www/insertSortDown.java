package top.lijiulong.www;

public class insertSortDown {
	
	public static void sort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>0&&arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,6,5,8,41,51,346,15255};
		sort(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
