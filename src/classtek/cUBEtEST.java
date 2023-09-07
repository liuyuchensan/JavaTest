package classtek;

public class cUBEtEST {
	
public static void main(String[] args) {
	Cube c = new Cube ();
	try {
		c.setL(-1);
		c.L3();
	} catch (CubeE e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
	}
	}
}
