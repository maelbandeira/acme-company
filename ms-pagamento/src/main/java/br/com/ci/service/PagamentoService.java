package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Pagamento;
import br.com.ci.repository.PagamentoRepository;

@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository reporitory;
	
	public List<Pagamento> lista(){
		return this.reporitory.findAll();
	}

}
