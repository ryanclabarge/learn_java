public class Maximum {
	public static int max(int a, int b, int c) {
		int m = a;
		if (b > m) m = b;
		if (c > m) m = c;
		return m;
	}
	public static double max(double a, double b, double c) {
		double m = a;
		if (b > m) m = b;
		if (c > m) m = c;
		return m;
	}
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int t = (int) max(a,b,c);
		System.out.println(t);
	}
}
