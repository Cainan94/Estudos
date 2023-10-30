package br.com.cod3r.factory.apple.simpleFactory;

import br.com.cod3r.factory.apple.simpleFactory.factorys.IphoneSimpleFactory;

public class client {
    public static void main(String[] args) {
        IphoneSimpleFactory simpleFactory = new IphoneSimpleFactory();

        System.out.println("-----------------------------------");
        simpleFactory.orderIphone("x","standard");
        System.out.println("-----------------------------------");
        simpleFactory.orderIphone("x","advanced");
        System.out.println("-----------------------------------");
        simpleFactory.orderIphone("11","standard");
        System.out.println("-----------------------------------");
        simpleFactory.orderIphone("11","advanced");
        System.out.println("-----------------------------------");

    }
}
