
package Switch;

import java.util.Scanner;


public class temperatura 
{
    public static void main(String [] args)
    {
     Scanner leia = new Scanner(System.in);
     temperatura T = new temperatura();
     
     float escolha;
     int opcao, valor;
     
     System.out.println("************************************************");
     System.out.println("*          CONVERSÃO DE TEMPERATURA            *");
     System.out.println("************************************************");
     
     System.out.println("Escolha o tipo de temperatura:\n1 - Celsius(°C) \n2 - Fahrenheit(°F) \n3 - Kelvin(K)");
     System.out.println("Digite aqui: ");
     opcao = leia.nextInt();
     
     switch(opcao)
     {
         case 1:
             System.out.println("Valor inicial da temperatura:\n1 - F° \n2 - K");
             System.out.println("Digite aqui: ");
             escolha = leia.nextInt();
             if(escolha == 1)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = ((valor - 32)*5)/9;
                 System.out.println("A conversão de Fahrenheit para Celsius é: "+String.format("%.2f",escolha));
             }
             else if(escolha == 2)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = valor - 273.15f;
                 System.out.println("A conversão de Kelvin para Celsius é: "+String.format("%.2f",escolha));
             }
             break;
         case 2:
             System.out.println("Valor inicial da temperatura:\n1 - C° \n2 - K");
             System.out.println("Digite aqui: ");
             escolha = leia.nextInt();
             if(escolha == 1)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = ((valor*9)/5)+32;
                 System.out.println("A conversão de Celsius para Fahrenheit é: "+String.format("%.2f",escolha));
             }
             else if(escolha == 2)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = (((valor - 273.15f)*9)/5)+32;
                 System.out.println("A conversão de Kelvin para Fahrenheit é: "+String.format("%.2f",escolha));
             }
             break;
         case 3:
             System.out.println("Valor inicial da temperatura:\n1 - C° \n2 - F°");
             System.out.println("Digite aqui: ");
             escolha = leia.nextInt();
             if(escolha == 1)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = valor + 273.15f;
                 System.out.println("A conversão de Celsius para Kelvin é: "+String.format("%.2f",escolha));
             }
             else if(escolha == 2)
             {
                 System.out.print("Qual o valor da temperatura? ");
                 valor = leia.nextInt();
                 escolha = (((valor - 32)*5)/9)+273.15f;
                 System.out.println("A conversão de Celsius para Fahrenheité: "+String.format("%.2f",escolha));
             }
             break;
         default: 
             System.out.println("Digitação inválida!");
     }//switch
     }//main
}//class
