package br.com.cod3r.factory.apple.Complet;


import br.com.cod3r.factory.apple.Complet.factorys.*;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordem Iphone X");
		IphoneFactory iphoneFactory = new IphoneXFactory();
		iphoneFactory.createIphone();

		System.out.println("### Ordem Iphone X");
		IphoneFactory iphoneXSMaxFactory = new IphoneXSMaxFactory();
		iphoneXSMaxFactory.createIphone();

		System.out.println("### Ordem Iphone 11");
		IphoneFactory iphone11Factory= new Iphone11Factory();
		iphone11Factory.createIphone();

		System.out.println("### Ordem Iphone 11 Pro");
		IphoneFactory iPhone11Pro = new Iphone11ProFactory();
		iPhone11Pro.createIphone();
	}
	private void orderIphone(String model){
		if(model.toLowerCase().equals("x")){
			System.out.println("### Ordem Iphone X");
			IphoneXFactory xFactory = new IphoneXFactory();
			xFactory.createIphone();
		}else if(model.toLowerCase().equals("xsmax")){
			System.out.println("### Ordem Iphone XS MAX");
			IphoneXSMaxFactory xsMaxFactory = new IphoneXSMaxFactory();
			xsMaxFactory.createIphone();
		}
	}
}
