/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Galdr
 */
public class ImportExportCSV extends Export {

    public ImportExportCSV(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void exportFichier() {
        FileWriter objFile = null;
        try {
            //ouverture du fichier en écriture
            objFile = new FileWriter(this.nomFichier);
            objFile.write("Nom;Prenom\r\n");
            objFile.write("Nadal;Cyrille\r\n");
            objFile.write("Nadal;David\r\n");

            objFile.close();

        } catch (IOException ex) {
            Logger.getLogger(ImportExportXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String importFichier() {
        String resultat = "";

        try {
            FileReader objFile = null;

            //ouverture du fichier en lecture
            objFile = new FileReader(this.nomFichier);
            int c;
            while ((c = objFile.read()) != -1) {
                resultat += (char) c;
            }
            objFile.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportExportXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportExportXML.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultat;
    }

}
