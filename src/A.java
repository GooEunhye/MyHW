public class A {
	public static void main(String[] args) {
		System.out.println("****************");
		B b = new B("Hello!");
		b.println();
		C c = new C("World!");
		b.show();
	}
}