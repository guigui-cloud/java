package xuankegai;

public class Personnel {
	int id;
	String name,sex,course;
	public Personnel() {}
	
	public void SetID(int perid) {
		id = perid;
	}
	
	public int GetID() {
		return id;
	}
	
	public void SetName(String pername) {
		name = pername;
	}
	
	public String GetName() {
		return name;
	}
	
	public void SetSex(String persex) {
		sex = persex;
	}
	
	public String GetSex() {
		return sex;
	}
	
	public void SetCourse(String percourse) {
		course = percourse;
	}
	
	public String GetCourse() {
		return course;
	}
	
}
