package fr.naimbendjebbour.model;

public class ProductB extends Products{

    static{
        ProductFactory.registerProducts("ProductB",new ProductB());
    }

    protected void ProductB(){}
    public void doIt () {
         System.out.println(" I ’m a ProductB , doing i t ");
    }

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
