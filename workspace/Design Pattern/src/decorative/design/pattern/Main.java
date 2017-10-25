package decorative.design.pattern;

public class Main {

	public static void main(String[] args) {
		
		Pizza orderedPizza =new Cheese(new Tomato(new Onion(new ThinDoughPizza()))) ;
		System.out.println("Description : "+orderedPizza.getDescription());
		System.out.println("Cost : "+orderedPizza.getCost());
	}

}
