package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	private FilmeRepository filmeRepo = new FilmeRepository();
	
	public void salvar(Filme filme) {
		filmeRepo.salvar(filme);
	}
	
	public void atualizar(Filme filme) {
		filmeRepo.atualizar(filme);
	}
	
	public void remover(Filme filme) {
		filmeRepo.remover(filme);
	}
	
	/*
	public void listar(Filme filme) {
		filmeRepo.listar(filme);
	}*/
	
	public void buscarPorId(Long codigo) {
		filmeRepo.buscarPorId(codigo);
	}
}
