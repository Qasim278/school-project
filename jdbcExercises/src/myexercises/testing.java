package myexercises;

import java.util.List;

public class testing implements StudentDAO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = StudentDAO.getStudentByID(100);
		
		for(Student s : list) {
			
			System.out.println(s);
			
		}
		
		if(list.size() == 0) {
			System.out.println("Unknown student id (" + 100+ ")");
		}
	}

}
