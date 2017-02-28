package codility.lessons.frogRiverOne;

public class FrogRiverOne {
	public int solution(int X, int[] A){
		int[] B = new int[X];
		int pathCovered = 0;
		for(int i = 0; i<A.length; i++){
			if( A[i]<= B.length && B[A[i]-1] == 0){
				B[A[i]-1] = 1;
				pathCovered++;
			}
			if(pathCovered==X){
				return i;
			}
		}
		return -1;
	}
}
