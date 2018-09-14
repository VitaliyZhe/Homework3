package homework3;

public class GroupNull {
	public void sortArrayNull(Student g[]) {
		Student st[] = g;
		Student lastSt;
		for (int i = 0; i < st.length - 1; i++) {
			if (st[i] == null) {
				lastSt = st[i + 1];
				st[i] = lastSt;
				st[i + 1] = null;
			}
		}
	}
}
