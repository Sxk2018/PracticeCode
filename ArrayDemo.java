package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ar[]=new int [3]; 
  
 System.out.println(ar[0]); 
 System.out.println(ar[1]); 
 System.out.println(ar[2]); 
 
 //System.out.println(ar[3]); // if you access out of the index range then error will be generated.
 // the error is ArrayIndextOutOfBoundExcepetion 
 
 ar[0]=100; 
 ar[2]=300; 
 
 System.out.println(ar[0]); 
 System.out.println(ar[1]); 
 System.out.println(ar[2]); 
 
 
	}

}
