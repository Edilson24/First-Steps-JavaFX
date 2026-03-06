package com.example.cobaia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    double num1,num2, resultado;
    String operacao;

    @FXML
    private Label RESULTADO;

    @FXML
    private void botaon1(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+1);
    }

    @FXML
    private void botaon2(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+2);
    }
    @FXML
    private void botaon3(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+3);
    }
    @FXML
    private void botaon4(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+4);
    }
    @FXML
    private void botaon5(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+5);
    }
    @FXML
    private void botaon6(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+6);
    }
    @FXML
    private void botaon7(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+7);
    }
    @FXML
    private void botaon8(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+8);
    }
    @FXML
    private void botaon9(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+9);
    }
    @FXML
    private void botaon0(ActionEvent event){
        RESULTADO.setText(RESULTADO.getText()+0);
    }


    @FXML
    private void botaoigual(ActionEvent event){
        switch (operacao){
            case "+" :
                num2= Double.parseDouble(RESULTADO.getText());
                resultado = num1+num1;
                break;

            case "-" :
                num2= Double.parseDouble(RESULTADO.getText());
                resultado = num1 - num1;
            break;

            case "x" :
                num2= Double.parseDouble(RESULTADO.getText());
                resultado = num1 * num1;
            break;

            case "/" :
                num2= Double.parseDouble(RESULTADO.getText());
                resultado = num1 / num1;
            break;
            }
        RESULTADO.setText(String.valueOf(resultado));


    }
    @FXML
    private void botaomultiplicacao(ActionEvent event){
        num1 = Double.parseDouble(RESULTADO.getText());
        operacao = "x";
        RESULTADO.setText("");
    }
    @FXML
    private void botaoadicao(ActionEvent event){
        num1 = Double.parseDouble(RESULTADO.getText());
        operacao = "+";
        RESULTADO.setText("");
    }
    @FXML
    private void botaodivisao(ActionEvent event){
        num1 = Double.parseDouble(RESULTADO.getText());
        operacao = "/";
        RESULTADO.setText("");
    }
    @FXML
    private void botaosubtracao(ActionEvent event){
        num1 = Double.parseDouble(RESULTADO.getText());
        operacao = "-";
        RESULTADO.setText("");
    }

    }
