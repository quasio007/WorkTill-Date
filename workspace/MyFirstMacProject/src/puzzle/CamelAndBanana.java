package puzzle;

public class CamelAndBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// avg is in Km/banana
		double capacity, avg, distance, totalBanana, bananasLeft, bananasLeft1;
		capacity = 1000;
		avg = 1;
		totalBanana = 3000;
		distance = 1000;
		bananasLeft = calculate(totalBanana, capacity, distance, distance, avg, 0.0);
		bananasLeft1 = calculate1(totalBanana, capacity, distance, avg, 0.0);
		System.out.println(bananasLeft);
		System.out.println();
		System.out.println(bananasLeft1);
	}

	static double calculate(double N, double C, double D, double d, double avg, double sum) {
		double fac;

		double g, y, h;
		int n, c;
		n = (int) N;
		c = (int) C;
		fac = Math.floorDiv(n, c);
		g = 2 * fac;

		if (N % C == 0) {
			h = fac - 1;
			g = g - 1;
			y = (avg * C) / (g);
		} else {
			h = fac;
			g = g + 1;
			y = (avg * (N - (C * fac))) / (g);
		}
		sum = sum + y;
		if (sum >= D) {
			return N - ((g / avg) * (d));
		} else if (h != 0) {
			N = C * h;
			d = d - y;
			return calculate(N, C, D, d, avg, sum);
		} else {
			System.out.println("Place is out of reach in given possible senario");
			System.out.println("Maimum distance till camel can go is : '" + sum + "'");
			return 0;
		}
	}

	static double calculate1(double N, double C, double D, double avg, double sum) {
		double fac;
		double sumlastValue;
		double g, y, h;
		int n, c;
		n = (int) N;
		c = (int) C;
		fac = Math.floorDiv(n, c);
		g = 2 * fac;

		if (N % C == 0) {
			h = fac - 1;
			g = g - 1;
			y = (avg * C) / (g);
		} else {
			h = fac;
			g = g + 1;
			y = (avg * (N - (C * fac))) / (g);
		}
		sumlastValue = sum;
		sum = sum + y;
		if (sum >= D) {
			D = D - sumlastValue;
			return N - ((g / avg) * (D));
		} else if (h != 0) {
			N = C * h;
			// d = d - y;
			return calculate1(N, C, D, avg, sum);
		} else {
			System.out.println("Place is out of reach in given possible senario");
			System.out.println("Maimum distance till camel can go is : '" + sum + "'");
			return 0;
		}
	}
}
