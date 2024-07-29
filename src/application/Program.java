package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department department = new Department(1, null);

        Seller newSeller = new Seller(null, "Greg Emmoth", "gregemmoth@gmail.com", new Date(), 4000.0, department);

        sellerDao.insert(newSeller);

        List<Seller> list = sellerDao.findAll();

        for (Seller seller : list) {
            System.out.println(seller);
        }
    }
}
