package packageTest;

//Abstraction Example2
public class Dog extends Animal {

	@Override
	void dog() {
		// TODO Auto-generated method stub
		System.out.println("Bow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog d = new Dog();
      d.dog();
	}
}
