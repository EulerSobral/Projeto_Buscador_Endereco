package models;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;

public class Buscador {

	private String url;

	
	public Buscador(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	} 
	
	public Cep retornoBusca() throws IOException, InterruptedException {  

			HttpClient client = HttpClient.newHttpClient(); 
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.url)).build();  
			
			try {
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());  
				String json = response.body();
				
				Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
				
				return gson.fromJson(json, Cep.class);  
			} catch(Exception e) { 
				throw new RuntimeException("Não consegui obter o endereço desejado!");
			}
		
	
	}	
	
	
}
