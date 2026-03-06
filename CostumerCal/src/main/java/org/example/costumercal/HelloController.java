package org.example.costumercal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static java.lang.Math.sqrt;

public class HelloController {
    double n1, n2, calculo;
    String vr;

    @FXML
    private Label output;

    @FXML
    private void b1 (ActionEvent event){
        output.setText(output.getText() + 1);
    }

    @FXML
    private void b2 (ActionEvent event){
        output.setText(output.getText() + 2);
    }

    @FXML
    private void b3 (ActionEvent event){
        output.setText(output.getText() + 3);
    }

    @FXML
    private void b4 (ActionEvent event){
        output.setText(output.getText() + 4);
    }

    @FXML
    private void b5 (ActionEvent event){
        output.setText(output.getText() + 5);
    }

    @FXML
    private void b6 (ActionEvent event){
        output.setText(output.getText() + 6);
    }

    @FXML
    private void b7 (ActionEvent event){
        output.setText(output.getText() + 7);
    }

    @FXML
    private void b8 (ActionEvent event){
        output.setText(output.getText() + 8);
    }

    @FXML
    private void b9 (ActionEvent event){
        output.setText(output.getText() + 9);
    }

    @FXML
    private void b0 (ActionEvent event){
        output.setText(output.getText() + 0);
    }

    @FXML
    private void bDiv (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        vr = "/";
        output.setText("");
    }

    @FXML
    private void bAdic (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        vr = "+";
        output.setText("");
    }

    @FXML
    private void bMenos (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        vr = "-";
        output.setText("");
    }

    @FXML
    private void bMult (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        vr = "x";
        output.setText("");
    }

    @FXML
    private void bPont (ActionEvent event){
        output.setText(output.getText() + ".");
    }

    @FXML
    private void bLimp (ActionEvent event){
        output.setText("");
    }

    @FXML
    private void btnSen(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = Math.sin(Math.toRadians(n1));
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnCos(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = Math.cos(Math.toRadians(n1));
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnTan(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = Math.tan(Math.toRadians(n1));
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnQuadrado (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = (n1 * n1);
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPorx(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = 1 / n1;
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPercentagem(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        vr = "%";
        output.setText("");
    }

    @FXML
    private void btnnep (ActionEvent event){
        calculo = 2.718281828;
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnModulo (ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        double cal = (n1)*(n1);
        calculo = sqrt(cal) ;
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnRaiz(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = sqrt(n1);
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPi(ActionEvent event){
        n1 = 3.14;
        output.setText(String.valueOf(n1));
    }

    @FXML
    private void btnLog(ActionEvent event){
        n1 = Double.parseDouble(output.getText());
        calculo = Math.log10(n1);
        output.setText(String.valueOf(calculo));
    }

    @FXML
    private void bIgual (ActionEvent event){
        switch (vr){
            case "+":
                n2 = Double.parseDouble(output.getText());
                calculo = n1 + n2;
                break;

            case "-":
                n2 = Double.parseDouble(output.getText());
                calculo = n1 - n2;
                break;

            case "x":
                n2 = Double.parseDouble(output.getText());
                calculo = n1 * n2;
                break;

            case "/":
                n2 = Double.parseDouble(output.getText());
                calculo = n1 / n2;
                break;

            case "%":
                n2 = Double.parseDouble(output.getText());
                calculo = n1 / 100 * n2;
                break;
        }
        output.setText(String.valueOf(calculo));

    }

}
