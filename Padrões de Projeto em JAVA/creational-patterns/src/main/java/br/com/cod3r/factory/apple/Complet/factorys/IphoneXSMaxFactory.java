package br.com.cod3r.factory.apple.Complet.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhoneXSMax;

public class IphoneXSMaxFactory implements IphoneFactory {

    @Override
    public void createIphone() {
        IPhone device = new IPhoneXSMax();
        device.assemble();
        device.getHardware();
        device.certificates();
        device.pack();
    }
}
