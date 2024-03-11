package measureConverter.controller;

import measureConverter.model.LengthConversorModel;
import measureConverter.model.TemperatureConversorModel;
import measureConverter.model.WeightConversorModel;
import measureConverter.view.ConversorView;

public class ConversorController {

    /*
     * Segundo Nicole Afonso do Dio.me
     * O padrão Builder é um padrão de projeto criacional que permite a criação de
     * objetos complexos passo a passo. Ele é especialmente útil quando você precisa
     * criar objetos que requerem muitos parâmetros ou quando deseja que o processo
     * de criação de objetos seja mais flexível.
     * 
     * No padrão Builder, você cria uma classe separada para construir o objeto.
     * Essa classe tem um método para cada atributo do objeto que você deseja
     * construir. Para construir o objeto, você chama os métodos da classe Builder
     * na ordem desejada.
     * 
     */
    public static class ConversorControllerBuilder {

        private LengthConversorModel lengthModel;
        private TemperatureConversorModel temperatureModel;
        private WeightConversorModel weightModel;

        private ConversorView view;

        public ConversorControllerBuilder lengthModel(LengthConversorModel lengthModel) {
            this.lengthModel = lengthModel;
            return this;
        }

        public ConversorControllerBuilder temperatureModel(TemperatureConversorModel temperatureModel) {
            this.temperatureModel = temperatureModel;
            return this;
        }

        public ConversorControllerBuilder weightModel(WeightConversorModel weightModel) {
            this.weightModel = weightModel;
            return this;
        }

        public ConversorControllerBuilder view(ConversorView view) {
            this.view = view;
            return this;
        }

        public ConversorController build() {
            return new ConversorController(this);
        }

    }

    public ConversorController(ConversorControllerBuilder builder) {

        this.lengthModel = builder.lengthModel;
        this.temperatureModel = builder.temperatureModel;
        this.weightModel = builder.weightModel;
        this.view = builder.view;
    }

    private LengthConversorModel lengthModel;
    private TemperatureConversorModel temperatureModel;
    private WeightConversorModel weightModel;

    private ConversorView view;

    int selectedPage = 0;

    public void showMainPage() {
        view.displayConversionOptions();

    }

    public void clearView() {
        view.clearView();
    }

}
