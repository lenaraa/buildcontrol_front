package fr.epsi.utilities;

import fr.epsi.entities.Capture;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FetchData {

    public static List<Capture> getCaptures(){

        List<Capture> lesCaptures = new LinkedList<Capture>();

        //capture 1 pour tester
        Capture c = new Capture();
        c.setId(1L);
        c.setDateCapture(LocalDate.now());
        c.setIncident("Un ouvrier est tombé dans un trou");
        lesCaptures.add(c);

        //capture 2 pour tester
        c = new Capture();
        c.setId(2L);
        c.setDateCapture(LocalDate.of(2021,06,17));
        c.setIncident("Un plot s'est renversé");
        lesCaptures.add(c);

        return lesCaptures;
    }
}
