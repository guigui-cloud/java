package xuankegai;

public class Course {
	long CourseID;
	String CourseName,classroom,time,TeacherName;
	
	public Course(long id) {
		CourseID = id;
	}
	
	public void SetCourseName(String name) {
		CourseName = name;
	}
	
	public String GetCourseName() {
		return CourseName;
	}
	
	public void SetClassroom(String room) {
		classroom = room;
	}
	
	public String GetClassroom() {
		return classroom;
	}
	
	public void SetTime(String Time) {
		time = Time;
	}
	
	public String GetTime() {
		return time;
	}
	
	public void SteTeacherName(String name) {
		TeacherName = name;
	}
	
	public String GetTeacherName() {
		return TeacherName;
	}
}
