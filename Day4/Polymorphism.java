package Day4;

public class Polymorphism {
	public static void main(String[] args) {
		int a = 4, b = 5;
		int finalValue = add(a, b);
		System.out.println(finalValue);

		float c = 4, d = 5;
		float finalValue2 = add(c, d);
		System.out.println(finalValue2);

		String e = "some ", f = " String";
		String finalValue3 = add(e, f);
		System.out.println(finalValue3);

		int g = 6;
		int sum = add(a, b, g);
		System.out.println(sum);
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static float add(float a, float b) {
		return a + b;
	}

	static String add(String a, String b) {
		return a + b;
	}

	// Invalid way to overload
//	static String add(int a, int b) {
//	return a+b;
//}

}
