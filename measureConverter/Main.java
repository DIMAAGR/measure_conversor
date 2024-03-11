package measureConverter;

import measureConverter.controller.ConversorController;
import measureConverter.controller.ConversorController.ConversorControllerBuilder;
import measureConverter.model.CelciusConversorModel;
import measureConverter.model.FahrenheitConversorModel;
import measureConverter.model.InchConversorModel;
import measureConverter.model.KelvinConversorModel;
import measureConverter.model.MetersConversorModel;
import measureConverter.view.ConversorView;

// =================================================================================================

// PARA ESTE PROJETO QUE SERVIRÁ DE ESTUDO PARA LAÇOS DE REPETIÇÃO NO JAVA, CRIAREMOS UM PROGRAMA
// *FUNCIONAL* DE CONVERSÃO DE MEDIDAS/COISAS
//
// PS: VOCÊ QUE VEIO AQ NO MEU GITHUB DAR UMA OLHADA, SAIBA QUE, SE TÁ AI NO GITHUB É PQ EU CONSEGUI
// FAZER!
// =================================================================================================

// ORA BOLAS, CLARO QUE EU IA COLOCAR UM MVC DO NADA AQUI (PS: não que esteja bom, mas pra quem n sabe nada de java...)
// tá até god!

public class Main {
    public static void main(String[] args) {

        // Cada Model tem por responsabilidade fazer os calculos de conversão
        CelciusConversorModel celciusModel = new CelciusConversorModel();
        FahrenheitConversorModel fahrenheitModel = new FahrenheitConversorModel();
        InchConversorModel inchModel = new InchConversorModel();
        KelvinConversorModel kelvinModel = new KelvinConversorModel();
        MetersConversorModel metersModel = new MetersConversorModel();

        // View Mostra as telas com opções para o usuário selecionar para converter
        // e também os resultados de cada conversão
        ConversorView view = new ConversorView();

        // Controller faz a ponte entre os models e a view, controla os dados e
        // respostas.

        ConversorControllerBuilder builder = new ConversorControllerBuilder();
        builder.celciusModel(celciusModel);
        builder.fahrenheitModel(fahrenheitModel);
        builder.inchModel(inchModel);
        builder.kelvinModel(kelvinModel);
        builder.metersModel(metersModel);
        builder.view(view);

        ConversorController controller = builder.build();

        controller.showMainPage();
    }

}