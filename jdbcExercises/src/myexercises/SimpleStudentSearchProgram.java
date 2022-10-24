package myexercises;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import data_access.ConnectionParameters;
import data_access.DbUtils;

public class SimpleStudentSearchProgram {

	public static void main(String[] args) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;


			System.out.println("=== find Students by id ===");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student id: ");
			int input = Integer.parseInt(scan.nextLine());
			String answer = null;
		
			try {
				// 1. Open a database connection
				connection = DriverManager.getConnection(ConnectionParameters.connectionString,
						ConnectionParameters.username, ConnectionParameters.password);

				// 2. Define the SQL query text
				String sqlText = "SELECT id, firstname, lastname, streetaddress, postcode, postoffice FROM Student WHERE id = ?";

				// 3. Create a prepared statement based on the SQL query text
				preparedStatement = connection.prepareStatement(sqlText);
				preparedStatement.setInt(1, input);

				// 4. Execute the SQL query with the PreparedStatement object
				resultSet = preparedStatement.executeQuery();

				// 5. Iterate the results.
				// NB! The next() method moves the cursor to the next available row in the
				// results. Initially, the cursor is 'before the first row'.
				// The next() method returns false if there are no more rows.
				while (resultSet.next()) {

					// 6. Each column value has to be retrieved separately as below
					int id = resultSet.getInt("id");
					String firstname = resultSet.getString("firstname");
					String lastname = resultSet.getString("lastname");
					String streetaddress = resultSet.getString("streetaddress");
					int postcode = resultSet.getInt("postcode");
					String postoffice = resultSet.getString("postoffice");

					answer = id + ": " + firstname + " " + lastname + ", " + streetaddress + ", " + postcode + postoffice;
				}

                if(answer == null) {
					System.out.println("Unknown student id (" + input + ")");
				} else {
					System.out.println(answer);
				}
				
			} catch (SQLException sqle) {
				// 7. If any JDBC operation fails, we display an error message here
				System.out.println("\n[ERROR] Database error. " + sqle.getMessage());

			} finally {
				// 8. The resources should be closed as soon as we don't need them anymore
				DbUtils.closeQuietly(resultSet, preparedStatement, connection);
			
		}
	}
}