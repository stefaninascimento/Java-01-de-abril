package swithcase;

import java.util.Scanner;

public class CalculadoraInteligente {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        double num1, num2, resultado = 0;
        
        boolean operacaoValida = true;

        System.out.println(" Calculadora Inteligente ");

        
        System.out.print("Insira o primeiro valor: ");
        num1 = ler.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = ler.next();

        System.out.print("Insira o segundo valor: ");
        num2 = ler.nextDouble();

        
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        
        if (operacaoValida) {
            System.out.println("Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
        }

        ler.close();
    }

	}


