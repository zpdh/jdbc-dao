package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department department = new Department(1, null);

        Seller seller = sellerDao.findById(9);
        seller.setName("Greg Hobbins");
        sellerDao.update(seller);

        List<Seller> list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
