package measureConverter.controller;

import measureConverter.model.CelciusConversorModel;
import measureConverter.model.FahrenheitConversorModel;
import measureConverter.model.InchConversorModel;
import measureConverter.model.KelvinConversorModel;
import measureConverter.model.MetersConversorModel;
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

        private CelciusConversorModel celciusModel;
        private FahrenheitConversorModel fahrenheitModel;
        private InchConversorModel inchModel;
        private KelvinConversorModel kelvinModel;
        private MetersConversorModel metersModel;

        private ConversorView view;

        public ConversorControllerBuilder celciusModel(CelciusConversorModel celciusModel) {
            this.celciusModel = celciusModel;
            return this;
        }

        public ConversorControllerBuilder fahrenheitModel(FahrenheitConversorModel fahrenheitModel) {
            this.fahrenheitModel = fahrenheitModel;
            return this;
        }

        public ConversorControllerBuilder inchModel(InchConversorModel inchModel) {
            this.inchModel = inchModel;
            return this;
        }

        public ConversorControllerBuilder kelvinModel(KelvinConversorModel kelvinModel) {
            this.kelvinModel = kelvinModel;
            return this;
        }

        public ConversorControllerBuilder metersModel(MetersConversorModel metersModel) {
            this.metersModel = metersModel;
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

        this.celciusModel = builder.celciusModel;
        this.fahrenheitModel = builder.fahrenheitModel;
        this.inchModel = builder.inchModel;
        this.kelvinModel = builder.kelvinModel;
        this.metersModel = builder.metersModel;
        this.view = builder.view;
    }

    private CelciusConversorModel celciusModel;
    private FahrenheitConversorModel fahrenheitModel;
    private InchConversorModel inchModel;
    private KelvinConversorModel kelvinModel;
    private MetersConversorModel metersModel;

    private ConversorView view;

    int selectedPage = 0;

    public void showMainPage() {
        view.displayConversionOptions();
    }

    public void clearView() {
        view.clearView();
    }

}
