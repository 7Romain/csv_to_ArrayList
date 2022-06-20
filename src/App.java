import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {

        transform("C:/Users/Oziri/Documents/CDA/Projets Java/Tp_fx_webmail/src/adressesMails.csv");
    }

    private static void transform(String fichier) throws IOException {
        LineNumberReader lineNumberReader = null;

        FileReader fileReader = new FileReader(fichier);

        lineNumberReader = new LineNumberReader(fileReader);
        ArrayList<String> liste = new ArrayList<String>();

        String ligneLue = null;
        while ((ligneLue = lineNumberReader.readLine()) != null) {

            liste.add(ligneLue);

        }
        try {
            lineNumberReader.close();
        } catch (IOException ioe) {
            System.err.println("Impossible de fermer le fichier  ");

        } catch (NullPointerException npe) {
            System.err.println("Impossible d'ouvrir le fichier  ");

        }
        System.out.println("La liste contient " + liste.size() + " éléments");
        ListIterator<String> li = liste.listIterator();

        while (li.hasNext())
            System.out.println(li.next());
    }
}
