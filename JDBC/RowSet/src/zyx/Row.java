package zyx;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Row {
	public static void main(String[] args) {
		try {
		RowSetFactory rsf=RowSetProvider.newFactory();
		JdbcRowSet jrs=rsf.createJdbcRowSet();
		jrs.setUrl("jdbc:mysql://localhost:3306/me");
		jrs.setUsername("root");
		jrs.setPassword("vittal777");
		jrs.setCommand("select name,sport,id from sportsmen");
		jrs.execute();
		Scanner sc=new Scanner(System.in);
		jrs.moveToInsertRow();
		while(true) {
			System.out.println("Enter name : ");
			String name=sc.next();
			System.out.println("Enter sport : ");
			String sport=sc.next();
			jrs.updateString(1, name);
			jrs.updateString(2, sport);
			jrs.insertRow();
			System.out.println("Do you want to insert more rows? [Yes/No]");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("no")) {
				break;
			}	
		}
		sc.close();
		jrs.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
