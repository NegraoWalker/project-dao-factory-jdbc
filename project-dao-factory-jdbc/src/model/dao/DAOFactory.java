package model.dao;

import model.dao.implementation.SellerDAOJDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() { //Método de fábrica que retorna um objeto da interface instanciando o objeto da classe que implementa a mesma.
		return (SellerDAO) new SellerDAOJDBC(); //Revisar isso aqui pois está diferente do professor
	}
}
