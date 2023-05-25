import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //instanciamos la libreria
        Gson gson = new Gson();

        //Instanciamos primer piloto
        Piloto piloto = new Piloto();
        System.out.println(piloto);
        String json_original = gson.toJson(piloto, Piloto.class);
        System.out.println(json_original);

        //intanciamos el segundo piloto y añadimos sus datos correspondientes
        Piloto piloto1 = new Piloto("Max", "Verstappen", 25, 38);
        System.out.println(piloto1);
        String json_original1 = gson.toJson(piloto1, Piloto.class);
        System.out.println(json_original1);

        //Escribo los dos objetos en el fichero y cerramos el fichero
        FileWriter file = new FileWriter("piloto.json");
        file.write(json_original);
        file.write(json_original1);
        file.close();

        //Leemos los dos objetos piloto y cerramos la lectura
        FileReader fileReader = new FileReader("piloto.json");
        JsonReader jsonReader = new JsonReader(fileReader);
        jsonReader.setLenient(true);

        //Pasamos los string a dos objetos piloto
        Piloto piloto_guardado = gson.fromJson(jsonReader, Piloto.class);
        jsonReader.hasNext();
        Piloto piloto_guardado1 = gson.fromJson(jsonReader, Piloto.class);

        //Cerramos la lectura
        jsonReader.close();
        fileReader.close();
    }
}
