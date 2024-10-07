package src.services;

import src.model.Tarea;

import java.util.ArrayList;

public class DataTareas {
    public static ArrayList listaM(){
        ArrayList<Tarea> ttae = new ArrayList<>();
        ttae.add(new Tarea("Oraciones","5oraciones","dos/marzo",true));
        ttae.add(new Tarea("Signos de puntuación","2oraciones","dos/marzo",false));
        ttae.add(new Tarea("Ecuaciones algebraicas","4operaciones","dos/marzo",true));
        ttae.add(new Tarea("Cuadro sinoptico","cuadro_de_objetos","dos/marzo",false));
        ttae.add(new Tarea("Juego Informatico","crear_un_juego","dos/marzo",true));
        return listaM();
    }
}
