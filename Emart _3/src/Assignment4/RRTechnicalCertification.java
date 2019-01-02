package Assignment4;

abstract class RRTechnicalCertification implements Certification {
	private String studentName;
	private String courseName;
	private int reg_id;
	private int admissionTestMark;
	public static int counter = 1000;
	
	RRTechnicalCertification(String name, String course, int marks){
		this.studentName=name;
		this.courseName=course;
		this.admissionTestMark=marks;
	}
	
	

	public String getStudentName() {
		return studentName;
	}



	public String getCourseName() {
		return courseName;
	}



	public int getReg_id() {
		return reg_id;
	}



	public int getAdmissionTestMark() {
		return admissionTestMark;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}



	public void setAdmissionTestMark(int admissionTestMark) {
		this.admissionTestMark = admissionTestMark;
	}



	public static void setCounter(int counter) {
		RRTechnicalCertification.counter = counter;
	}

	public abstract void generateRegistrationId();
	
	//@Override
	public abstract double calculateFee();
	public abstract void display();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}