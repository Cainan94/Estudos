package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class User {
	private final String name;
	private final Integer age;
	private final Address address;
	
	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Builder cloneBuilder(){
		return new Builder(name,age,address);
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public static class Builder{
		private String name;
		private Integer age;
		private Address address;

		private Builder(String name, Integer age, Address address){
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Builder Name(String name){
			this.name = name;
			return this;
		}

		public Builder Age(Integer age){
			this.age = age;
			return this;
		}

		public Builder Address(Address address){
			this.address = address;
			return this;
		}

		public User build(){
			return new User(name,age,address);
		}


	}
}
