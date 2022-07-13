package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		// DI(Dependency Injection)를 직접 구현한 코드 
		Exam exam = new NewlecExam(); 
//		ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.print();
		
	}

}
