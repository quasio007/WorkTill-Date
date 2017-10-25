import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
	String currentLocation = System.getProperty("user.dir");
	System.out.println(currentLocation);
	
	Path path = Paths.get(currentLocation);
	System.out.println(path.getNameCount());
	

	}

}
