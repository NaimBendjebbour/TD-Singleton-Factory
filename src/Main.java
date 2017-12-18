import fr.naimbendjebbour.model.*;

public class Main {

    static{
        try{
            Class.forName("fr.naimbendjebbour.model.ProductA");
            Class.forName("fr.naimbendjebbour.model.ProductB");
            Class.forName("fr.naimbendjebbour.model.ProductC");
        }
        catch(ClassNotFoundException any)
        {
            any.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ProductFactory instance = new ProductFactory();
        ProductA a = (ProductA) instance.createProducts("ProductA");
        ProductB b = (ProductB) instance.createProducts("ProductB");
        ProductC c = (ProductC) instance.createProducts("ProductC");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a.doYourStuff();
        b.doIt();
        c.perform();
    }
}
