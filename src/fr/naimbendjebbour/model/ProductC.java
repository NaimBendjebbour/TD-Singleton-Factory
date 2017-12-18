package fr.naimbendjebbour.model;

public class ProductC extends Products{

    static{
        ProductFactory.registerProducts("ProductC",new ProductC());
    }

    protected void ProductC(){}
    public void perform () {
         System.out.println (" I ’m a ProductC , per forming ");
    }

    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
