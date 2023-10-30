package br.com.cod3r.factory.apple.halfSimple.factorys;

import br.com.cod3r.factory.apple.dados.model.IPhone;
import br.com.cod3r.factory.apple.dados.model.IPhone11;
import br.com.cod3r.factory.apple.dados.model.IPhone11Pro;

public class Iphone11Factory implements IphoneFactory {

    @Override
    public void createIphone(String level) {
        if(level.toLowerCase().equals("standard")){
            IPhone device = new IPhone11();
            device.assemble();
            device.getHardware();
            device.certificates();
            device.pack();

        } else if(level.toLowerCase().equals("advanced")){
            IPhone device = new IPhone11Pro();
            device.assemble();
            device.getHardware();
            device.certificates();
            device.pack();
        }
    }
}
