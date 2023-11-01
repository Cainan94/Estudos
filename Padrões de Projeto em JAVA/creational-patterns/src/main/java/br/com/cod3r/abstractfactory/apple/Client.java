package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;

public class Client {
	
	public static void main(String[] args) {
		//seleciona o empacotamento no US
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		//instancias 2 gerações
		IPhoneFactory genX = new IPhoneXFactory(rules);
		IPhoneFactory gen11 = new IPhone11Factory(rules);

		//Ordem iphone x Standard US
		genX.orderIPhone("standard");
		System.out.println("--------------------------------");

		//Ordem Iphone 11 HighEnd US
		gen11.orderIPhone("highEnd");
		System.out.println("--------------------------------");

		rules = new BrazilRulesAbstractFactory();
		genX = new IPhoneXFactory(rules);
		gen11 = new IPhone11Factory(rules);

		//Ordem iphone x highEnd BR
		genX.orderIPhone("highEnd");
		System.out.println("--------------------------------");

		//Ordem Iphone 11 Standard BR
		gen11.orderIPhone("standard");
		System.out.println("--------------------------------");


	}
}
