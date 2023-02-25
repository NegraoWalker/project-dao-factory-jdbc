package application;

import java.time.LocalDate;

//import model.dao.DAOFactory;
//import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now() , 3000.00, obj);
		System.out.println(seller);
		
//		SellerDAO sellerDao = DAOFactory.createSellerDAO(); //Instanciando um objeto da interface SellerDAO a partir do método static da classe DAOFactory
		
		
		
		
		
		
		
		
		
	}

}
