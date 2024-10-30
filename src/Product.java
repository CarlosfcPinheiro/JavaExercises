import java.util.Scanner;

public class Product {
    String Prodname;
    double Prodprice;
    int Prodquantity;

    Product(String name, double price, int quantity) {
        Prodname = name;
        Prodprice = price;
        Prodquantity = quantity;
    }

    static String[] ReciveData() {
        Scanner sc = new Scanner(System.in);
        String[] info = new String[3];

        System.out.print("Nome do produto: ");
        info[0] = sc.nextLine().trim();
        System.out.print("Preço do produto: ");
        info[1] = sc.nextLine().trim();
        System.out.print("Quantidade do produto: ");
        info[2] = sc.nextLine().trim();

        return info;
    }

    void TotalProducts() {
        System.out.println("\nTotal de produtos: " + this.Prodquantity);
    }

    void addProducts(int newprods) {
        this.Prodquantity += newprods;
    }

    void removeProducts(int remprods) {
        this.Prodquantity -= remprods;
    }

    public static void main(String[] args) {
        String[] ProductInfo = ReciveData();

        Product product1 = new Product(
                ProductInfo[0],
                Double.parseDouble(ProductInfo[1]),
                Integer.parseInt(ProductInfo[2])
        );

        product1.TotalProducts();
        product1.addProducts(5);
        product1.TotalProducts();
    }
}
