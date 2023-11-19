package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		User clone1 = user.cloneBuilder().Name("Clone 1").build();
		System.out.println(clone1);
		User clone2 = user.cloneBuilder().Name("clone 2").Age(29).Address(new Address("rua araçatuba",175)).build();
		System.out.println(clone2);
		System.out.println("------------------------------------");
		System.out.println(user);
		System.out.println(clone1);
		System.out.println(clone2);

	}
}