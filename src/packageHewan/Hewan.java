package packageHewan;

//Abstract class harus dibuat child classnya biar bisa dipake
public abstract class Hewan {
	protected String name;
	public void test() {
		System.out.println("test");
	}
	public abstract void bergerak();	
}
