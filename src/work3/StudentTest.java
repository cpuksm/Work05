package work3;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		Student s0=new Student ("�ε鷹",15,170,55);
		Student s1=new Student ("���޷�",22,165,53);
		Student s2=new Student ("������",20,155,46);
		System.out.printf("%s %s %s %s\n", "�̸�","����","����","������");
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


