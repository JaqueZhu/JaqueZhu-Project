package pojo;

public class Cloth {
	private int clothid;
	private String clothsort;
	private String clothbrand;
	private String clothstyle;
	private double clothprice;
	public int getClothid() {
		return clothid;
	}
	public void setClothid(int clothid) {
		this.clothid = clothid;
	}
	public String getClothsort() {
		return clothsort;
	}
	public void setClothsot(String clothsort) {
		this.clothsort = clothsort;
	}
	public String getClothbrand() {
		return clothbrand;
	}
	public void setClothbrand(String clothbrand) {
		this.clothbrand = clothbrand;
	}
	public String getClothstyle() {
		return clothstyle;
	}
	public void setClothstyle(String clothstyle) {
		this.clothstyle = clothstyle;
	}
	public double getClothprice() {
		return clothprice;
	}
	public void setClothprice(double clothprice) {
		this.clothprice = clothprice;
	}
	public Cloth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cloth(int clothid,String clothsort, String clothbrand, String clothstyle, double clothprice) {
		super();
		this.clothid = clothid;
		this.clothsort = clothsort;
		this.clothbrand = clothbrand;
		this.clothstyle = clothstyle;
		this.clothprice = clothprice;
	}
	@Override
	public String toString() {
		return "Cloth [clothid=" + clothid + ", clothsort=" + clothsort +", clothbrand=" + clothbrand + ", clothstyle=" + clothstyle + ", clothprice=" + clothprice + "]";
	}
}