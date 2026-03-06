package org.example.calculadora_ema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.sqrt;

public class HelloControllerCientifica {
    double numero1,numero2,resultado;
    String opp;


    @FXML
    private Label Resultado;

    @FXML
    private void botao1(ActionEvent event){
        Resultado.setText(Resultado.getText()+1);
    }

    @FXML
    private void botao2(ActionEvent event){
        Resultado.setText(Resultado.getText()+2);
    }

    @FXML
    private void botao3(ActionEvent event){
        Resultado.setText(Resultado.getText()+3);
    }

    @FXML
    private void botao4(ActionEvent event){
        Resultado.setText(Resultado.getText()+4);
    }

    @FXML
    private void botao5(ActionEvent event){
        Resultado.setText(Resultado.getText()+5);
    }

    @FXML
    private void botao6(ActionEvent event){
        Resultado.setText(Resultado.getText()+6);
    }

    @FXML
    private void botao7(ActionEvent event){
        Resultado.setText(Resultado.getText()+7);
    }
    @FXML
    private void botao8(ActionEvent event){
        Resultado.setText(Resultado.getText()+8);
    }

    @FXML
    private void botao9(ActionEvent event){
        Resultado.setText(Resultado.getText()+9);
    }

    @FXML
    private void botao0(ActionEvent event){
        Resultado.setText(Resultado.getText()+0);
    }

    @FXML
    private void botaoApagar(ActionEvent event){
        Resultado.setText("");
    }

    @FXML
    private void botaolimpar(ActionEvent event){
        Resultado.setText("");
    }

    @FXML
    private void botaomultiplicacao(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText()) ;
        opp= "x";
        Resultado.setText("");
    }

    @FXML
    private void botaoadicao(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText()) ;
        opp= "+";
        Resultado.setText("");
    }

    @FXML
    private void botaodivisao(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText()) ;
        opp= "/";
        Resultado.setText("");
    }

    @FXML
    private void botaovirgula(ActionEvent event){
        Resultado.setText(Resultado.getText()+ ".");
    }

    @FXML
    private void botaosubtracao(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText()) ;
        opp= "-";
        Resultado.setText("");
    }

    @FXML
    private void botaopercentual(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        opp = "%";
        Resultado.setText("");
    }

    @FXML
    private void mudarTela(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ema.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnPi(ActionEvent event){
        numero1 = 3.14;
        Resultado.setText(String.valueOf(numero1));
    }

    @FXML
    private void btnSen(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = Math.sin(Math.toRadians(numero1));
        Resultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnCos(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = Math.cos(Math.toRadians(numero1));
        Resultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnTan(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = Math.tan(Math.toRadians(numero1));
        Resultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnLog(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = Math.log10(numero1);
        Resultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnQuadrado (ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = (numero1 * numero1);
        Resultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnRaiz(ActionEvent event){
        numero1 = Double.parseDouble(Resultado.getText());
        resultado = sqrt(numero1);
    }

    @FXML
    private void botaoigualdade(ActionEvent event){
        switch(opp){
            case "+":
                numero2 = Double.parseDouble(Resultado.getText());
                resultado = numero1+numero2;
            break;

            case "/":
                numero2 = Double.parseDouble(Resultado.getText());
                resultado = numero1/numero2;
            break;

            case "x":
                numero2 = Double.parseDouble(Resultado.getText());
                resultado = numero1*numero2;
            break;

            case "-":
                numero2 = Double.parseDouble(Resultado.getText());
                resultado = numero1-numero2;
            break;


            case "%":
                numero2 = Double.parseDouble(Resultado.getText());
                resultado = numero1 / 100 * numero2;
            break;


        }
        Resultado.setText(String.valueOf(resultado));
    }
}