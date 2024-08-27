package com.teste.calculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    @DisplayName(" Teste 5 + 5 = 10 ")
    void testSoma() {
        // Arrange
        Calculadora calc = new Calculadora();
        double valor1 = 5D;
        double valor2 = 5D;
        double esperado = 10D;
        
        //Act
        double resultado = calc.sum(valor1, valor2);
        
        //Assert
        assertEquals(esperado,resultado, " 5 + 5 não gerou o valor10");

    }
    
    @Test
    @DisplayName(" Teste 39 - 13 = 26 ")
    void testSubtacao() {
        // Arrange
        Calculadora calc = new Calculadora();
        double valor1 = 39D;
        double valor2 = 13D;
        double esperado = 26D;
        
        //Act
        double resultado = calc.sub(valor1, valor2);
        
        //Assert
        assertEquals(esperado,resultado, " 39 - 13 não gerou o valor 26");

    }
    
    @Test
    @DisplayName(" Teste 30 * 4 = 120 ")
    void testMultiplicacao() {
        // Arrange
        Calculadora calc = new Calculadora();
        double valor1 = 30D;
        double valor2 = 4D;
        double esperado = 120D;
        
        //Act
        double resultado = calc.mult(valor1, valor2);
        
        //Assert
        assertEquals(esperado,resultado, " Teste 30 * 4 não gerou o valor 120");

    }
    
    @Test
    @DisplayName(" Teste 150 / 30 = 5 ")
    void testDivisao() {
        // Arrange
        Calculadora calc = new Calculadora();
        double valor1 = 150D;
        double valor2 = 30D;
        double esperado = 5D;
        
        //Act
        double resultado = calc.div(valor1, valor2);
        
        //Assert
        assertEquals(esperado,resultado, " 150 / 30 não gerou o valor 5");

    }
    
    

}