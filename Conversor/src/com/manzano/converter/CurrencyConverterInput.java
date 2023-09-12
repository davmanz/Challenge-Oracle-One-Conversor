package com.manzano.converter;

import javax.swing.JOptionPane;

public class CurrencyConverterInput {

    public static void main(String[] args) {
        String mountInputString = JOptionPane.showInputDialog(
            null, 
            "Ingresa la cantidad de dinero que deseas convertir:",
            "Input", 
            JOptionPane.QUESTION_MESSAGE);

        if (mountInputString == null) {
            // El usuario cerró el cuadro de diálogo sin ingresar un valor
            JOptionPane.showMessageDialog(
                null,
                "Se canceló la operación. Programa Finalizado.",
                "Cancelar",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Salir del programa
        }

        try {
            double mountInput = Double.parseDouble(mountInputString);

            // Llamar a la clase CurrencyConverter y pasar el valor como argumento para realizar la conversión
            CurrencyConverter.convertCurrency(mountInput);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error: Ingresa un número válido", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
