package nguyen.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import nguyen.dev.data.dao.CategoryDao;
import nguyen.dev.data.impl.CategoryImpl;
import nguyen.dev.data.model.Category;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryDao categoryDao = new CategoryImpl();
		Category cat = new Category(1, "Ao dai", "http://g");
		categoryDao.insert(cat);
	}
}
