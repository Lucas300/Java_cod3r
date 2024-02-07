package oo.composicao.alunos.cursos_N_N;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	@SuppressWarnings("unused")
	Curso obterCursoPorNome(String nome){
		Curso procurado = null;
		for(Curso curso: this.cursos) {
			if(curso.nome.equals(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
}
