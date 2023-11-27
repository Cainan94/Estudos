package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private VGA vga;

    public HDMIToVGAAdapter(VGA vga){
        System.out.println("Connecting the HDMI->VGA Adapter");
        this.vga = vga;
    }
    @Override
    public void setImage(String image) {
        System.out.println("Converting image to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("VGA not support Sounds");
    }
}
