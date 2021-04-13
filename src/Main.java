
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Em um triangulo, cada lado é menor que a soma dos outros dois lados
		// && l2<l1+l3 && l3<l2+l1
		
		Scanner input = new Scanner(System.in);
        
        int l1, l2, l3;
        
        System.out.println ("Digite o valor do lado 1: ");
        l1=input.nextInt();
        
        System.out.println ("Digite o valor do lado 2: ");
        l2=input.nextInt();
        
        System.out.println ("Digite o valor do lado 3: ");
        l3=input.nextInt();
        
        if (l1<l2+l3)
        	if (l2<l1+l3)
        		if (l3<l1+l2) 
        			System.out.println("triangulo válido");
        		else System.out.println("Triangulo invalido");
        	else System.out.println("triangulo invalido");
        else System.out.println("triangulo invalido");
        		
        		
       input.close();
	}

}