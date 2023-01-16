package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        p.product(2,5);
        p.product(1,3,4);
        p.product(5,7);
    }
}
class Product{
    public int product(int x, int y) {
        int prdct=x*y;
        return prdct;
    }
    public int product(int x, int y, int z) {
        int prdct=x*y*z;
        return prdct;
    }
    public double product(double x, double y) {
        double product=x*y;
        return product;
    }


}