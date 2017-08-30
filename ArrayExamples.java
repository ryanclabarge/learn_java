public class ArrayExamples {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double[] a = new double[n];
		for (int i = 0; i<n; i++) {
			a[i] = Math.random();
		}
		for (int i = 0;i<n;i++) {
			System.out.println(a[i]);
		}
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0;i<n;i++) {
			if (a[i]> max) max = a[i];
		}
		for (int i = 0;i<n;i++) {
			System.out.println(a[i]);
		}
		double sum = 0.0;
		for (int i = 0; i<n;i++) {
			sum += a[i];
		double average = sum/n;
		}
		for (int i = 0; i<n/2;i++) {
			double temp = a[i];
			a[i] = a[n-1-i];
			a[n-i-1] = temp;
		}
		for (int i = 0;i<n;i++) {
			System.out.println(a[i]);
		}
		double[] b= new double[n];
		for (int i=0;i<n;i++) {
			b[i] = a[i];
		}
	}
}
