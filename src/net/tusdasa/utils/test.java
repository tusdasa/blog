package net.tusdasa.utils;


import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.junit.Test;
import com.mchange.v2.c3p0.ComboPooledDataSource;




public class test {
	
	@Test
	public void testDB() {
		
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner queryRunner=new QueryRunner(dataSource);
		String sql="select username,password from users";
		ArrayHandler as=new ArrayHandler();
		Object[] a = null;
		try {
			 queryRunner.query(sql, as);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
