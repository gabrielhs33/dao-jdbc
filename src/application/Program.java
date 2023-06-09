package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("=== TESTE 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj : list){

            System.out.println(obj);
        }

        System.out.println("=== TESTE 3: seller findAll ===");
        list = sellerDao.findAll();

        for(Seller obj : list){

            System.out.println(obj);
        }

        System.out.println("=== TESTE 4: seller insert ===");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),5000, department);
        sellerDao.insert( newSeller );
        System.out.println("Inserted! New id = "+ newSeller.getId());

        System.out.println("=== TESTE 5: seller update ===");

        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);

        System.out.println("Update Completed");

        System.out.println("=== TESTE 6: seller delete ===");
        System.out.println("type the id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed");

        DB.closeConnection();
    }
}
