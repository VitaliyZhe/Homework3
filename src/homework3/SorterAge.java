package homework3;

import java.util.Comparator;

public class SorterAge implements Comparator<Student> {

	@Override

	public int compare(Student o1, Student o2) {

		int age1 = o1.getAge();
		int age2 = o2.getAge();

		if (age1 > age2) {
			return -1;
		} else if (age1 < age2) {
			return 1;
		} else {
			System.out.println("Sorting!");
			return 0;
		}

	}
}
