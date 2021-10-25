public class StudentMain{

	int studNo;
	Student studentDetails[];
	
	public StudentMain(int studNo){
		this.studentDetails=new Student[studNo];
		this.studNo=studNo;
		for(int i=0;i<studNo;i++) {
			int sMarks[]=new int[5];
			for(int j=0;j<5;j++) {
				sMarks[j]=j;
			}
			Student s=new Student(i,"Student"+i,sMarks,"Course"+i);
			
			this.studentDetails[i]=s;
		}
	}
	
	public void addStudent(Student data) {
		this.studentDetails[studNo++]=data;
	}
	
	public void deleteStudent() {
		this.studentDetails[studNo-1]=null;
		studNo--;
	}
	
	public void updateStudentdata(Student newData,int studNo) {
		this.studentDetails[studNo]=newData;
	}
	
	public double calStudWiseNumber(int studentNo) {
		double avg=0;
		int total=0;
		for(int i=0;i<5;i++) {
			total+=this.studentDetails[studentNo].marks[i];
		}
		avg=total/5;
		return avg;
	}
	
	public double subWiseNumber(int subNo) {
		double avg=0;
		int total=0;
		for(int i=0;i<3;i++) {
			total+=this.studentDetails[3].marks[subNo];
		}
		avg=total/5;
		return avg;
	}
	
	public static void main(String[] args) {
		StudentMain studentObj=new StudentMain(4);
		
		
		for(int i=0;i<studentObj.studNo;i++) {
			/*int sMarks[]=new int[5];
			for(int j=0;j<5;j++) {
				sMarks[j]=j;
			}
			Student s=new Student(i,"Student"+i,sMarks,"Course"+i);
			
			studentObj.addStudent(s);*/
			System.out.println(studentObj.studentDetails[i].name);
		}


		/*System.out.println("Student Details: \n");
		
		Student uStud=studentObj.studentDetails[1];
		uStud.setname("Shyam");
		
		studentObj.deleteStudent();
		
		for(int i=0;i<studentObj.studNo;i++) {
			System.out.println(studentObj.studentDetails[i].marks[2]);
		}*/
	}
	
}
