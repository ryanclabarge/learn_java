public class Chapter5 {
	private double[] x, y;

	public Chapter5(){
	}

	public boolean setX(double a[]){
		x = a.clone();
		return true;
	}

	public boolean setY(double b[]){
		y = b.clone();
		return true;
	}

	public double ave(double[] data){
		double temp = 0;
		for (double g : data){
			temp += g;
		}
		return temp/data.length;
	}
	
	public double std(double[] data){
		double ave = ave(data);
		double temp = 0;
		for (double g : data){
			temp += (g-ave)*(g-ave);
		}
		return(Math.sqrt(temp/(data.length-1)));
	}

	public double zscore(double entry, double[] data){
		double ave = ave(data);
		double std = std(data);
		double z = (entry-ave)/std;
		return z;
	}
	
	public double correl(double[] data1,double[] data2){
		double temp = 0;
		for(int i=0;i<data1.length;i++){
			temp += zscore(data1[i],data1)*zscore(data2[i],data2);	
		}
		return (temp/(data1.length-1));
	}

	public double slope(double[] indep, double[] dep){
		return (correl(indep,dep)*((std(dep))/(std(indep))));
	}

	public double intercept(double[] indep, double[] dep){
		return (ave(dep)-(slope(indep,dep)*ave(indep)));
	}

	public double yhat(double[] indep, double[] dep, double value){
		return (intercept(indep,dep)+(slope(indep,dep)*value));
	}

	public String yhat(double[] indep, double[] dep){
		return ("y= "+intercept(indep,dep)+" + "+(slope(indep,dep)+"x"));
	}
}
