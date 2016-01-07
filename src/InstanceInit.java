import java.util.ArrayList;



public class InstanceInit {

	public static void main(String[] args) throws Exception {

		System.out.println("Starting application...");
		ArrayList<Olive> olives = new OliveJar().olives;//constructor.instanceInit
		for (Olive o:olives) {
			System.out.println("It's a " + o.oliveName
					+ " olive!");
		}
		
	}
	
}
