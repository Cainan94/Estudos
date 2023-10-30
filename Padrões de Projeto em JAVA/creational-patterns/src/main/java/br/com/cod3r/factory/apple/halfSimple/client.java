package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factorys.Iphone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factorys.IphoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factorys.IphoneXFactory;

public class client {

    public static void main(String[] args) {
        System.out.println("Ordem Iphone X");
        IphoneFactory x = new IphoneXFactory();
        x.createIphone("standard");

        System.out.println("Ordem Iphone XS MAX");
        x.createIphone("advanced");

        System.out.println("Ordem Iphone 11");
        IphoneFactory iphone11Factory = new Iphone11Factory();
        iphone11Factory.createIphone("standard");

        System.out.println("Ordem Iphone XS MAX");
        iphone11Factory.createIphone("advanced");
    }
}
