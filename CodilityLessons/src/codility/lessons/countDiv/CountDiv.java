package codility.lessons.countDiv;

public class CountDiv {
    public int solution(int A, int B, int K) {
        
    	int r = 0;
        if((B - A) >= K || B % K == 0 || A % K == 0)
            r++;
        
        int mod = B % K;
        int y = (B - mod - A) / K;
        int result = y + r;
        return result;   
    }
}
