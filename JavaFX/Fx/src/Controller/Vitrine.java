package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class Vitrine {
    
	private static List<Produto> produtos = new ArrayList<Produto>();
	 
	 public void addProduto(Produto... produto){
		 for (Produto roda : produto) {
			produtos.add(roda);
		}
	 }
	 
	 public List<Produto> getProdutos(){
		 return produtos;
	 }
}
