package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RESTAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		System.out.println("---------------EJB---------------");
		ServicesAbstractFactory factory = new EJBAbstractFactory();

		UserService userService = factory.getUserService();
		userService.save("Cainan");
		userService.delete(2);

		CarService carService = factory.getCarService();
		carService.save("Hyundai Tucson");
		carService.save("Mitishubish Lancer EVO");

		System.out.println("---------------EJB---------------");
		factory = new RESTAbstractFactory();

		userService = factory.getUserService();
		userService.save("Ana Beatriz");
		userService.delete(5);

		carService = factory.getCarService();
		carService.save("Honda Civic");
		carService.save("BMW M3 GT");



	}
}
