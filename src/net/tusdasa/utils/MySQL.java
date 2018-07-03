package net.tusdasa.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.log.log4j.Log4jMLog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import net.tusdasa.utils.Utils;

/**
 * @author Administrator
 * 
 * 本类做MySQL的连接类使用C3P0连接池
 *
 */
public class MySQL {
	/**
	 * 
	 * @param sql 查询语言
	 * @param args 参数个数
	 * @param parameter 参数数组
	 * @return ResultSet 结果集
	 * @throws SQLException
	 */

	public ResultSet SELECT(String sql, int args, String[] parameter) throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Connection connection = (Connection) dataSource.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		int check = 1;
		
		if (Check(args)) {
			for (; check < args + 1; check++) {
				preparedStatement.setString(check, parameter[check - 1].toString());
			}
		}
		Log4jMLog.info(Utils.getTime()+" SELECT: " + sql);
		ResultSet rs = preparedStatement.executeQuery();

		return rs;

	}
	
	/**
	 * 
	 * @param sql 查询语言
	 * @param args 参数个数
	 * @param parameter 参数数组
	 * @return ResultSet 结果集
	 * @throws SQLException
	 */

	public long UPDATE(String sql, int args, String[] parameter) throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Connection connection = (Connection) dataSource.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		int check = 1;
		
		if (Check(args)) {
			for (; check < args + 1; check++) {
				preparedStatement.setString(check, parameter[check - 1].toString());
				
			}
		}
		Log4jMLog.info(Utils.getTime()+" UPDATE: " + sql);
		long rs = preparedStatement.executeLargeUpdate();

		return rs;

	}
	
	/**
	 * 
	 * @param sql 查询语言
	 * @param args 参数个数
	 * @param parameter 参数数组
	 * @return ResultSet 结果集
	 * @throws SQLException
	 */

	public long INSTER(String sql, int args, String[] parameter) throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Connection connection = (Connection) dataSource.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		int check = 1;
		
		if (Check(args)) {
			for (; check < args + 1; check++) {
				preparedStatement.setString(check, parameter[check - 1].toString());
				
			}
		}
		Log4jMLog.info(Utils.getTime()+" INSTER: " + sql);
		long rs = preparedStatement.executeLargeUpdate();

		return rs;

	}
	
	
	/**
	 * 
	 * @param sql 查询语言
	 * @param args 参数个数
	 * @param parameter 参数数组
	 * @return ResultSet 结果集
	 * @throws SQLException
	 */

	public long DELETE(String sql, int args, String[] parameter) throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Connection connection = (Connection) dataSource.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		int check = 1;
		
		if (Check(args)) {
			for (; check < args + 1; check++) {
				preparedStatement.setString(check, parameter[check - 1].toString());
				
			}
		}
		Log4jMLog.info(Utils.getTime()+" DELETE: " + sql);
		long rs = preparedStatement.executeLargeUpdate();

		return rs;

	}
	
	/**
	 * 
	 * @param length 检查的参数个数
	 * @return
	 */

	private boolean Check(int length) {
		if (length < 0 && length == 0) {
			return false;
		} else {
			return true;
		}
	}

	
	
	  /*public static void main(String[] args) throws SQLException { 
	  MySQL m=new MySQL(); 
	  String sql="select id from test where name=? and pass=?"; 
	  String[] pa= {"admin","password"}; 
	  int a=2; 
	  ResultSet rs= m.SELECT(sql, a, pa);
	  while(rs.next()) 
	  { 
	  System.out.println(rs.getString(1));
	  System.out.println(rs.getString(2)); 
	  } }*/
	 
}
