package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;


public class FilmeController {
	private FilmeService filmeService = new FilmeService();
	
	public void salvar(Filme filme) {
		filmeService.salvar(filme);
	}
	
	public void atualizar(Filme filme) {
		filmeService.atualizar(filme);
	}
	
	public void remover(Filme filme) {
		filmeService.remover(filme);
	}
	
	/*
	public void listar(Filme filme) {
		filmeService.listar(filme);
	}*/
	
	public void buscar(Long codigo) {
		filmeService.buscarPorId(codigo);
	}
	
}
