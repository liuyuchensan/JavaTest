package classtek;

public  class Cube extends Exception{
	private double L;
	
	
	public  void Cube() {}
	public  void Cube(double L) throws CubeE{
		setL(L);
	}
	
	
	public void setL(double L) throws CubeE {
		if(L>0) {
		this.L=L;
		}else {
			throw new CubeE("錯誤");
		}
	}
	
	public double getL() {
		return L;
	}
	
	public void L3() {
		System.out.print(Math.pow(L, 3));
	}
}