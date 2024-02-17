package models;

import com.google.gson.*;
import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {

	public void arquivo(Cep cep) throws IOException {  
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileWriter escrever = new FileWriter(cep.cep() + ".json");
		escrever.write(gson.toJson(cep)); 
		escrever.close();
	}
}
