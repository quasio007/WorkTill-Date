package decorative.design.pattern;

public class ThickDoughPizza implements Pizza{

	@Override
	public String getDescription() {
//		System.out.println("Adding Thick Dough");
		return "Thick Dough";
	}

	@Override
	public double getCost() {
		
		return 10;
	}

}
