package br.com.cod3r.factory.apple.Complet.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhoneX;

public class IphoneXFactory  implements IphoneFactory {

    @Override
    public void createIphone(){
        IPhone device = new IPhoneX();
        device.assemble();
        device.getHardware();
        device.certificates();
        device.pack();
    }
}
