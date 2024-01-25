import config.DBconfig;
import dao.StudentDAO;

import entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBconfig.class);
		StudentDAO studentDAO=context.getBean("studentDAO" , StudentDAO.class);

		Student student=new Student();
		student.setName("mehran");
		student.setAddress("karaj");

		studentDAO.save(student);

	}

}
