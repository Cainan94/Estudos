package br.com.cod3r.factory.apple.Complet.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhone11Pro;

public class Iphone11ProFactory  implements IphoneFactory {

    @Override
    public void createIphone(){
        IPhone device = new IPhone11Pro();
        device.assemble();
        device.getHardware();
        device.certificates();
        device.pack();
    }
}
