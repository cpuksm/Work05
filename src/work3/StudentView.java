package work3;

import java.util.*;

public class StudentView {

	public void viewStudent(Student st) {
		System.out.printf("%s %d %d %d\n", st.getName(), st.getAge(), st.getHeight(), st.getWeight());
	}

	public void viewStudentList(List<Student> list) {
		for (Student st : list) {
			System.out.printf("%s %d %d %d\n", st.getName(), st.getAge(), st.getHeight(), st.getWeight());
		}
	}
}
