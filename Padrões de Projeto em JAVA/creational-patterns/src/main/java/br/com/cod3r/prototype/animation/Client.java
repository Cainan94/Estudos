package br.com.cod3r.prototype.animation;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;

public class Client {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	public static Person addLeft(Person person) throws CloneNotSupportedException {
		Person p = (Person)person.clone();
		p.left();
		frames.add(p);
		return p;
	}

	public static Person addRight(Person person) throws CloneNotSupportedException {
		Person p = (Person)person.clone();
		p.right();
		frames.add(p);
		return p;
	}
	
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		PersonSamples personSamples = new PersonSamples();
		Person person = personSamples.get("stickMan");
		frames.add(person);
		for(int i = 0; i < 6; i++){
		   person = addLeft(person);
		}
		for(int i = 0; i < 12; i++){
			person = addRight(person);
		}
		for(int i = 0; i < 6; i++){
			person = addLeft(person);
		}
		animate();
	}
}
