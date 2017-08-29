public class Coupon {
	public static int getcoupon(int n) {
		return (int) (Math.random()*n);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int count=0;
		int distinct=0;
		boolean[] isCollected = new boolean[n];
		while (distinct < n) {
			int temp = getcoupon(n);
			count++;
			if (!isCollected[temp]){
				distinct++;
				isCollected[temp] = true;
			}
		}
		System.out.println(count);
	}
}
	
