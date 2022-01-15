package packageHewan;

//interface bisa dipake lebih dari satu 
public class Kucing 
extends Hewan 
implements InterfaceHewan, InterfaceKedua {
	@Override
	public void bergerak(String name) {
		System.out.println("Kucing " + name + " berjalan");
	}
	
	@Override
	public void foo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void bergerak() {
		// TODO Auto-generated method stub
		
	}

}
