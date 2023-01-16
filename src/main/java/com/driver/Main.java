package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int firstansValue = p.product(2, 3);
        int secondansValue = p.product(1, 3, 4);
        double thirdansValue = p.product(5, 7);
    }

    static class Product {
        public int product(int x, int y) {
            int prdct = x * y;
            return prdct;
        }

        public int product(int x, int y, int z) {
            int prdct = x * y * z;
            return prdct;
        }

        public double product(double x, double y) {
            double prdct = x * y;
            return prdct;
        }

    }
}