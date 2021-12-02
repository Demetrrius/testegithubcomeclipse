package br.com.ditec;

import br.com.ditec.model.Cachorro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro(null, null, null, null);
		cachorro.setNome("Luck");
		cachorro.setCor("Preto&Branco");
		cachorro.setRaca("S.R.D");
		cachorro.setIdade(10);
		
		System.out.println("Nome " + cachorro.getNome());
		System.out.println("Cor  " + cachorro.getCor());
		System.out.println("Raca " + cachorro.getRaca());
		System.out.println("Idde " + cachorro.getIdade());
		
		
	}
}