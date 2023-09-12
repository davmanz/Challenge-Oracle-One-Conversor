package com.manzano.converter;

import javax.swing.JOptionPane;

public class TemperatureConverterInput {

	public static void main(String[] args) {
	    double temperatureInput = 0.0;
	    boolean inputValid = false;

	    while (!inputValid) {
	        String temperatureInputString = JOptionPane.showInputDialog(
	            null,
	            "Ingresa la temperatura que deseas convertir:",
	            "Input",
	            JOptionPane.QUESTION_MESSAGE);

	        if (temperatureInputString == null) {
	            // El usuario cerró el cuadro de diálogo sin ingresar un valor
	            JOptionPane.showMessageDialog(
	                null,
	                "Se canceló la operación. Programa Finalizado.",
	                "Cancelar",
	                JOptionPane.INFORMATION_MESSAGE);
	            System.exit(0); // Salir del programa
	        }

	        try {
	            temperatureInput = Double.parseDouble(temperatureInputString);
	            inputValid = true;
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(
	                null,
	                "Error: Ingresa un número válido",
	                "Error",
	                JOptionPane.ERROR_MESSAGE);
	        }
	    }

	    // Llamar a la clase TemperatureConverter y pasar el valor como argumento para realizar la conversión
	    TemperatureConverter.convertTemperature(temperatureInput);
	}

}