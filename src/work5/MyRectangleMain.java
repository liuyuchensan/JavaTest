package work5;

public class MyRectangleMain {
	public static void main(String[] args){
		MyRectangle m = new MyRectangle();
		m.setWidth(10);
		m.setdepth(20);
		System.out.println(m.getArea());
		MyRectangle m2 = new MyRectangle(10,20);
	}

}
