import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Product> products = new HashSet<>(); //상품 목록

    Product toothPaste = new Product("1", "치약", 1000);
    Product toothBrush = new Product("2", "칫솔", 1500);
    Product shampoo = new Product("3", "샴푸", 3000);
    Product rinse = new Product("4", "린스", 4000);

    products.add(toothPaste);
    products.add(toothBrush);
    products.add(shampoo);
    products.add(rinse);

    for (Product product: products) {
      System.out.println(product.getName());
    }

    //장바구니
    Cart myCart = new Cart();
    myCart.addProduct(toothPaste, 1);
    myCart.addProduct(toothBrush, 1);

    myCart.removeProduct(toothPaste, 2);

    System.out.println(myCart.showItems());
  }
}