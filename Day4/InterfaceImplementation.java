package Day4;

public class InterfaceImplementation implements ISubtract, ISum{
	
	public static void main(String[] args) {
		
		InterfaceImplementation obj = new InterfaceImplementation();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add((float)2.0,(float)4.0));
		System.out.println(obj.subtract((float)5.0, (float)3.0));
		System.out.println(obj.subtract(10, 4));
	}

	public int subtract(int a, int b) {
		return a-b;
	}

	
	public float subtract(float a, float b) {
				return a-b;
	}

	
	public int add(int a, int b) {
		return a+b;
	}

	
	public float add(float a, float b) {
		return a+b;
	}

	@Override
	public float add(Float a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

}