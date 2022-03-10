package interfaceExample;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface{
	public void sayHello() {
		System.out.println(MyInterface.hello);
	}

	@Override
	public void sayGoodBye() {
		// TODO Auto-generated method stub
		System.out.println("Good Bye");
	}

}
