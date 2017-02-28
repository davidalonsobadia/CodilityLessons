package codility.lessons.cyclicrotation;

public class CyclicRotation {
	
	 public CyclicRotation(){
		 System.out.println("Welcome to Cyclic rotation test");
	 }

	 public int[] solution(int[] A, int K) {
	     if(A == null || A.length < 1){
	         return A;    
	     }
	     for(int i = 0; i < K; i++){
	         int lastVar = A[A.length-1];
	         int[] B = new int[A.length];
	         B[0] = lastVar;
	         for( int j = 1; j < A.length; j++){	 
	        	 B[j] = A[j-1];
	         }
	         A = B;
	     }
	     return A;
	}
}


