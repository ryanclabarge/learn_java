public class AddInts {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 0; i<n; i++) {
			int temp = StdIn.readInt();
			sum += temp;
		}
		StdOut.println("Sum is " + sum);
	}
}
