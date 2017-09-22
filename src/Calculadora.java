
public class Calculadora {
	
	private double operando1;
	private double operando2;

	public Calculadora() {
		// TODO Auto-generated constructor stub
		this.getOperando1();
		this.getOperando2();
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public double suma(double operando1, double operando2){
		return operando1+operando2;
	}
	
	public double resta(double operando1, double operando2){
		return operando1-operando2;
	}
	
	public double multiplicacion(double operando1, double operando2){
		return operando1*operando2;
	}
	
	public double division(double operando1, double operando2){
		
		if(operando2 == 0){
			
			throw new IllegalArgumentException("Error el operando2 no debe"
					+ "ser 0");
		}
		else{
		return operando1/operando2;
		}
	}
	
	
	
}
