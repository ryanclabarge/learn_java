public class StandardOut{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for (int i=0; i<n; i++) {
			double temp = Math.random();
			System.out.printf("%.7f",temp);
			System.out.printf("%n","");
		}
	}
}
