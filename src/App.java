class Thing {
	public String name;
	public String description;
	public int id;
	public static int count;
	
	public Thing(String name) {
		this.name = name;
		id = count;
		count++;
	}
	
	public void outputThing() {
		System.out.println("This thing of id " + id + " has name of " + name);
	}
}
public class App {

	public static void main(String[] args) {
		
		Thing thing1 = new Thing("Bert");
		Thing thing2 = new Thing("Ernie");
		thing1.outputThing();
		thing2.outputThing();
		System.out.println("There are " + Thing.count + " things");

	}

}
