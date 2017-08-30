public class Function {
	public static double harmonic(int n) {
		double sum = 0;
		for (int i = 1; i<=n ; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int arg = Integer.parseInt(args[i]);
			double value = harmonic(arg);
			StdOut.println(value);
		}
	}
}
