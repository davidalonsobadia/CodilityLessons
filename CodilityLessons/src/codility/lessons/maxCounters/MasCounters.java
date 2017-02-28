package codility.lessons.maxCounters;

public class MasCounters {
	public int[] solution(int N, int[] A){
        int[] B = new int[N];
        int maxCounter = 0;
        int finalSum = 0;
        for(int i = 0; i<A.length;i++){
            if(A[i]<=N){
                B[A[i]-1]++;
                if(B[A[i]-1]>maxCounter){
                    maxCounter = B[A[i]-1];
                }
            } else if ( A[i] == N+1){
                finalSum += maxCounter;
                maxCounter = 0;
                B = new int[N];
            }
        }
        for(int i=0;i<B.length;i++){
            B[i] += finalSum;
        }
        return B;
	}

}
