package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById ===");
        Department department = departmentDao.findById(3);

        System.out.println(department);


        System.out.println("=== TESTE 2: department findAll ===");
        List<Department> list = departmentDao.findAll();

        for(Department obj : list){

            System.out.println(obj);
        }

        System.out.println("=== TESTE 3: department insert ===");

        Department newDepartment = new Department(null, "Tools");
        departmentDao.insert( newDepartment );
        System.out.println("Inserted! New id = "+ newDepartment.getId());

        System.out.println("=== TESTE 4: department update ===");

        department = departmentDao.findById(1);
        department.setName(" CellPhones ");
        departmentDao.update(department);

        System.out.println("Update Completed");

        System.out.println("=== TESTE 5: department delete ===");
        System.out.println("type the id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed");

        DB.closeConnection();
    }
}
