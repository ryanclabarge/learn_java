public class Mortgage {
	public static double Payment(double a, double b, double c){//this calculates the payment
		double payment = ((a*(b/12.0))/(1.0-(1.0/(Math.pow((1.0+(b/12.0)),(c*12.0))))));
		return payment;
	}
	public static double Future(double p, double c){
		double future = p*c*12.0;
		return future;
	}
	public static double Interest(double a, double b){
		return (a-b);
	}
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		System.out.println(args[0]);
		System.out.println(Future(Payment(a,b,c),c));
	}
}

