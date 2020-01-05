/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c.nadal
 */
public class ImportExportXML extends Export {

    public ImportExportXML(String nomFichier) {
        initComponent();
    }
    
    public void initComponent(){
        this.nomFichier = nomFichier;
    }

    @Override
    public void exportFichier() {
        FileWriter objFile = null;
        try {
            //ouverture du fichier en écriture
            objFile = new FileWriter(this.nomFichier);
            objFile.write("<?xml version = \"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?>");
            objFile.write("<clients>");
            objFile.write("<client><nom>Nadal</nom><prenom>Cyrille</prenom></client>");
            objFile.write("<client><nom>Nadal</nom><prenom>David</prenom></client>");
            objFile.write("<client><nom>Jacki</nom><prenom>Michel</prenom></client>");

            objFile.write("</clients>");

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
