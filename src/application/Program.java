package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        List<Department> departmentList = departmentDao.findAll();

        SellerDao sellerDao = DaoFactory.createSellerDao();
        List<Seller> sellerList = sellerDao.findAll();

        for (Department obj : departmentList) {
            System.out.println(obj);
        }

        for (Seller obj : sellerList) {
            System.out.println(obj);
        }
    }
}
