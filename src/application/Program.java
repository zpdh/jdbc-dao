package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department d = new Department(1, "D1");
        Seller s = new Seller(1, "name", "example@gmail.com", new Date(), 3000.0, d);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(d);
        System.out.println(s);
    }
}
