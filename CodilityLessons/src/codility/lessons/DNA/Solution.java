package codility.lessons.DNA;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public int[] solution(String S, int[] P, int [] Q){
		
		int N = S.length();
		int mapSize = (N*(N+1))/2;
		Map<String, Integer> map = new HashMap<>();
		
		int ini=0;
		int end=0;
		char minGroup = S.charAt(ini);
		for(int i = 0; i < mapSize; i++){
			minGroup = minGroup >= S.charAt(end) ? S.charAt(end) : minGroup;
			
			int r = 0;
			switch (minGroup) {
				case 'A':
					r = 1;
					break;
				case 'C':
					r = 2;
					break;
				case 'G':
					r = 3;
					break;
				case 'T':
					r = 4;
					break;
			}
				
			map.put(""+ini+end, r);
			
			if(end >= (N-1)){
				ini++;
				end = ini;
				if(ini < N)
					minGroup = S.charAt(ini);
			} else {
				end++;
			}
			
		}
		
		int[] result = new int[P.length];
		
		for(int i = 0; i < P.length ; i++){
			
			String k = ""+P[i]+Q[i];
			result[i] = map.get(k);
		}
		
		return result;
	}
	

	public static void main (String [] args){
		
		String S= "CAGCCTA";
		int M = 3;
		int[] P = new int[M];
		P[0] = 2;
		P[1] = 5;
		P[2] = 0;
		
		int[] Q = new int[M];
		Q[0] = 4;
		Q[1] = 5;
		Q[2] = 6;
		
		Solution sol = new Solution();
		int[] result = sol.solution(S, P, Q);
		
		for(int r : result){
			System.out.print(r + ", ");
		}
	}

}
