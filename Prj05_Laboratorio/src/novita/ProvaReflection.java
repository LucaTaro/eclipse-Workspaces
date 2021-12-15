package novita;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import interfaccia.Libro;

public class ProvaReflection {
	
	public static void main(String[] args) {
		
		Libro l = new Libro ("Guida galattica");
		
		Class<? extends Libro> class1 = l.getClass();
		
		Constructor<?>[] constructors = class1.getConstructors();
		
		System.out.println(constructors.length);
		
		Method[] methods = class1.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
