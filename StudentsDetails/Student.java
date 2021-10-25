public class Student {
	int roll;
	String name;
	int marks[];
	String courseName;
	

	public Student() {
		this.roll = 0;
		this.name = "";
		this.marks =new int[5];
		this.courseName = "";
	}
	
	public Student(int roll,String name,int marks[],String courseName){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this.courseName=courseName;
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setMarks(int[] marks) {
		this.marks=marks;
	}
	
}
