package codility.lessons.oddValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OddArrayValue {

	public OddArrayValue(){
		System.out.println("Welcome to " + this.getClass().getCanonicalName());
	}

	public int solution(int[] A) {
		if(A == null || A.length < 1){
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < A.length; i++){
	    	int currentValue = A[i];
	    	if(map.get(currentValue) != null){
	    		map.remove(currentValue);
	    	} else {
	    		map.put(currentValue, i);
	    	}
	    }
	    Set l = map.keySet();
	    Iterator it = l.iterator();
	    return (int)it.next();
	}
}
