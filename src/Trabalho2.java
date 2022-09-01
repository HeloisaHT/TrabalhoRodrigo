import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		 	double Bimestre1, Bimestre2, mediaF;
	        Scanner leitura = new Scanner(System.in);
	        
	        System.out.println("Por favor entre com a nota do primeiro bimestre");
	        Bimestre1 = leitura.nextDouble();
	        Bimestre1 = Bimestre1*2;
	        
	        System.out.println("Por favor entre com a nota do Segundo bimestre");
	        Bimestre2 = leitura.nextDouble();
	        Bimestre2 = Bimestre2*3;
	        
	        mediaF = (Bimestre1+Bimestre2)/5;
	        System.out.println("A media Final do aluno é:  "+mediaF);
		
		

	}

}
