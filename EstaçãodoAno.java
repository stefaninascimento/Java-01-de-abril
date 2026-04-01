package swithcase;

import java.util.Scanner;

public class EstaçãodoAno {
	
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);

	        
	        System.out.print("Qual é o seu nome? ");
	        String nome = ler.nextLine();

	        System.out.print(nome + ", digite o número do mês (1 a 12): ");
	        int mes = ler.nextInt();
	        String estacao = "";
	        String nomeMes = "";

	        
	        switch (mes) {
	            case 12: case 1: case 2:
	                estacao = "Verão";
	                if(mes == 12) nomeMes = "Dezembro";
	                if(mes == 1) nomeMes = "Janeiro";
	                if(mes == 2) nomeMes = "Fevereiro";
	                break;
	                
	            case 3: case 4: case 5:
	                estacao = "Outono";
	                if(mes == 3) nomeMes = "Março";
	                if(mes == 4) nomeMes = "Abril";
	                if(mes == 5) nomeMes = "Maio";
	                break;
	                
	            case 6: case 7: case 8:
	                estacao = "Inverno";
	                if(mes == 6) nomeMes = "Junho";
	                if(mes == 7) nomeMes = "Julho";
	                if(mes == 8) nomeMes = "Agosto";
	                break;
	                
	            case 9: case 10: case 11:
	                estacao = "Primavera";
	                if(mes == 9) nomeMes = "Setembro";
	                if(mes == 10) nomeMes = "Outubro";
	                if(mes == 11) nomeMes = "Novembro";
	                break;
	                
	            default:
	                estacao = "Mês Inválido";
	                nomeMes = "Desconhecido";
	                break;
	        }

	       
	        if (estacao.equals("Mês Inválido")) {
	            System.out.println("---");
	            System.out.println(nome + ", no mês de " + nomeMes + " é " + estacao + "!");
	        } else {
	            System.out.println(nome + ", você digitou um número de mês inválido.");
	        }

	        ler.close();
	    }
	
	}


