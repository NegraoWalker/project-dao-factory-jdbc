package model.dao;

import db.DB;
import model.dao.implementation.DepartmentDAOJDBC;
import model.dao.implementation.SellerDAOJDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() { //Método de fábrica que retorna um objeto da interface instanciando o objeto da classe que implementa a mesma.
		return  new SellerDAOJDBC(DB.getConnection()); 
	}
	
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDAOJDBC(DB.getConnection());
	}
	
	
	
}
