package by.htp.univer;

public class Group {
	int number;
	Student students[];

	public void greatNewStudent() {
		System.out.println("Hello new Student!");
	}

	public int calculateAvgAge(Student[] student) {
		int avgAge = 0;
		int kolVoSt = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				avgAge += student[i].age;
				kolVoSt++;
			}
		}
		avgAge = avgAge / kolVoSt;
		return avgAge;
	}

	public int maxStudYear(Student[] student) {
		int kolVoSt = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].enterYear == 2015) {
				kolVoSt++;
			}
		}
		return kolVoSt;
	}

	public int yearMax(Student[] student) {//прогнать повторение года, и выводить кол-во его совпадений
		int yearMax = 0;
		for (int i = 0; i < students.length; students[i].enterYear++) {
			int kolVoSt;

		}
		return yearMax;
	}
}
