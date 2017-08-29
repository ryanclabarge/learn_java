public class Majority{
	public static boolean majority(boolean a, boolean b, boolean c) {
		return (boolean) (a&&b) || (b&&c) || (c&&a);
	}
	public static void main(String[] args) {
		boolean[] b = new boolean[args.length];
		for (int i = 0; i< args.length;i++) {
			if (args[i] == "true") {
				b[i] = true;
			}
		}
		majority(b[0],b[1],b[2]);
	}
}


