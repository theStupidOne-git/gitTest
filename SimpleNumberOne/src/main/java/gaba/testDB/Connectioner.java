package gaba.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Connectioner")
public class Connectioner extends HttpServlet {
private static final long serialVersionUID = 1L;	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
String user = "root";
String pass = "root";
String jdbcUrl = "jdbc:mysql://localhost/gaba_table?useSSL=false";
String driver = "com.mysql.jdbc.Driver";
try {
Class.forName(driver);
Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
out.println("USPESNE");
myConn.close();
}
catch (Exception exc) {
exc.printStackTrace();
out.println(exc.getMessage());
throw new ServletException(exc);
}
}
}
