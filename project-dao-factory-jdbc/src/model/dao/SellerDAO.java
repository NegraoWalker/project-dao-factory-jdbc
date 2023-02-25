package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {
	//Métodos da interface:
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
		Seller findById(Integer id);
		List<Seller> findAll();
		
}
