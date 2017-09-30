package br.com.fiap.client;

import java.util.List;

public class ChamadaObjeto {

	public static void main(String[] args) {
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		List<Aluno> alunos;
		try {
			ListarResponse resposta = port.listar(new Listar(), "pedro", "123");
			
			alunos = resposta.getReturn();
			
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Media: " + aluno.getMedia());
				System.out.println("Turma: " + aluno.getTurma());
			}
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}

}
