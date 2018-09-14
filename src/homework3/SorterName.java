package homework3;

import java.util.Comparator;

public class SorterName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		String st1 = o1.getLastName();
		String st2 = o2.getLastName();

		return st1.compareTo(st2);

	}

}
