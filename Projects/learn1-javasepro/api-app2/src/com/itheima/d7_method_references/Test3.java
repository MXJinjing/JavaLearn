package com.itheima.d7_method_references;

public class Test3 {

//    CreateCar cc = new CreateCar() {
//        @Override
//        public Car createCar(String name, double price) {
//            return new Car(name, price);
//        }
//    };

//    CreateCar cc = (name,price) -> new Car(name,price);
    CreateCar cc = Car::new;

}

interface CreateCar{
    Car createCar(String name, double price);
}