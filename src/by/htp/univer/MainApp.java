package by.htp.univer;

//массив это объект, а не последовательность €чеек пам€ти
public class MainApp {
	public static void main(String[] args) {
		int x = 0;
		x = 3;// переменна€ примитивного типа
		
		
		Student student = new Student();// ссылочного типа - ссылка
		student.age = 20;
		student.name = "Igor";
		student.surname = "Blinov";
		student.enterYear = 2015;
		
		
		Student student2 = new Student();
		student2.age = 22;
		student2.name = "Anna";
		student2.surname = "Ivanova";
		student2.enterYear = 2014;

		Student student3 = new Student();
		
		student3.age = 24;
		student3.name = "Olya";
		student3.surname = "Petrova";
		student3.enterYear = 2015;
		
		Student student4 = new Student();
		
		Group group = new Group();
		group.number = 1;
		group.students = new Student[10];
		group.students[0] = student2;
		group.students[1] = student;
		group.students[2] = student3;
		System.out.println("—редний возраст в группе " + group.calculateAvgAge(group.students));
		System.out.println("за 2015 год в группу было зачислено " + group.maxStudYear(group.students));
	}
}
