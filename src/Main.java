import com.gui.creation.factorymethod.Factory1;
import com.gui.creation.factorymethod.Factory2;
import com.gui.creation.factorymethod.Product;

public class Main {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Factory2 factory2 = new Factory2();

        String name = "Macarrão";
        String description = "Melhor massa do mundo";
        double cost = 10;

        Product product1 = factory1.createProduct('A', name, description, cost);
        Product product2 = factory2.createProduct('B', name, description, cost);
        Product product3 = factory2.createProduct('C', name, description, cost);

        System.out.println(product2.getClass().getSimpleName() + " - " + product2.getName() + " : " + product2.getPrice());
        System.out.println(product1.getClass().getSimpleName() + " - " + product1.getName() + " : " + product1.getPrice());
        System.out.println(product3.getClass().getSimpleName() + " - " + product3.getName() + " : " + product3.getPrice());
    }
}
