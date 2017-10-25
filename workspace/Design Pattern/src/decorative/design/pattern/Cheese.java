package decorative.design.pattern;

public class Cheese extends ToppingDecorator{

	public Cheese(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Cheese");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("Cheese");
		return pizza.getDescription()+", Cheese";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost()+12;
	}
	

}
