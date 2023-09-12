package com.manzano.converter;

import javax.swing.JOptionPane;

public class DistanceConverterInput {

    public static void main(String[] args) {
        double distanceInput = 0.0;
        boolean inputValid = false;

        while (!inputValid) {
            String distanceInputString = JOptionPane.showInputDialog(
                null,
                "Ingresa la distancia que deseas convertir:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

            if (distanceInputString == null) {
                // El usuario cerró el cuadro de diálogo sin ingresar un valor
                JOptionPane.showMessageDialog(
                    null,
                    "Se canceló la operación. Programa Finalizado.",
                    "Cancelar",
                    JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); // Salir del programa
            }

            try {
                distanceInput = Double.parseDouble(distanceInputString);
                inputValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Error: Ingresa un número válido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Llamar a la clase DistanceConverter y pasar el valor como argumento para realizar la conversión
        DistanceConverter.convertDistance(distanceInput);
    }
}
