package com.directi.training.srp.exercice_refactored;


	import java.util.List;

	public class CarService
	{
	    private final CarRepository _carRepository;

	    public CarService(CarRepository carRepository) {
	        _carRepository = carRepository;
	    }

	    public Car getBestCar() {
	        List<Car> cars = _carRepository.getAllCars();
	        Car bestCar = null;
	        for (Car car : cars) {
	            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
	                bestCar = car;
	            }
	        }
	        return bestCar;
	    }
	}


