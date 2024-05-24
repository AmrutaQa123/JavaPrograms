package packageTest;

public class Main implements Interface1,Interface2 {

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("display me first");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("display me second");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.display1();

	}

}
