package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

private Exam exam;
	
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	
	@Override
	public void print() {
		System.out.printf("Total is %d \n", exam.total());
		System.out.printf("Avg is %f\n\n", exam.avg());
	}

}
