package oo.composicao;

public class Motor {
	boolean ligado = false;
	double fatorInjecao = 1;
	Carro carro;
	
	Motor(){
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {	
			return (int)fatorInjecao * 3000;			
		}
	}
}
