public class AddInts {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			int temp = StdIn.readInt();
			sum += temp;
		}
		System.out.println("Sum is " + sum);
	}
}
