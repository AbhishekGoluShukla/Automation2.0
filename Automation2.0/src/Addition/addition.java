package Addition;

import java.util.Iterator;

public class addition {
	public static int add(int...n) {
		int sum=0;
		for (int i = 0; i < n.length; i++) {
			sum+=n[i];		
	  }
		return sum;
		
	}

	public static void main(String[] args) {
	 System.out.println(add());
	 System.out.println(add(1));
	 System.out.println(add(10,20,30,40,50,60,70,80,90,100));
	 int[] arr= {1,2,3,4,5,6,7,8,9,10};
	 System.out.println(add(arr ));

	}

}
