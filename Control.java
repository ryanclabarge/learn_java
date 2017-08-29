public class Control {
	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		while(!StdIn.isEmpty()){
			double temp = StdIn.readDouble();
			sum += temp;
			count++;
		}
		double average = sum/count;
		System.out.println("The Average is " + average);
	}
}

