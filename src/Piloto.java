import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class Piloto {

    private String nombre;
    private String apellido;
    private int edad;
    private int victorias;

    public Piloto() {
        this.nombre = "Fernando";
        this.apellido = "Alonso";
        this.edad = 41;
        this.victorias = 32;
    }


    public Piloto(String nombre, String apellido, int edad, int victorias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return "{\"piloto\":" + gson.toJson(this) + "}";
    }
}
