public class UseChapter5{

	public static void main(String[] args){
		Chapter5 stats = new Chapter5();
		double[] x = {1,2,3,4,5};
		double[] y = {13,123,2354,234,14};
		stats.setX(x);
		stats.setY(y);
		System.out.println(stats.ave(x));
		System.out.println(stats.ave(y));
		System.out.println(stats.std(x));
		System.out.println(stats.std(y));
		for (double entry : x){
			System.out.println(stats.zscore(entry,x));
		}
		System.out.println(stats.correl(x,y));
		System.out.println(stats.slope(x,y));
		System.out.println(stats.intercept(x,y));
		System.out.println(stats.yhat(x,y));
	}
}
