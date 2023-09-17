import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ToyStore implements ToyStoreInterface {
	private final Map<Integer, Toy> toys = new HashMap<Integer, Toy>();
	private Queue<Toy> toysForSale = new LinkedList<Toy>();
	private static Integer ID = 0;

	@Override
	public Toy getToy() {
		
		return null;
	}

	@Override
	public String getInfo() {
		return toys.toString();
	}

	@Override
	public int changeWeightToy(int ID, int currentWeight) throws NullPointerException{
		toys.get(ID).setDefaultWeight(currentWeight);
		return toys.get(ID).getDefaultWeight();
	}

	@Override
	public int addToy(String toyName, int count, int weight) {
		toys.put(ID, new Toy(toyName, count, weight));
		return ID++;
	}
	/**
	 * @apiNote Метод добавления игрушек для розыгрыша
	 */
	@Override
	public void choiceToy(int ID) {
		toysForSale.add(toys.get(ID).unarChangeWeight());
	}

}
