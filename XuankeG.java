package xuankegai;

import java.util.Scanner;

public class XuankeG {

	public static void main(String[] args) {
		Course course1 = new Course(1001);
		course1.SetCourseName("JAVA");
		course1.GetCourseName();
		course1.SetClassroom("101");
		course1.GetClassroom();
		course1.SetTime("8:00——10.00");
		course1.GetTime();
		course1.SteTeacherName("张世博");
		course1.GetTeacherName();
		
		Course course2 = new Course(1002);
		course2.SetCourseName("高等数学");
		course2.GetCourseName();
		course2.SetClassroom("101");
		course2.GetClassroom();
		course2.SetTime("8:00——10.00");
		course2.GetTime();
		course2.SteTeacherName("王淑霞");
		course2.GetTeacherName();
		
		Teacher teacher1 = new Teacher();
		teacher1.SetID(1);
		teacher1.GetID();
		teacher1.SetCourse(course1.CourseName);
		teacher1.GetCourse();
		teacher1.SetName(course1.TeacherName);
		teacher1.GetName();
		teacher1.SetSex("男");
		teacher1.GetSex();
		
		Teacher teacher2 = new Teacher();
		teacher2.SetID(2);
		teacher2.GetID();
		teacher2.SetCourse(course2.CourseName);
		teacher2.GetCourse();
		teacher2.SetName(course2.TeacherName);
		teacher2.GetName();
		teacher2.SetSex("女");
		teacher2.GetSex();
		
		Scanner in = new Scanner(System.in);
		Students student = new Students();
		System.out.println("请输入你的id：");
		student.id = in.nextInt();
		System.out.println("请输入你的姓名：");
		Scanner in1 = new Scanner(System.in);
		student.name = in1.next();
		Scanner in2 = new Scanner(System.in);
		System.out.println("请输入你所选的课程号：");
		long SelectedID = in2.nextLong();
			
		if(SelectedID == 1001) {
			System.out.println("以下是你的选课信息：");
			System.out.println("学生姓名："+student.name);
			System.out.println("学生ID："+student.id);
			student.SetCourse(course1.CourseName);
			student.GetCourse();
			System.out.println("所选课程：："+course1.CourseName);
			System.out.println("授课教师："+teacher1.name);
			System.out.println("教师ID："+teacher1.id);
			System.out.println("上课地点："+course1.classroom);
			System.out.println("上课时间（24小时制）："+course1.time);
			}
		else if(SelectedID == 1002) {
			System.out.println("以下是你的选课信息：");
			System.out.println("学生姓名："+student.name);
			System.out.println("学生ID："+student.id);
			student.SetCourse(course2.CourseName);
			student.GetCourse();
			System.out.println("所选课程：："+course2.CourseName);
			System.out.println("授课教师："+teacher2.name);
			System.out.println("教师ID："+teacher2.id);
			System.out.println("上课地点："+course2.classroom);
			System.out.println("上课时间（24小时制）："+course2.time);
				
			}
		else {
			System.out.println("输入错误！");
			}
		
		System.out.println("---------------------");
		System.out.println("是否退课？（请输入Y或N）");
		Scanner in3 = new Scanner(System.in);
		String YoN = in3.next();
		if("Y".equals(YoN)) {
			System.out.println("退课成功");
			System.out.println("以下是你的选课信息：");
			System.out.println("学生姓名："+student.name);
			System.out.println("学生ID："+student.id);
			student.SetCourse(null);
			student.GetCourse();
			System.out.println("所选课程：：无");
			System.out.println("授课教师：无");
			System.out.println("教师ID：无");
			System.out.println("上课地点：无");
			System.out.println("上课时间（24小时制）：无");
		}
		else if("N".equals(YoN)) {
			System.out.println("选课成功~");
		}
		else {
			System.out.println("输入错误！");
		}
		// TODO 自动生成的方法存根
	}

}
