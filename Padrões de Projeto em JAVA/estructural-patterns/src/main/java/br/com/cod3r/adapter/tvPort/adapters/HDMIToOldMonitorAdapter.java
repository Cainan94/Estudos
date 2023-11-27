package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter(){
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with Adapters");
    }
    @Override
    public void setSound(String sound) {
        System.out.println("VGA don't Support sounds");
    }
}
