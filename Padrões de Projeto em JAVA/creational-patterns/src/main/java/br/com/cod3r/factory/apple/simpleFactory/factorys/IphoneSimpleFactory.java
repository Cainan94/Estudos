package br.com.cod3r.factory.apple.simpleFactory.factorys;

import br.com.cod3r.factory.apple.dados.model.*;

public class IphoneSimpleFactory {

    public void orderIphone(String generation, String level){
            if(generation.toLowerCase().equals("x")){
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
            } else if(generation.toLowerCase().equals("11")){
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
}
