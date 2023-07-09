import com.gui.creation.builder.concrete.BuilderA;
import com.gui.creation.builder.concrete.Director;
import com.gui.creation.builder.products.ProductA;
import com.gui.creation.abstracfactory.factories.*;
import com.gui.creation.abstracfactory.products.*;
import com.gui.creation.factorymethod.factories.Apple;
import com.gui.creation.factorymethod.factories.CellphoneFactory;
import com.gui.creation.factorymethod.factories.*;
import com.gui.creation.factorymethod.interfaces.Cellphone;

public class Main {

    public static void main(String[] args) {

        //clientAbstractFactoryMethod();
        //clientBuilderMethod();
        clientFactoryMethod();

    }

    private static void clientFactoryMethod(){ // This is a very cool method. Very simple to use!

        CellphoneFactory factory = new Xiaomi();

        Cellphone cellphone = factory.createCellphone();

        cellphone.makeCall();



    }

    private static void clientBuilderMethod() {
        Director director = new Director();
        BuilderA builderA = new BuilderA();
        director.makeProductA(builderA);
        ProductA productA = (ProductA) builderA.getProduct();
        productA.setName("lasanha");
        System.out.println(productA.getParameterA());
        productA.setParameterA("hii");
        System.out.println(productA.getParameterA());
    }

    private static void clientAbstractFactoryMethod(){
        samsung samsung = new samsung();
        apple apple = new apple();

        String name = "Redmi";
        String description = "Melhor celular do mundo";
        double cost = 4000;

        Product product1 = samsung.createIphone13(name, description, cost);
        Product product2 = apple.createIphone(name, description, cost);
        Product product3 = apple.createIphone14(name,description,7000);

        System.out.println(product2.getClass().getSimpleName() + " from " + apple.getClass().getSimpleName() + " - " + product2.getName() + " : " + product2.getPrice());
        System.out.println(product1.getClass().getSimpleName() + " from " + samsung.getClass().getSimpleName() + " - " + product1.getName() + " : " + product1.getPrice());
        System.out.println(product3.getClass().getSimpleName() + " from " + apple.getClass().getSimpleName() + " - " + product3.getName() + " : " + product3.getPrice());

        product3.setProvider("Vivo");

    }
}
