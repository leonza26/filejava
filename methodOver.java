public class methodOver{
	static int mentol(int x, int y){
		return x + y;
	}

	static double mentolkin(double x, double y){
		return x + y;
	}
	public static void main(String[] args){
		int a = mentol(4, 5);
		double b = mentolkin(4.3 ,5.7);

		System.out.println("nilai int    : " + a);
		System.out.println("nilai double : " + b);
	}
}