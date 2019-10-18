package com.Exercise13OOPStatic.app;
import com.Exercise13OOPStatic.model.Car;

public class Carapp {

	public static void main(String[] args) {
		
		Car IvanCar= new Car();
		Car Uricar= new Car();
		Car EmmanuelCar= new Car();
		Car DaniCar= new Car();
		Car AleCar = new Car();
		Car JorgeCar= new Car();
		
		IvanCar.setSerialNumber("ASDFFG");
		IvanCar.setNumberDoors(4);
		IvanCar.setBrand("Honda");
		
		Uricar.setSerialNumber("qwert");
		Uricar.setNumberDoors(2);
		Uricar.setBrand("Honda");
		
		EmmanuelCar.setSerialNumber("ljihnihi");
		EmmanuelCar.setNumberDoors(4);
		EmmanuelCar.setBrand("Honda");
		
		DaniCar.setSerialNumber("tfyghb");
		DaniCar.setNumberDoors(2);
		DaniCar.setBrand("Nissan");
		
		AleCar.setSerialNumber("ygyyy");
		AleCar.setNumberDoors(4);
		AleCar.setBrand("Nissan");
		
		JorgeCar.setSerialNumber("ugigu");
		JorgeCar.setNumberDoors(4);
		JorgeCar.setBrand("Nissan");
		
		System.out.println(JorgeCar.ToString());
		JorgeCar.CarIsCoupe(true);
		System.out.println(JorgeCar.ToString());
		
		//System.out.println("El numero serial es: "+ JorgeCar.getSerialNumber());
		//System.out.println("El numero de puertas es: "+ JorgeCar.getNumberDoors());
		//System.out.println("El tipo de carro es coupe: "+ JorgeCar.getCarIsCoupe());
		
	}

}
