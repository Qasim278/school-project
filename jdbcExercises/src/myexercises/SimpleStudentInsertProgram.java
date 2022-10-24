package myexercises;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import data_access.ConnectionParameters;
import data_access.DbUtils;

public class SimpleStudentInsertProgram {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int errorCode = -1;

		Scanner scan = new Scanner(System.in);

		System.out.println("=== Add Students ===");

		System.out.println("Id:");
		int id1 = Integer.parseInt(scan.nextLine());

		System.out.println("First Name:");
		String firstName = scan.nextLine();

		System.out.println("Last Name:");
		String lastName = scan.nextLine();

		System.out.println("Street:");
		String street = scan.nextLine();

		System.out.println("Post Code:");
		int postCode = Integer.parseInt(scan.nextLine());

		System.out.println("Post Office:");
		String postOffice = scan.nextLine();

		try {
			
			connection = DriverManager.getConnection(ConnectionParameters.connectionString,
					ConnectionParameters.username, ConnectionParameters.password);
			
			String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?,?,?,?,?,?)";

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, id1);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, street);
			preparedStatement.setInt(5, postCode);
			preparedStatement.setString(6, postOffice);

			preparedStatement.executeUpdate();
			errorCode = 0;
			
			System.out.println("Student data added!");


		} catch (SQLException sqle) {
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				errorCode = 1;
			} else {
				System.out.println(sqle.getMessage() + "\n");
				errorCode = -1;
			}

		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}
	}
}