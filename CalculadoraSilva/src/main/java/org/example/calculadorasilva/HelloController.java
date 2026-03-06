package org.example.calculadorasilva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static java.lang.Math.sqrt;

public class HelloController {
    double numero1, numero2, resultado;
    String v;

    @FXML
    private Label saida;

    @FXML
    private void b1 (ActionEvent event){
        saida.setText(saida.getText() + 1);
    }

    @FXML
    private void b2 (ActionEvent event){
        saida.setText(saida.getText() + 2);
    }

    @FXML
    private void b3 (ActionEvent event){
        saida.setText(saida.getText() + 3);
    }

    @FXML
    private void b4 (ActionEvent event){
        saida.setText(saida.getText() + 4);
    }

    @FXML
    private void b5 (ActionEvent event){
        saida.setText(saida.getText() + 5);
    }

    @FXML
    private void b6 (ActionEvent event){
        saida.setText(saida.getText() + 6);
    }

    @FXML
    private void b7 (ActionEvent event){
        saida.setText(saida.getText() + 7);
    }

    @FXML
    private void b8 (ActionEvent event){
        saida.setText(saida.getText() + 8);
    }

    @FXML
    private void b9 (ActionEvent event){
        saida.setText(saida.getText() + 9);
    }

    @FXML
    private void b0 (ActionEvent event){
        saida.setText(saida.getText() + 0);
    }

    @FXML
    private void bDiv (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        v = "/";
        saida.setText("");
    }

    @FXML
    private void bAdic (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        v = "+";
        saida.setText("");
    }

    @FXML
    private void bMenos (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        v = "-";
        saida.setText("");
    }

    @FXML
    private void bMult (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        v = "x";
        saida.setText("");
    }

    @FXML
    private void bPont (ActionEvent event){
        saida.setText(saida.getText() + ".");
    }

    @FXML
    private void bLimp (ActionEvent event){
        saida.setText("");
    }

    @FXML
    private void btnSen(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = Math.sin(Math.toRadians(numero1));
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnCos(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = Math.cos(Math.toRadians(numero1));
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnTan(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = Math.tan(Math.toRadians(numero1));
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnQuadrado (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = (numero1 * numero1);
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnPorx(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = 1 / numero1;
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnPercentagem(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        v = "%";
        saida.setText("");
    }

    @FXML
    private void btnnep (ActionEvent event){
        resultado = 2.718281828;
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnModulo (ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        double cal = (numero1)*(numero1);
        resultado = sqrt(cal) ;
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnRaiz(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = sqrt(numero1);
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnPi(ActionEvent event){
        numero1 = 3.14;
        saida.setText(String.valueOf(numero1));
    }

    @FXML
    private void btnLog(ActionEvent event){
        numero1 = Double.parseDouble(saida.getText());
        resultado = Math.log10(numero1);
        saida.setText(String.valueOf(resultado));
    }

    @FXML
    private void bIgual (ActionEvent event){
        switch (v){
            case "+":
                numero2 = Double.parseDouble(saida.getText());
                resultado = numero1 + numero2;
                break;

            case "-":
                numero2 = Double.parseDouble(saida.getText());
                resultado = numero1 - numero2;
                break;

            case "x":
                numero2 = Double.parseDouble(saida.getText());
                resultado = numero1 * numero2;
                break;

            case "/":
                numero2 = Double.parseDouble(saida.getText());
                resultado = numero1 / numero2;
                break;

            case "%":
                numero2 = Double.parseDouble(saida.getText());
                resultado = numero1 / 100 * numero2;
            break;
        }
        saida.setText(String.valueOf(resultado));

    }

}
