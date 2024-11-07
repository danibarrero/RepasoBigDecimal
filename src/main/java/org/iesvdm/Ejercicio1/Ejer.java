package org.iesvdm.Ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejer {
    public static void main(String[] args) {
        BigDecimal precioOriginal = new BigDecimal("123.99€");

        BigDecimal descuentoPorcentaje = new BigDecimal("15");

        //Calcula el valor del descuento aplicando el porcentaje al precio original.
        BigDecimal descuentoDecimal = descuentoPorcentaje.divide(new BigDecimal("100"));

        // Calcular el valor del descuento
        BigDecimal valorDescuento = precioOriginal.multiply(descuentoDecimal);

        // Calcular el precio final
        BigDecimal precioFinal = precioOriginal.subtract(valorDescuento);

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento: " + descuentoPorcentaje + "%");
        System.out.println("Descuento aplicado: " + descuentoDecimal.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Precio final: " + precioFinal.setScale(2, RoundingMode.HALF_UP) + "€");

    }
}
