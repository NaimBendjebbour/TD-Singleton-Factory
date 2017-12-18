package fr.naimbendjebbour.model;

import java.util.HashMap;
import java.util.Map;

public final class ProductFactory {
    private static Map<String,Product> registre = new HashMap<String,Product>();

    public static void registerProducts(String name, Product prod)
    {
        registre.put(name,prod);
    }

    public Product createProducts(String Name)
    {
        return registre.get(Name).createProduct();
    }
}
