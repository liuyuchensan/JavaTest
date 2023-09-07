package work3;

public  class WeightTest  {
	public static void main(String args[]) {
		WeightMethod[] w =new WeightMethod[3];
		w[0] = new Plane("波音747",3500);
		w[1] = new Dog("fick",40);
		w[2] = new Powder("blue",20);
		for(int i =0;i<w.length;i++) {
			w[i].getWeightMethod();
		}
	}
}
