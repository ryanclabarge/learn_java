public class Euclidean {
	public static void main(String[] args){
		long old_r = Long.parseLong(args[0]);
		long r = Long.parseLong(args[1]);
		long s_0 = 1;
		long s_1 = 0;
		long t_1 = 1;
		long t_0 = 0;
		System.out.println("Lets find the GCD of "+ args[0] +" and "+ args[1]);
		while (r!=0){
			long q = (old_r/r);
			old_r = r;
			r = (old_r - q*r);
			s_0 = s_1;
			s_1 = (s_0 - q*s_1);
			t_0 = t_1;
			t_1 = (t_0 - q*t_1);
		}
		System.out.println("And that is "+ old_r+ " = "+s_0+"*"+args[0]+"+"+t_0+"*"+args[1]);
	}
}

