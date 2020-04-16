package codigo;
import java.util.Scanner;

public class estoque 
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in); 
        float quantAtual;
        float quantMinima;
        float quantMaxima;

        System.out.println("*********************************");
        System.out.println("*       ESTOQUE DE PRODUTOS     *");
        System.out.println("*********************************");

        System.out.println("Quantidade atual em estoque: ");
        quantAtual = leia.nextFloat();
        System.out.println("Quantidade máxima: ");
        quantMaxima = leia.nextFloat();
        System.out.println("Quantidade do mínima: ");
        quantMinima = leia.nextFloat();
        
        float quantMedia = ((quantMaxima+quantMinima)/2);
    
        System.out.println("A quantidade em estoque é: "+quantMedia);
        
        if(quantAtual >= quantMedia){
            System.out.println("Não efetuar compra.");
        }
        else{
            System.out.println("Efetuar compra.");
        }
    }
}
