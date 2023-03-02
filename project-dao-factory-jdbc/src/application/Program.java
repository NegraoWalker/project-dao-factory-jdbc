package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
//		System.out.println("==== TEST 1: seller method findById ====");
//		Seller seller = sellerDao.findById(3);
//		
//		System.out.println(seller);
//		
//		System.out.println("\n==== TEST 2: seller method findByDepartment ====");
//		Department dep = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(dep);
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n==== TEST 3: seller method findByAll ====");
//		List<Seller> list = sellerDao.findAll();
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
		
//		System.out.println("\n==== TEST 4: seller method insert ====");
//		Department dep = new Department(2, null);
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5: seller method update ====");
		Seller seller = sellerDao.findById(1);
		seller.setName("Patrik Mendes");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		
		
		
		
		
	}

}
