package br.com.cod3r.factory.apple.halfSimple.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhoneX;
import br.com.cod3r.factory.apple.dados.model.IPhoneXSMax;

public class IphoneXFactory implements IphoneFactory {
    @Override
    public void createIphone(String level) {
        if(level.toLowerCase().equals("standard")){
            IPhone device = new IPhoneX();
            device.assemble();
            device.getHardware();
            device.certificates();
            device.pack();

        } else if(level.toLowerCase().equals("advanced")){
            IPhone device = new IPhoneXSMax();
            device.assemble();
            device.getHardware();
            device.certificates();
            device.pack();
        }
    }
}
