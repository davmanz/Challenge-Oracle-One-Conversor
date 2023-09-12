package com.manzano.converter;

import javax.swing.JOptionPane;

public class MainMenu {

    public static void main(String[] args) {
        String[] options = { 
            "Conversor de Moneda", 
            "Conversor de Temperatura", 
            "Conversor de Distancia" };
        
        String choice = (String) JOptionPane.showInputDialog(
            null, 
            "Selecciona una opción:", 
            "Menú Principal",
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            options, 
            options[0]);

        if (choice != null) {
            switch (choice) {
                case "Conversor de Moneda":
                    CurrencyConverterInput.main(args);
                    break;
                case "Conversor de Temperatura":
                    TemperatureConverterInput.main(args);
                    break;
                case "Conversor de Distancia":
                    DistanceConverterInput.main(args);
                    break;
                default:
                    // Salir del programa
                    break;
            }
        } else {
            // El usuario cerró la ventana del menú principal
            JOptionPane.showMessageDialog(
                null,
                "Adiós y Vuelva Pronto.",
                "Despedida",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
