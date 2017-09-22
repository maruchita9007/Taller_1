
public class AppMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		double Suma = calculadora.suma(1000, 2000);
		double Resta = calculadora.resta(2000, 1000);
		double Multiplicacion = calculadora.multiplicacion(9, 8);
	//	double Division = null;		
		try{
			
			double Division = calculadora.division(24, 0);
			System.out.println("La división es: " +Division);
		}
		
		catch(Exception e){
			System.out.println("El operando 2 no puede ser 0");
					
		}
		
		System.out.println("La suma es: "+Suma);
		System.out.println("La resta es: "+Resta);
		System.out.println("La multiplicación es: "+Multiplicacion);
		

	}

}
