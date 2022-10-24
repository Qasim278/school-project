package myexercises;

import com.google.gson.Gson;

public class StudentJSONProgram {

	public static void main(String[] args) {


		Gson gson = new Gson();
		String jsonString = gson.toJson(StudentDAO.getAllStudentsJSON());

	}

}
