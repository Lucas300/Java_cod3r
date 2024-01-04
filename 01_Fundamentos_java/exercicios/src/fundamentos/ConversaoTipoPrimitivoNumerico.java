package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		//Tipos de conversões 
		//Byte<Short<Int<Long nessa Ordem não perdera dados
		
		double a = 1 ; // coversão implícita o java faz de forma automática 
		System.out.println(a);
		
		float b = (float)1.3; //conversão explícita temos que converter manualmente
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c ;//vai de -128 a 127
		System.out.println(d);//conversão explícita
		
		double f = 1.9999;
		int g = (int)f;
		System.out.println(g);
		
	}

}
