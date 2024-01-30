package classe;

public class Usuario {
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
		// verificando se o obejeto é instância da classe Usuário
		if(objeto instanceof Usuario) {			
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email == this.email;
			return nomeIgual && emailIgual;
		}
		else {
			return false;
		}
		
		
	}
}
