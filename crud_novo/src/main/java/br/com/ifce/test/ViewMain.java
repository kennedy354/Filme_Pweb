package br.com.ifce.test;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class ViewMain {

	public static void main(String[] args) {
		Filme f1 = new Filme();
		f1.setTitulo("Exterminador");
		f1.setCategoria("Ação");
		f1.setDuracao(120);
		f1.setPreco(10.0);
		f1.setData("22/04/1980");
		
		Filme f2 = new Filme();
		f2.setTitulo("Mad Max");
		f2.setCategoria("Ação");
		f2.setDuracao(130);
		f2.setPreco(11.0);
		f2.setData("13/02/2015");
		
		Filme f3 = new Filme();
		f3.setTitulo("Alien");
		f3.setCategoria("Terror");
		f3.setDuracao(125);
		f3.setPreco(09.0);
		f3.setData("19/08/1981");
		
		Filme f4 = new Filme();
		f4.setTitulo("Logan");
		f4.setCategoria("Ação");
		f4.setDuracao(123);
		f4.setPreco(15.0);
		f4.setData("19/06/2017");
		
		Filme f5 = new Filme();
		f5.setTitulo("Clube da Luta");
		f5.setCategoria("Suspense");
		f5.setDuracao(133);
		f5.setPreco(10.0);
		f5.setData("11/09/1999");
		
		FilmeController filmeCon = new FilmeController();
		
		filmeCon.salvar(f1);
		filmeCon.salvar(f2);
		filmeCon.salvar(f3);
		filmeCon.salvar(f4);
		filmeCon.salvar(f5);
		
		f3.setTitulo("Dracula");
		f3.setData("19/08/1986");
		
		filmeCon.atualizar(f3);
		
		filmeCon.remover(f5);
		
		filmeCon.buscar(f3.getCodigo());
		
		//System.out.println(f1);
		//não consegui fazer a listagem
		
	}

}
