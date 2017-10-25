package decorative.design.pattern;

public class ThinDoughPizza implements Pizza{

	@Override
	public String getDescription() {
//		System.out.println("Adding Thin Dough");
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		
		return 5;
	}

}
