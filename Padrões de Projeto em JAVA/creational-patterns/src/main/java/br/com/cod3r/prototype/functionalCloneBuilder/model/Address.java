package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class Address {
	private final String street;
	private final Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	public Builder cloneBuilder(){
		return new Builder(street,number);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	public static class Builder{
		private String street;
		private Integer number;

		private Builder(String street, Integer number){
			this.number = number;
			this.street = street;
		}

		public Builder street(String street){
			this.street = street;
			return this;
		}

		public Builder street(Integer number){
			this.number = number;
			return this;
		}

		public Address build(){
			return new Address(street,number);
		}
	}
}
