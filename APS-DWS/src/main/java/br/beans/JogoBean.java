package br.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.jogo.Jogo;

@SessionScoped
@ManagedBean(name = "jogoBean")
public class JogoBean {
	private Jogo jogo = new Jogo();
	private List<Jogo> jogos = new ArrayList<>();
	
	public static int atualizaId = 1;
	
	public void adicionarJogo() {
		jogo.setId(atualizaId++);
		jogo.setData(new Date());
		
		int numeroSecreto = new Random().nextInt(5) + 1;	
		
		jogo.setNumeroSecreto(numeroSecreto);
		
		if(jogo.getNumeroAposta().equals(numeroSecreto)) {
			jogo.setResultado("Acertou");
			//System.out.println(jogo.getResultado());
		}else {
			jogo.setResultado("Não acertou");
			//System.out.println(jogo.getResultado());
		}
		
		jogos.add(jogo);
		jogo = new Jogo();
		
	}
	
	public void excluir(Jogo jogo) {
			
		jogos.remove(jogo);
	}
	
	public int getQuantidadeJogos() {
		return jogos.size();
	}
	

	//get e set
	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	
	public Jogo getJogo() {
		return jogo;
	}





	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	
	
	

	
	
	
}
