package org.example.costimernormal1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    double n1, n2, calculo;
    String oprador;

    @FXML
    private Label costumer;

    @FXML
    private void b1 (ActionEvent event){
        costumer.setText(costumer.getText() + 1);
    }

    @FXML
    private void b2 (ActionEvent event){
        costumer.setText(costumer.getText() + 2);
    }

    @FXML
    private void b3 (ActionEvent event){
        costumer.setText(costumer.getText() + 3);
    }

    @FXML
    private void b4 (ActionEvent event){
        costumer.setText(costumer.getText() + 4);
    }

    @FXML
    private void b5 (ActionEvent event){
        costumer.setText(costumer.getText() + 5);
    }

    @FXML
    private void b6 (ActionEvent event){
        costumer.setText(costumer.getText() + 6);
    }

    @FXML
    private void b7 (ActionEvent event){
        costumer.setText(costumer.getText() + 7);
    }

    @FXML
    private void b8 (ActionEvent event){
        costumer.setText(costumer.getText() + 8);
    }

    @FXML
    private void b9 (ActionEvent event){
        costumer.setText(costumer.getText() + 9);
    }

    @FXML
    private void b0 (ActionEvent event){
        costumer.setText(costumer.getText() + 0);
    }

    @FXML
    private void bDiv (ActionEvent event){
        n1 = Double.parseDouble(costumer.getText());
        oprador = "/";
        costumer.setText("");
    }

    @FXML
    private void bAdic (ActionEvent event){
        n1 = Double.parseDouble(costumer.getText());
        oprador = "+";
        costumer.setText("");
    }

    @FXML
    private void bMenos (ActionEvent event){
        n1 = Double.parseDouble(costumer.getText());
        oprador = "-";
        costumer.setText("");
    }

    @FXML
    private void bMult (ActionEvent event){
        n1 = Double.parseDouble(costumer.getText());
        oprador = "x";
        costumer.setText("");
    }

    @FXML
    private void bPont (ActionEvent event){
        costumer.setText(costumer.getText() + ".");

    }

    @FXML
    private void bLimp (ActionEvent event){
        costumer.setText("");
    }

    @FXML
    private void bIgual (ActionEvent event){
        switch (oprador){
            case "+":
                n2 = Double.parseDouble(costumer.getText());
                calculo = n1 + n2;
            break;

            case "-":
                n2 = Double.parseDouble(costumer.getText());
                calculo = n1 - n2;
            break;

            case "x":
                n2 = Double.parseDouble(costumer.getText());
                calculo = n1 * n2;
            break;

            case "/":
                n2 = Double.parseDouble(costumer.getText());
                calculo = n1 / n2;
            break;


        }
        costumer.setText(String.valueOf(calculo));

    }

}
