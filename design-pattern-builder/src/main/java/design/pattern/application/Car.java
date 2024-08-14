package design.pattern.application;

public class Car {

    private String engine;
    private String wheels;
    private String color;
    private Boolean airConditioner;
    private Boolean eletricWindow;
    private Integer doorQnt;


    // construtor da classe CAR
    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.color = carBuilder.color;
    }

    public static class CarBuilder {
        private String engine;
        private String wheels;
        private String color;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "engine='" + this.engine + '\'' +
                ", wheels='" + this.wheels + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }

}
