package homework3;

import java.io.FileNotFoundException;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Student st = new Student();
		Scanner scanner = new Scanner(System.in);

		GroupNull noNull = new GroupNull();
		Group group123 = new Group("group123");
		group123.addGroup((new Student("Petia", "Pupkin", 23, 71, 180, true, 4, 9)));
		group123.addGroup((new Student("Vika", "Aubka", 18, 58, 165, false, 1, 7)));
		group123.addGroup((new Student("Vova", "Druzhik", 18, 65, 180, true, 1, 7)));
		group123.addGroup((new Student("Kolia", "Druzhik", 17, 67, 181, true, 1, 4)));
		group123.addGroup((new Student("Liza", "Chukcha", 19, 60, 170, false, 2, 8)));
		group123.addGroup((new Student("Misha", "Moroz", 24, 65, 171, true, 5, 10)));
		group123.addGroup((new Student("Ania", "Bobik", 23, 55, 158, false, 4, 8)));
		group123.addGroup((new Student("Valik", "Elka", 20, 80, 160, true, 3, 2)));

		while (true) {
			System.out.println("1-Add new student");
			System.out.println("2-Del student Last Name");
			System.out.println("3- Find student");
			System.out.println("4- Out All group");
			System.out.println("5- Sorting Age");
			System.out.println("6- Sorting Last Name");
			System.out.println("7- Go Army");
			System.out.println("8- Output data to excel");

			switch (scanner.nextInt()) {

			case 1:

				noNull.sortArrayNull(group123.getGroupList());
				group123.addGroup(st.addStudentData(new Student()));
				break;

			case 2:
				noNull.sortArrayNull(group123.getGroupList());
				group123.delStudent();
				break;
			case 3:
				noNull.sortArrayNull(group123.getGroupList());
				group123.findStudent();

				break;
			case 4:

				noNull.sortArrayNull(group123.getGroupList());
				group123.groupInfo();
				group123.toCsv();
				break;
			case 5:
				try {
					noNull.sortArrayNull(group123.getGroupList());
					Arrays.sort(group123.getGroupList(), new SorterAge());
					break;
				} catch (NullPointerException ex) {
					for (int i = 0; i < group123.getGroupList().length; i++) {
						if (group123.getGroupList() != null) {
							group123.setGroupList(group123.getGroupList());
						}
					}

				}
				break;
			case 6:
				try {
					noNull.sortArrayNull(group123.getGroupList());
					Arrays.sort(group123.getGroupList(), new SorterName());
				} catch (NullPointerException ex) {
					for (int i = 0; i < group123.getGroupList().length; i++) {
						if (group123.getGroupList() != null) {
							group123.setGroupList(group123.getGroupList());
						}
					}

				}
				System.out.println("Sorted");
				break;
			case 7:
				group123.getStudentValidForArmy();
				break;
			case 8:
				noNull.sortArrayNull(group123.getGroupList());
				group123.toCsv();
				break;
			}

		}

	}
}
