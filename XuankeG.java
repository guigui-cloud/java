package xuankegai;

import java.util.Scanner;

public class XuankeG {

	public static void main(String[] args) {
		Course course1 = new Course(1001);
		course1.SetCourseName("JAVA");
		course1.GetCourseName();
		course1.SetClassroom("101");
		course1.GetClassroom();
		course1.SetTime("8:00����10.00");
		course1.GetTime();
		course1.SteTeacherName("������");
		course1.GetTeacherName();
		
		Course course2 = new Course(1002);
		course2.SetCourseName("�ߵ���ѧ");
		course2.GetCourseName();
		course2.SetClassroom("101");
		course2.GetClassroom();
		course2.SetTime("8:00����10.00");
		course2.GetTime();
		course2.SteTeacherName("����ϼ");
		course2.GetTeacherName();
		
		Teacher teacher1 = new Teacher();
		teacher1.SetID(1);
		teacher1.GetID();
		teacher1.SetCourse(course1.CourseName);
		teacher1.GetCourse();
		teacher1.SetName(course1.TeacherName);
		teacher1.GetName();
		teacher1.SetSex("��");
		teacher1.GetSex();
		
		Teacher teacher2 = new Teacher();
		teacher2.SetID(2);
		teacher2.GetID();
		teacher2.SetCourse(course2.CourseName);
		teacher2.GetCourse();
		teacher2.SetName(course2.TeacherName);
		teacher2.GetName();
		teacher2.SetSex("Ů");
		teacher2.GetSex();
		
		Scanner in = new Scanner(System.in);
		Students student = new Students();
		System.out.println("���������id��");
		student.id = in.nextInt();
		System.out.println("���������������");
		Scanner in1 = new Scanner(System.in);
		student.name = in1.next();
		Scanner in2 = new Scanner(System.in);
		System.out.println("����������ѡ�Ŀγ̺ţ�");
		long SelectedID = in2.nextLong();
			
		if(SelectedID == 1001) {
			System.out.println("���������ѡ����Ϣ��");
			System.out.println("ѧ��������"+student.name);
			System.out.println("ѧ��ID��"+student.id);
			student.SetCourse(course1.CourseName);
			student.GetCourse();
			System.out.println("��ѡ�γ̣���"+course1.CourseName);
			System.out.println("�ڿν�ʦ��"+teacher1.name);
			System.out.println("��ʦID��"+teacher1.id);
			System.out.println("�Ͽεص㣺"+course1.classroom);
			System.out.println("�Ͽ�ʱ�䣨24Сʱ�ƣ���"+course1.time);
			}
		else if(SelectedID == 1002) {
			System.out.println("���������ѡ����Ϣ��");
			System.out.println("ѧ��������"+student.name);
			System.out.println("ѧ��ID��"+student.id);
			student.SetCourse(course2.CourseName);
			student.GetCourse();
			System.out.println("��ѡ�γ̣���"+course2.CourseName);
			System.out.println("�ڿν�ʦ��"+teacher2.name);
			System.out.println("��ʦID��"+teacher2.id);
			System.out.println("�Ͽεص㣺"+course2.classroom);
			System.out.println("�Ͽ�ʱ�䣨24Сʱ�ƣ���"+course2.time);
				
			}
		else {
			System.out.println("�������");
			}
		
		System.out.println("---------------------");
		System.out.println("�Ƿ��˿Σ���������Y��N��");
		Scanner in3 = new Scanner(System.in);
		String YoN = in3.next();
		if("Y".equals(YoN)) {
			System.out.println("�˿γɹ�");
			System.out.println("���������ѡ����Ϣ��");
			System.out.println("ѧ��������"+student.name);
			System.out.println("ѧ��ID��"+student.id);
			student.SetCourse(null);
			student.GetCourse();
			System.out.println("��ѡ�γ̣�����");
			System.out.println("�ڿν�ʦ����");
			System.out.println("��ʦID����");
			System.out.println("�Ͽεص㣺��");
			System.out.println("�Ͽ�ʱ�䣨24Сʱ�ƣ�����");
		}
		else if("N".equals(YoN)) {
			System.out.println("ѡ�γɹ�~");
		}
		else {
			System.out.println("�������");
		}
		// TODO �Զ����ɵķ������
	}

}
