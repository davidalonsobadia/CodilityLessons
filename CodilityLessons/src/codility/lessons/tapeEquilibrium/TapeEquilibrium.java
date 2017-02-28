package codility.lessons.tapeEquilibrium;

public class TapeEquilibrium {
	
	public int solution(int A[]){
		if (A == null || A.length < 1)
			return 0;
		if(A.length == 1)
			return A[0];
		
		int[] left = new int[A.length-1];
		int sum = 0;
		
		for(int i = 0; i<left.length; i++){
			left[i] = sum + A[i];
			sum += A[i];
		}
		sum += A[A.length-1];

		int min = Integer.MAX_VALUE;
		for(int i = 0; i<left.length;i++){
			int right = sum-left[i];
			int pos = Math.abs(right-left[i]);
			if(min > pos){
				min = pos;
			}
		}
		return min;
	}
}
