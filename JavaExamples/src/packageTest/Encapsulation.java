package packageTest;

public class Encapsulation {

	private String name = "Amruta";
	private String emplyoeeId = "E450";
	
	public String getMethod() {
		return name;
	}
	
	public void setMethod(String Name) {
		this.name = Name;
	}
	
	public static void main(String[] args) {
		Encapsulation j = new Encapsulation();
//		j.setMethod("Pavi"); //To alter data
		System.out.println(j.getMethod());
	}

}
