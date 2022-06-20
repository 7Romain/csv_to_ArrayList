import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class Transform {
    void transform(String fichier) throws IOException {
        LineNumberReader lineNumberReader = null;

        FileReader fileReader = new FileReader(fichier);
        fileReader = new FileReader(fichier);
        lineNumberReader = new LineNumberReader(fileReader);
        ArrayList<String> liste = new ArrayList<String>();

        String ligneLue = null;
        while ((ligneLue = lineNumberReader.readLine()) != null) {

            liste.add(ligneLue);

        }
        System.out.println("La liste contient " + liste.size() + " éléments");
    }

}
