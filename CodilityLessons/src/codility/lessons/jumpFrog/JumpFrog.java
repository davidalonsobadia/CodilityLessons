package codility.lessons.jumpFrog;

public class JumpFrog {
	
	public JumpFrog(){
		System.out.println("Welcome to " + this.getClass().getCanonicalName());
	}
	
	public int solution(int X, int Y, int D){
		int distance = Y - X;
		int jumps = distance % D == 0 ? distance / D : distance / D + 1;
		return jumps;
	}
}
