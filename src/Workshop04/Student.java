package Workshop04;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = (double)(getKorean()+getEnglish()+getMath()+getScience())/4;
		return avg;
	}
	public String getGrade() {
		String g;
		switch ((int)getAvg()/10) {
		case 9: g = "A"; break;
		case 8: 
		case 7: g = "B"; break;
		case 6: 
		case 5: g = "C"; break;
		case 4:
		case 3: g = "D"; break;
		default: g = "F"; break;
		
		}
		return g;
	}

}
