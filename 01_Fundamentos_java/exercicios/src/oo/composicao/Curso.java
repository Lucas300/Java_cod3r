package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nome;
	//usando o final eu não poderei instânciar uma nova lista
	final  List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
