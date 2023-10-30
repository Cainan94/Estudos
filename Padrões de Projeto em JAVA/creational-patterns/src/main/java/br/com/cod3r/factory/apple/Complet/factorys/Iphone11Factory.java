package br.com.cod3r.factory.apple.Complet.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhone11;

public class Iphone11Factory implements IphoneFactory {

    @Override
    public void createIphone(){
        IPhone device = new IPhone11();
        device.assemble();
        device.getHardware();
        device.certificates();
        device.pack();
    }
}
