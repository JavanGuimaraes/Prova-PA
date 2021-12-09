package prova.tipopessoa.dao;

import java.util.List;

import prova.tipopessoa.dao.PessoaDao;
import prova.tipopessoa.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);

	void update(Pessoa pessoa);

	void delete(Long id);

	Pessoa findById(Long id);

	List<Pessoa> findAll();

}
