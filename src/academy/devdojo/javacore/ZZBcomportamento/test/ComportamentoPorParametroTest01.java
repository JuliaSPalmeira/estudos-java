package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));


    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterByYearBefore(cars, 2003));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filtedCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filtedCar.add(car);
            }
        }
        return  filtedCar;
    }
    private static List<Car> filterByYearBefore(List<Car> cars,int year) {
        List<Car>  filtedCar= new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filtedCar.add(car);
            }
        }
        return   filtedCar;
    }
}

