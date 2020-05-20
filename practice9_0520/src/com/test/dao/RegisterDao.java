package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import com.test.beans.Register;

public class RegisterDao {
	public static Connection getConnection()
			throws NamingException, SQLException {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
		return ds.getConnection();
	}
	public static List<Register> getAllRecords()
			throws NamingException, SQLException {
		List<Register> list = new ArrayList<Register>();
		Connection conn = getConnection();
		String strSql = "SELECT * FROM REGISTER ORDER BY ID DESC";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Register r = new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setSex(rs.getString("SEX"));
			r.setEmail(rs.getString("EMAIL"));
			r.setCountry(rs.getString("COUNTRY"));
			list.add(r);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	public static int save(Register r) {
		return 0;
	}
	public static int update(Register r) {
		return 0;
	}
	public static int delete(Register r) {
		return 0;
	}
	public static Register getRecordById(int id) 
			throws NamingException, SQLException {
		Connection conn = getConnection();
		String strSql = "SELECT * FROM REGISTER WHERE ID = ?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Register r = null;
		while(rs.next()) {
			r = new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setSex(rs.getString("SEX"));
			r.setEmail(rs.getString("EMAIL"));
			r.setCountry(rs.getString("COUNTRY"));
		}
		rs.close();
		stmt.close();
		conn.close();
		return r;
	}
}