
public interface ToyStoreInterface {
	int addToy(String toyName, int count, int weight);

	Toy getToy();

	int changeWeightToy(int ID, int weight);

	String getInfo();

	void choiceToy(int ID);
}
