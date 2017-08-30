public class Average {
	public static void main(String[] args) {
		int count = 0;
		double sum = 0.0;
		while (!StdIn.isEmpty()) {
			double temp = StdIn.readDouble();
			sum += temp;
			count++;
		}
		double average = sum/count;
		StdOut.println("Average is " + average);
	}
}
