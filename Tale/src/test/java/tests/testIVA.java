/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import org.junit.jupiter.api.Assertions;
import personal.control.IVA;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.vintage.engine.*;
/**
 *
 * @author User
 */
public class testIVA {
    @Test
    public void t1(){
        IVA iva = new IVA();
        final double result = iva.calcularIVA(1000);
        double expected = 1000*0.19;
        Assertions.assertEquals(expected, result);
    }
}
