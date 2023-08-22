package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/java_db",
				"root",
				"password");) {
			System.out.println("データベース接続成功!!");
			System.out.println(con);

		} catch (SQLException e) {
			System.out.println("データベース接続失敗：" + e.getMessage());
		}

	}

}
