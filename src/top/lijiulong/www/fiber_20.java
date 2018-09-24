package top.lijiulong.www;

public class fiber_20 {
	
	public static int fiber(int num){
		if(num == 0)
			return 1;
		else if(num == 1)
			return 1;
		else
			return fiber(num-2)+fiber(num-1);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			System.out.println(fiber(i));
		}
	
	}
}	
