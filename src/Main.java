
public class Main {
	public static void main(String[] args) {
		ToyStoreInterface test = new ToyStore();
		test.addToy("Самолет", 10, 25);
		test.addToy("Автомат", 15, 25);
		test.addToy("Кукла", 5, 25);
		test.addToy("Слизняк", 20, 25);
		System.out.println(test.getInfo());
		
		test.changeWeightToy(3, 0);
		System.out.println(test.getInfo());
		
	}
}
