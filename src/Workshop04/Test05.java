package Workshop04;

public class Test05 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		System.out.println(s1.getName()+" ���:"+s1.getAvg()+" ����:"+s1.getGrade());
		System.out.println(s2.getName()+" ���:"+s2.getAvg()+" ����:"+s2.getGrade());
		System.out.println(s3.getName()+" ���:"+s3.getAvg()+" ����:"+s3.getGrade());

	}

}
