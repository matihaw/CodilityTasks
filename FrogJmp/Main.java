public class Main {
	
	public static int solution(int X, int Y, int D) {
		double resoult = Y - X;
		resoult /= D;
		return (int) Math.ceil(resoult);    
	}
}
