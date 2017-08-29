public class ArrayEq {
	public static boolean length(int a[], int b[]){
		return a.length == b.length;
	}
	public static int uniform(int n){
		return (int) (Math.random()*n);
	}
	public static boolean pairwise(int a[], int b[]) {
		int k = 0;
		for (int i = 0; i< a.length; i++){
			if (a[i]==b[i]) k++;
		}
		if (k != a.length) return false;
		else return true;
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int t = Integer.parseInt(args[1]);
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i<n;i++) {
		      	a[i] = (int) uniform(t);
			b[i] = (int) uniform(t);
		}
		if ((length(a,b) && pairwise(a,b))) {
			System.out.println("a = b");
		}
		else {
			System.out.println("a != b");
		}
	}
}
