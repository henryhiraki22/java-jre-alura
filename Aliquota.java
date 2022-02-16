
public class Aliquota {
	public static void main(String[] args) {
		
		double salario = 1.0;
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("o valor eh de 142");
		} else if (salario > 2800 && salario <= 3751) {
			System.out.println("o valor eh de 350");
		} else if (salario > 3751 && salario <= 4664){
			System.out.println("o valor eh de 636");
		} else {
			System.out.println("vc nao vai ser descontado");
		}
		
	}
}
