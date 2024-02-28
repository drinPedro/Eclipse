package somarInteiros;
import java.util.*;

class somadorDeInteiros{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
	    int a;
	    int b;
	    
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    int soma=a+b;
	    
	    System.out.println("Soma: " + a + " + " + b + " = " + soma);
	}
}
