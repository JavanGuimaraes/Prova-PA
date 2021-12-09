package prova.tipopessoa.dao;

import org.springframework.stereotype.Repository;

import prova.tipopessoa.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Long> implements PessoaDao{

}
