package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

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

        System.out.println("=== TESTE 6: department update ===");

        department = departmentDao.findById(1);
        department.setName(" CellPhones ");
        departmentDao.update(department);

        System.out.println("Update Completed");
    }
}
