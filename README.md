# java
2019311448 谢宇翔
java实验学生选课

# 阅读程序

## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 实验过程
* 首先依次创建好Personnel类、Students类、Teacher类，Students类和Teacher类都是Personnel类的子类，在其中提供构造方法以实现在main方法时的对象创建。。
* 然后完成Course类的编写，使其具有编号、课程名称、上课地点、时间、授课教师这几个属性。
* 最后编写含有main方法的XuankeG类，在其中将实现创建课程信息，并且实现交互式输入学生信息。

## 核心方法和代码
都是关于获取参数的简单方法，最后在XuankeG类中直接创建两个课程对象：
```java
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
course2.SetClassroom("102");
course2.GetClassroom();
course2.SetTime("8:00——10.00");
course2.GetTime();
course2.SteTeacherName("王淑霞");
course2.GetTeacherName();
```
***
利用在上面创建的课程中和授课教师相关的属性来创建两个教师对象：
```java
                Teacher teacher1 = new Teacher();
		teacher1.SetID(1);                     //教师编号
		teacher1.GetID();
		teacher1.SetCourse(course1.CourseName);//JAVA
		teacher1.GetCourse();
		teacher1.SetName(course1.TeacherName);//张世博
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
```
***
实现交互式输入学生信息：
```java
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
```
***
根据学生输入的课程号来匹配所选课程信息，并将完整的选课信息打印出来：
```java
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
```
***
最后加入一个是否退课的选项：
```java
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
```

##实验结果
<div align=center>< img width="20" height="20" src="https://github.com/guigui-cloud/java/blob/main/676aea4391684f655810fbee463f671.png"/></div>






