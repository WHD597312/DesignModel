package com.ph.factory;

public class ConcreteFactory extends Factory {

    @Override
    public Product createProduct(Class clz) {
        Product product=null;
        try{
            product= (Product) Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
