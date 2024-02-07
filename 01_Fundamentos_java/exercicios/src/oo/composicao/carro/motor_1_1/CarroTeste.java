package oo.composicao.carro.motor_1_1;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.acelerar();
		c.ligar();
		
		System.out.println("O carro esta ligado?: "+ c.estaLigado());
		System.out.println(c.motor.giros());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		
		System.out.println(c.motor.giros());
		
		//relação bidirecionais
		//System.out.println(c.motor.carro.motor.carro.motor.giros());
		//faltou encapsulament
		//c.motor.fatorInjecao = -30;
		
	}
}
