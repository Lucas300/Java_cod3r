package fundamentos;
public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario 
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23; // maximo 127
		short numeroDeVoos = 542;// maximo 32767
		int id = 56789;        // 2bilhões
		long pontosAcumulados = 3_134_845_223L;//usamos L de literal , para o java entender que o numero se trata literalmente de um Long
		
		//Tipos numéricos reais
		float salario = 11_445.44f;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//tipo boolean
		boolean estaDeFerias = true;
		
		//tipo caractere 
		char status = 'A'; //aceita uma letra somente
	
		//dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / VendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: "+ status);
		
		/**
		 * @author Lucas 
		 * @since jdk-21
		 */
	}

}
