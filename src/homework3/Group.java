package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {
	private Scanner scanner = new Scanner(System.in);
	private String groupName;
	private Student[] groupList = new Student[10];
	private Student[] goArmy;
	private String findName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;

	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getGroupList() {
		return groupList;
	}

	public void setGroupList(Student[] groupList) {
		this.groupList = groupList;
	}

	public Student[] getGoArmy() {
		return goArmy;
	}

	public void addGroup(Student newStud) {
		try {
			for (int i = 0; i <= groupList.length; i++) {
				if (groupList[i] == null) {
					groupList[i] = newStud;
					newStud.setGroup(this);
					break;
				}
			}

		} catch (ArrayIndexOutOfBoundsException ar) {

			System.out.println("There are no more places in the group");
			System.out.println();
		}

	}

	public void groupInfo() {
		for (Student st : groupList) {
			System.out.println(st);
		}
	}

	public void delStudent() {
		int i;
		i = findStudent();
		System.out.println("Student Removed: " + groupList[i].getFirstName() + " " + groupList[i].getLastName());
		groupList[i] = null;
		System.out.println();
	}

	public int findStudent() {
		int i;
		System.out.println("Enter Last name");
		findName = scanner.nextLine();
		for (i = 0; i < groupList.length; i++) {
			if (groupList[i] != null && groupList[i].getLastName().equalsIgnoreCase(findName)) {

				System.out.println("Student found: " + findName);
				System.out.println(groupList[i]);
				System.out.println("///////");
				return i;
			}

		}
		return -1;
	}

	@Override
	public String toString() {

		return Arrays.toString(groupList);
	}

	@Override
	public void getStudentValidForArmy() {
		int number = 0;
		for (int i = 0; i < groupList.length; i++) {

			if (groupList[i] != null) {
				if (groupList[i].getAge() >= 18 && groupList[i].getSex() == true) {
					number++;
				}
			}
		}

		goArmy = new Student[number];
		int calc = 0;
		System.out.println(goArmy.length + "People will go to the army");

		for (Student ss : groupList) {
			if (ss != null && ss.getAge() >= 18 && ss.getSex() == true) {
				goArmy[calc] = ss;
				calc++;
			}
		}
		for (Student st : goArmy) {
			System.out.println("Welcome to  army:" + st);
		}
	}
}
