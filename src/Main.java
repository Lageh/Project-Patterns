import com.gui.creation.builder.concrete.BuilderA;
import com.gui.creation.builder.concrete.Director;
import com.gui.creation.builder.products.ProductA;
import com.gui.creation.factorymethod.factories.*;
import com.gui.creation.factorymethod.products.*;

public class Main {

    public static void main(String[] args) {

        //clientFactoryMethod();
        clientBuilderMethod();

    }

    private static void clientBuilderMethod() {
        Director director = new Director();
        BuilderA builderA = new BuilderA();
        director.makeProductB(builderA);
        ProductA productB = (ProductA) builderA.getProduct();
        productB.setName("lasanha");
        System.out.println(productB.getParameterA());
        productB.setParameterA("hii");
        System.out.println(productB.getParameterA());
    }

    public static void clientFactoryMethod(){
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
