package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao(); //basicamente seu tipo real é um sellerdaojdbc
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dept = new Department(2, null); //dept sem nome, so pra teste
		List<Seller> list = sellerDao.findByDepartment(dept);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null,"Greg", "greg@gmail.com", new Date(), 4000.0, dept);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		 
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1); //cria um novo objeto com as caracts do seller com id 1
		seller.setName("Martha Waine"); //seta apenas na memoria do java, nao no banco
		sellerDao.update(seller); //muda no banco
		System.out.println("Update Complete!");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Entre id for delete test:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller deleted!");
		
	}
}
