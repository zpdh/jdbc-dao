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

        Department dep = departmentDao.findById(5);

        dep.setName("Gaming");

        departmentDao.update(dep);

        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}
