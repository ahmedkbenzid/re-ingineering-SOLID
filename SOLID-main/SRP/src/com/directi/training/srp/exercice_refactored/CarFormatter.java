package com.directi.training.srp.exercice_refactored;


	import java.util.List;

	public class CarFormatter
	{
	    public static String formatCarsNames(List<Car> cars) {
	        StringBuilder sb = new StringBuilder();
	        for (Car car : cars) {
	            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
	        }
	        if (sb.length() > 2) sb.setLength(sb.length() - 2); 
	        return sb.toString();
	    }
	}


