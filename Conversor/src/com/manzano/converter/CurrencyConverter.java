package com.manzano.converter;

import javax.swing.JOptionPane;

public class CurrencyConverter {

    public static void convertCurrency(double amount) {
        String[] options = { 
            "De Soles a Dolares", 
            "De Soles a Euros",
            "De Soles a Libras Esterlinas",
            "De Soles a Yen Japones",
            "De Soles a Won sur-coreano",
            "De Dolares a Soles",
            "De Euros a Soles",
            "De Libras Esterlinas a Soles",
            "De Yen Japones a Soles",
            "De Won sur-coreano a Soles"
        };

        String choice = (String) JOptionPane.showInputDialog(
            null, 
            "Selecciona una opción:", 
            "Monedas",
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            options, 
            options[0]);

        if (choice != null) {
            // Realizar la conversión basada en la elección del usuario y mostrar el resultado
            String resultMessage = convert(choice, amount);
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
 	            	System.exit(0); // Salir del programa;
        }
    }

    public static String convert(String choice, double amount) {
        double dolar = 3.712;
        double euro = 3.955;
        double libra = 5.100;
        double yen = 39.69;
        double won = 360.50;

        // Realizar la conversión basada en la elección del usuario
        double result = 0.0;
        String resultCurrency = "";

        switch (choice) {
        case "De Soles a Dolares":
            result = amount / dolar;
            resultCurrency = "USD";
            break;
        case "De Soles a Euros":
            result = amount / euro;
            resultCurrency = "EUR";
            break;
        case "De Soles a Libras Esterlinas":
            result = amount / libra;
            resultCurrency = "GBP";
            break;
        case "De Soles a Yen Japones":
            result = amount / yen;
            resultCurrency = "JPY";
            break;
        case "De Soles a Won sur-coreano":
            result = amount / won;
            resultCurrency = "KRW";
            break;
        case "De Dolares a Soles":
            result = amount * dolar;
            resultCurrency = "PEN";
            break;
        case "De Euros a Soles":
            result = amount * euro;
            resultCurrency = "PEN";
            break;
        case "De Libras Esterlinas a Soles":
            result = amount * libra;
            resultCurrency = "PEN";
            break;
        case "De Yen Japones a Soles":
            result = amount * yen;
            resultCurrency = "PEN";
            break;
        case "De Won sur-coreano a Soles":
            result = amount * won;
            resultCurrency = "PEN";
            break;
        default:
            return "Selección no válida.";
        }

        return "El resultado de la conversión es: " + String.format("%.2f", result) + " " + resultCurrency;
    }
}

