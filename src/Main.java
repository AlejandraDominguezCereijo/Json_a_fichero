import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Piloto piloto1 = new Piloto();
        System.out.println(piloto1);

        Piloto piloto2 = new Piloto("Max", "Verstappen", 25, 39);
        System.out.println(piloto2);

        ArrayList<Piloto> pilotos = new ArrayList<>();
        pilotos.add(piloto1);
        pilotos.add(piloto2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(pilotos);

        FileWriter file = new FileWriter("piloto.json");
        file.write(json);
        file.close();
    }
}
