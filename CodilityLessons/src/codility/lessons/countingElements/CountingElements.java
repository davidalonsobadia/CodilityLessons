package codility.lessons.countingElements;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {
	
	public int solution(int A[]){
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int max = 0;
		for(int i = 0; i < A.length; i++){
			map.put(A[i], 1);
			if(A[i]>max){
				max=A[i];
			}
		}
		
		int result = 1;
		for(int i = 1; i < max; i++){
			if(map.get(i) == null){
				result = i;
				return result;
			}
		}
		return max+1;
	}
}
