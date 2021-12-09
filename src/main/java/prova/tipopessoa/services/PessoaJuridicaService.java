package prova.tipopessoa.services;

import java.util.List;

import prova.tipopessoa.domain.PessoaJuridica;

public interface PessoaJuridicaService {
	
	void salvar(PessoaJuridica pessoajuridica);

	void editar(PessoaJuridica pessoajuridica);

	void excluir(Long id);

	PessoaJuridica buscarPorId(Long id);

	List<PessoaJuridica> buscarTodos();
}
