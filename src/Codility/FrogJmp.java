package Codility;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		if (D == 0) {
			return 0;
		}
		int jump = (Y - X) / D;
		int plus = 0;
		if ((Y - X) % D != 0) {
			plus = 1;
		}
		jump += plus;
		return jump;
	}
}
