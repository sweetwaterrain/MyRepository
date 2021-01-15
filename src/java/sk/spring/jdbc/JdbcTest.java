package sk.spring.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTest {

	@Test
	public void insert () throws Exception{
		// 1. 获取c3p0连接池对象  --> 数据源
		ComboPooledDataSource ds = new ComboPooledDataSource();
		// 2. 对这个对象进行配置
		// 1. 可以通过properties文件来配置
		// 2. 通过代码直接配置
		// 配置驱动
		ds.setDriverClass("com.mysql.jdbc.Driver");
		// 配置连接字符串
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/db1");
		// 配置用户名、密码
		ds.setUser("root");
		ds.setPassword("root");

		// spring 封装jdbc的对象
		JdbcTemplate template = new JdbcTemplate();

		// template 执行数据源
		template.setDataSource(ds);

		// 编写sql语句
		String sql = "insert into user values (2,'小王')";

		// 执行sql代码
		template.update(sql);
	}
}
