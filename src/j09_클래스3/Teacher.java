package j09_클래스3;

public class Teacher {

	private String subject;
	private int teacherCode;

	public Teacher(String subject, int teacherCode) {
		super();
		this.subject = subject;
		this.teacherCode = teacherCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}

}
