package measureConverter.controller;

import measureConverter.model.CelciusConversorModel;
import measureConverter.model.FahrenheitConversorModel;
import measureConverter.model.InchConversorModel;
import measureConverter.model.KelvinConversorModel;
import measureConverter.model.MetersConversorModel;
import measureConverter.view.ConversorView;

public class ConversorController {

    public ConversorController(CelciusConversorModel celciusModel, FahrenheitConversorModel fahrenheitModel,
            InchConversorModel inchModel, KelvinConversorModel kelvinModel, MetersConversorModel metersModel,
            ConversorView view) {

        this.celciusModel = celciusModel;
        this.fahrenheitModel = fahrenheitModel;
        this.inchModel = inchModel;
        this.kelvinModel = kelvinModel;
        this.metersModel = metersModel;
        this.view = view;
    }

    private CelciusConversorModel celciusModel;
    private FahrenheitConversorModel fahrenheitModel;
    private InchConversorModel inchModel;
    private KelvinConversorModel kelvinModel;
    private MetersConversorModel metersModel;

    private ConversorView view;

    int selectedPage = 0;

    public void showMainPage() {
        selectedPage = view.selectConversionOption();
    }

    public void clearView() {
        view.clearView();
    }

}
