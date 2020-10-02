package controle;
import dominio.Paralelepipedo;
import java.util.Scanner;

public class ControlaParalelepipedo {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a aresta A: ");
        float arestaA = leia.nextFloat();
        
        System.out.println("Digite a aresta B: ");
        float arestaB = leia.nextFloat();
        
        System.out.println("Digite a aresta C: ");
        float arestaC = leia.nextFloat();
        
        Paralelepipedo paralelepipedo = new Paralelepipedo(arestaA, arestaB, arestaC);
        
        System.out.print("A diagonal do paralelepipedo é : " + paralelepipedo.diagonal());
    }
}
