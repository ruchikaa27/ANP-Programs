package anudip;

public class maxnum {
	public static void main(String args[]) {
		int a= 10;
		int b= 20;
	    int c= 15;
	    int max;
	    if(a>=b && a>=c) {
	    	max =a;
	    	
	    }else if(b>=a && b>=c) {
	    	max =b;
	    
	} 
	else {
		max=c;
	}
		System.out.println("maximum number is "+max);
	}

}
