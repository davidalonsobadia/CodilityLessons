package codility.lessons.PassingCars;

public class PassingCars {
	public int solution(int A[]){
        int ones = 0;
        for(int i =0; i<A.length; i++){
            if(A[i]==0) {
			} else
                ones++;
        }
        
        int passingCars=0;
        for(int i=0; i<A.length;i++){
            if(A[i]==0){
                passingCars += ones;
            } else {
                //passingCars += zeroes;
                ones--;
            }
        }
        if(passingCars > 1000000000)
            return -1;
        return passingCars;
	}

}
