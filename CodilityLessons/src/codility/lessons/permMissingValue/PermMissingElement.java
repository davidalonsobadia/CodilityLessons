package codility.lessons.permMissingValue;

public class PermMissingElement {

	public int solution(int[] A){
//		if(A == null || A.length < 1)
//			return 0;
//		if(A.length == 1)
//			return A[0];
//		
//		int max = 0, min = A[0], sum=0;
//		for(int i  = 0; i < A.length; i++){
//			if(min >= A[i])
//				min = A[i];
//			if (max < A[i])
//				max = A[i];
//			sum += A[i];
//		}
//		int realSum = 0;
//		for (int i = min; i<=max; i++){
//			realSum +=i;
//		}
//		return realSum-sum;
		
		if(A == null || A.length < 1)
			return 0;
		//suponemos que siempre empieza del 1
		int min = 1;
		int max = A[0];
		int sum = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] > max);
				max = A[i];
			sum += A[i];
		}
		int realSum = 0;
		for(int i = min; i <= max; i++){
			realSum += i;
		}
		if(realSum == sum)
			return sum++;
		return realSum - sum;
	}
}
