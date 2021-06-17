package fr.epsi.utilities;

import fr.epsi.entities.Capture;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FetchData {

    public static List<Capture> getCaptures(){
        List<Capture> lesCaptures = new LinkedList<>();

        Capture c = new Capture();
        c.setId(1L);
        c.setIncident("Un ouvrier est tombé dans un trou");
        c.setDateCapture(LocalDate.of(2021,05,03));
        lesCaptures.add(c);

        c = new Capture();
        c.setId(2L);
        c.setIncident("Un plot s'est renversé");
        c.setDateCapture(LocalDate.of(2021,06,11));
        lesCaptures.add(c);

        return lesCaptures;
    }

}
