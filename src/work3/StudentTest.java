package work3;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		Student s0=new Student ("민들레",15,170,55);
		Student s1=new Student ("진달래",22,165,53);
		Student s2=new Student ("개나리",20,155,46);
		System.out.printf("%s %s %s %s\n", "이름","나이","신장","몸무게");
		System.out.println("================================");
		StudentView sv = new StudentView();
		sv.viewStudent(s0);
		List<Student> all = new ArrayList<>();
		all.add(s0);
		all.add(s1);
		all.add(s2);
		System.out.print("\n\n");
		sv.viewStudentList(all);
		
		
	}

	}


