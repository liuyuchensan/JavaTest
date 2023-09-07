package work8;

import java.util.Objects;

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number,String type,String start,String dest,double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
		};
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(number);
	}


	@Override
	public int compareTo(Train o) {
		if(this.number>o.number) {
			return 1;
		}else if(this.number<o.number) {
			return -1;
		}
		return 0;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

}