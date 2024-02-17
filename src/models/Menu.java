package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Buscador;
import models.GeraArquivo;
import models.Cep;

public class Menu {
	
	public Menu(){ 
		
	}
	 
	public void RetornaCep() throws IOException, InterruptedException {   
	
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o cep: ");
		GeraArquivo arquivo = new GeraArquivo();
		String cep = sc.nextLine(); 
		try {
			String url = "https://viacep.com.br/ws/" + cep + "/json/"; 
			Buscador busca = new Buscador(url); 
			Cep res = busca.retornoBusca();
			arquivo.arquivo(res); 
			System.out.println(res.toString()); 
		} catch(RuntimeException | IOException e ) { 
			System.out.println(e.getMessage());
		}
	}
	
	
}
