package homework3;
public class Human {

	private String firstName;
	private String lastName;
	private int age;
	private int weight;
	private int height;
	private boolean sex;

	public Human(String firstName, String lastName, int age, int weight, int height, boolean sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.sex = sex;

	}

	public Human() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
			this.firstName = firstName;;
        
        
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			System.out.println("Incorrectly entered age");
			
		}

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", weight=" + weight + ", height="
				+ height + ", sex=" + (getSex() ? "man" : "whoman");
	}

}
