
public class Toy {
	private String name;
	/**
	 * @apiNote Количество игрушек
	 */
	private int count;
	/**
	 * @apiNote Вес игрушки
	 */
	private Integer defaultWeight;

	/**
	 * 
	 * @param name  Название игрушки
	 * @param count Количество игрушек
	 */
	public Toy(String name, int count, int weight) {
		this.name = name;
		this.count = count;
		this.defaultWeight = weight;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Toy: name=" + name + ", count=" + count+ ", weight=" + defaultWeight;
	}

	public Integer getDefaultWeight() {
		return defaultWeight;
	}
	/**
	 *  Метод который уменьшает количество игрушек на единицу
	 * 
	 */
	public Toy unarChangeWeight() {
		defaultWeight--;
		return this;
	}
	public void setDefaultWeight(Integer defaultWeight) {
		this.defaultWeight = defaultWeight;
	}
}
