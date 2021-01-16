package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println("=== TEST #1: seller::findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST #2: seller::findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST #3: seller::findAll ===");
        list = sellerDAO.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST #4: seller::insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = "+ newSeller.getId());

        System.out.println("\n=== TEST #5: seller::update ===");
        seller = sellerDAO.findById(1);
        seller.setName("Martha Wayne");
        sellerDAO.update(seller);
        System.out.println("Updated");

        System.out.println("\n=== TEST #6: seller::delete ===");
        sellerDAO.deleteById(9);
        System.out.println("Deleted");
    }
}
