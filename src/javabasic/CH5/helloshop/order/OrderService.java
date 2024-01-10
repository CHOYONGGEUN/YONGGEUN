package javabasic.CH5.helloshop.order;

import javabasic.CH5.helloshop.product.Product;
import javabasic.CH5.helloshop.user.User;

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);

    }

}
