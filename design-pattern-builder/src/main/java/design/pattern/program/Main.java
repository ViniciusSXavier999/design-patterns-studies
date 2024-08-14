package design.pattern.program;

import design.pattern.application.Car;

public class Main {
    public static void main(String[] args) {

        /* O Builder evita um código muito verboso e foca somente nos
        * atributos principais que você deseja utilizar */

        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("18 inch")
                .setColor("Red")
                .build();

        // Utilizando o método ToString para imprimir os valores do meu objeto
        System.out.println(car.toString());
    }
}