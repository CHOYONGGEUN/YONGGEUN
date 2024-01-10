package javabasic.CH5.helloshop.order;

import javabasic.CH5.helloshop.product.Product;
import javabasic.CH5.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
