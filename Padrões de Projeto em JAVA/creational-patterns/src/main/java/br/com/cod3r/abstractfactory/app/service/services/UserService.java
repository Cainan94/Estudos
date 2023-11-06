package br.com.cod3r.abstractfactory.app.service.services;

public interface UserService extends Services{
	void save(String name);
	boolean delete(Integer id);
}
