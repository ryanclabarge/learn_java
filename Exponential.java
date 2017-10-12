public class Exponential{

	public static int factorial(int n){
		int k = 1;
		if (n == 0) return 1;
		else{
			for (int i = n;i>0;i--){
				 k *= i;
			}
		return k;
		}
	}


	public static void main(String[] args){
		double delta = Double.parseDouble(args[0]);
		int length = String.valueOf(delta).length
		double e = 0;
		int i = 0;
		System.out.println(factorial(2));
		while ((1.0/factorial(i))>delta){
			e +=(1.0/factorial(i));
			i++;
			}
		System.out.printf("%.*f%n",length,e);
	}
}
