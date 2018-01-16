
public interface I1{
	public static final int i = getI();
	public static final int j = getJ();

	public static int getI() {
		System.out.println("In I");
		System.out.println(i);
		return i;
	}

	public static int getJ() {
		System.out.println("In J");
		System.out.println(j);
		return j;
	}
	default int d() {
		System.out.println("");
		getI();
		return 0;
	}
	public static void main(String... args) {
		System.out.println("In main of interface");
	}
}