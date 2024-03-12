package measureConverter.model;

import measureConverter.enums.MeasureType;

public class TemperatureConversorModel {

    private double value;
    private MeasureType type;

    public class TemperatureConversorModelBuilder {

        private double value;
        private MeasureType type;

        public TemperatureConversorModelBuilder value(double value) {
            this.value = value;
            return this;
        }

        public TemperatureConversorModelBuilder type(MeasureType type) {
            this.type = type;
            return this;
        }

        public TemperatureConversorModel build() {
            return new TemperatureConversorModel(this);
        }

    }

    public TemperatureConversorModel() {
    }

    public TemperatureConversorModel(TemperatureConversorModelBuilder builder) {
        type = builder.type;
        value = builder.value;
    }

    public double toFahrenheit() {

        switch (type) {
            case CELCIUS:
                // °F = (°C × 9/5) + 32
                return (value * 9 / 5) + 32;
            case KELVIN:
                // °F = (K − 273.15) × 1.8 + 32.
                return (value + 273.15) * 1.8 + 32;
            default:
                System.out.println("ERROR: Atenção houve um erro na conversão (TIPO INVÁLIDO)");
                return 0;
        }

    }

    public double toKelvin() {
        switch (type) {
            case CELCIUS:
                // K = °C + 273.15.
                return value + 273.15;
            case FAHRENHEIT:
                // K = (°F + 459.67) * 5/9
                return (value + 459.67) * 5 / 9;
            default:
                System.out.println("ERROR: Atenção houve um erro na conversão (TIPO INVÁLIDO)");
                return 0;
        }
    }

    public double toCelcius() {
        switch (type) {
            case FAHRENHEIT:
                // °C = (°F - 32) / 1.8
                return (value - 32) / 1.8;
            case KELVIN:
                // °C = K - 273.15
                return value - 273.15;
            default:
                System.out.println("ERROR: Atenção houve um erro na conversão (TIPO INVÁLIDO)");
                return 0;
        }
    }

}
