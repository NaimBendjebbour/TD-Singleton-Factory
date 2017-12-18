package fr.naimbendjebbour.model;

public class ProductA extends Products{

    static{
        ProductFactory.registerProducts("ProductA",new ProductA());
    }

    protected void ProductA(){}


    public void doYourStuff () {
         System.out.println(" I ’m a ProductA , doing my s t u f f ");
         }

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
