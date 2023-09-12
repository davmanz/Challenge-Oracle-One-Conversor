package com.manzano.converter;

import javax.swing.JOptionPane;

public class TemperatureConverter {

    public static void convertTemperature(double temperature) {
        String[] options = { 
            "De Celsius a Fahrenheit",
            "De Fahrenheit a Celsius",
            "De Celsius a Kelvin",
            "De Kelvin a Celsius",
            "De Kelvin a Fahrenheit",
            "De Fahrenheit a Kelvin"            
        };

        String choice = (String) JOptionPane.showInputDialog(
            null, 
            "Selecciona una opción:", 
            "Temperaturas",
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            options, 
            options[0]);

        if (choice != null) {
            // Realizar la conversión basada en la elección del usuario y mostrar el resultado
            String resultMessage = convert(choice, temperature);
            JOptionPane.showMessageDialog(
                null, 
                resultMessage, 
                "Resultado", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Preguntar al usuario si desea continuar
            int continueOption = JOptionPane.showConfirmDialog(
                null,
                "¿Desea Continuar?",
                "Continuar",
                JOptionPane.YES_NO_CANCEL_OPTION);

            if (continueOption == JOptionPane.YES_OPTION) {
                MainMenu.main(new String[0]); // Vuelve al MainMenu
            } else if (continueOption == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                    null,
                    "Programa Finalizado",
                    "Finalizado",
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                // En caso el usuario elija "Cancelar" o cierre el cuadro de diálogo
                System.exit(0); // Cierra la aplicación
            }
        } else {
            // En caso el usuario cierre el cuadro de diálogo sin seleccionar una opción
            JOptionPane.showMessageDialog(
                null,
                "Se canceló la operación. Programa Finalizado.",
                "Cancelar",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Salir del programa
        }
    }

     public static String convert(String choice, double temperature) {
        double result = 0.0;
        String resultUnit = "";

        switch (choice) {
            case "De Celsius a Fahrenheit":
                result = (temperature * 9/5) + 32;
                resultUnit = "Fahrenheit";
                break;
            case "De Fahrenheit a Celsius":
                result = (temperature - 32) * 5/9;
                resultUnit = "Celsius";
                break;
            case "De Celsius a Kelvin":
                result = temperature + 273.15;
                resultUnit = "Kelvin";
                break;
            case "De Kelvin a Celsius":
                result = temperature - 273.15;
                resultUnit = "Celsius";
                break;
            case "De Kelvin a Fahrenheit":
                result = (temperature * 9/5) - 459.67;
                resultUnit = "Fahrenheit";
                break;
            case "De Fahrenheit a Kelvin":
                result = (temperature + 459.67) * 5/9;
                resultUnit = "Kelvin";
                break;
            default:
                return "Selección no válida.";
        }

        return "El resultado de la conversión es: " + String.format("%.2f", result) + " " + resultUnit;
    }
}
