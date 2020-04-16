
package logica;
import java.util.Scanner;

public class codigo 
{
    Scanner leia = new Scanner(System.in);
    public float prova1;
    public float prova2;
      
    public void mediaNota(float p1, float p2)
    {
      this.prova1 = p1;
      this.prova2 = p2;
      if(prova1 <=10 && prova2 <=10 && prova1 >=0 && prova2 >=0)
      {
      float media = ((prova1+prova2)/2);
     
      System.out.println("A média foi: "+String.format("%.1f",media));
      
      if(media >= 7)
      {
         System.out.println("O aluno está aprovado!");
      }//if
      else
      {
          System.out.println("O aluno está reprovado!");
      }//else
      }
      else
       {
          System.out.println("Nota inválida, refazer o processo das notas.");
          
          codigo C = new codigo();
          System.out.println("Digitar as notas da 1° e 2° prova novamente: ");
          C.mediaNota(leia.nextFloat(), leia.nextFloat());
       }
      }//método
    
    public static void main(String [] args)
    {
        String aluno;
        
        codigo C = new codigo();
        Scanner leia = new Scanner(System.in); 
        
        System.out.println("*************************************");
        System.out.println("*               MÉDIA               *");
        System.out.println("*************************************");
        System.out.println("Nome do aluno: ");
        aluno = leia.next();
        System.out.println("Digite as notas da 1° e 2° prova: ");
        C.mediaNota(leia.nextFloat(), leia.nextFloat());
    }//main
}//class
