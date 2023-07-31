package utilidades;

public class Calculadora {

	
	public static int suma( int a, int b) {
		return a+b;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int potencia(int base, int exponente) 
			throws ExponenteDebeSerPositivoException {
		int res = 1;
		
		if(exponente<0) {
			throw new ExponenteDebeSerPositivoException();
		}
		
		for (int i=1;i<=exponente; i++) {
			res=res*base;
		}
		return res;
	}
	
	public static double calculaRetencion( int nHijos, double salario ) {
		if (salario <1000) {
			if (nHijos<3) {
				return salario*0.01;
			} else {
				return 0;
			}
		} else if(salario>=1000 && salario<=2000) {
			if(nHijos<3) {
				return salario*0.03;
			} else {
				return salario*0.02;
			}
		} else {
			if (nHijos<3) {
				return salario*0.12;
			} else {
				return salario*0.08;
			}
		}
	}
}

