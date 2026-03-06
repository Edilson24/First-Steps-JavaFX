package org.example.costimernormal1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static java.lang.Math.sqrt;

public class HelloController {
    double v1, v2, calculo;
    String vr;

    @FXML
    private Label FIXmino;

    @FXML
    private void b1 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 1);
    }

    @FXML
    private void b2 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 2);
    }

    @FXML
    private void b3 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 3);
    }

    @FXML
    private void b4 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 4);
    }

    @FXML
    private void b5 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 5);
    }

    @FXML
    private void b6 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 6);
    }

    @FXML
    private void b7 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 7);
    }

    @FXML
    private void b8 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 8);
    }

    @FXML
    private void b9 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 9);
    }

    @FXML
    private void b0 (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + 0);
    }

    @FXML
    private void bDiv (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        vr = "/";
        FIXmino.setText("");
    }

    @FXML
    private void bAdic (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        vr = "+";
        FIXmino.setText("");
    }

    @FXML
    private void bMenos (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        vr = "-";
        FIXmino.setText("");
    }

    @FXML
    private void bMult (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        vr = "x";
        FIXmino.setText("");
    }

    @FXML
    private void bPont (ActionEvent event){
        FIXmino.setText(FIXmino.getText() + ".");
    }

    @FXML
    private void bLimp (ActionEvent event){
        FIXmino.setText("");
    }

    @FXML
    private void btnSen(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = Math.sin(Math.toRadians(v1));
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnCos(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = Math.cos(Math.toRadians(v1));
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnTan(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = Math.tan(Math.toRadians(v1));
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnQuadrado (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = (v1 * v1);
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPorx(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = 1 / v1;
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPercentagem(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        vr = "%";
        FIXmino.setText("");
    }

    @FXML
    private void btnnep (ActionEvent event){
        calculo = 2.718281828;
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnModulo (ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        double cal = (v1)*(v1);
        calculo = sqrt(cal) ;
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnRaiz(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = sqrt(v1);
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void btnPi(ActionEvent event){
        v1 = 3.14;
        FIXmino.setText(String.valueOf(v1));
    }

    @FXML
    private void btnLog(ActionEvent event){
        v1 = Double.parseDouble(FIXmino.getText());
        calculo = Math.log10(v1);
        FIXmino.setText(String.valueOf(calculo));
    }

    @FXML
    private void bIgual (ActionEvent event){
        switch (vr){
            case "+":
                v2 = Double.parseDouble(FIXmino.getText());
                calculo = v1 + v2;
            break;

            case "-":
                v2 = Double.parseDouble(FIXmino.getText());
                calculo = v1 - v2;
            break;

            case "x":
                v2 = Double.parseDouble(FIXmino.getText());
                calculo = v1 * v2;
            break;

            case "/":
                v2 = Double.parseDouble(FIXmino.getText());
                calculo = v1 / v2;
            break;

            case "%":
                v2 = Double.parseDouble(FIXmino.getText());
                calculo = v1 / 100 * v2;
            break;
        }
        FIXmino.setText(String.valueOf(calculo));

    }

}
