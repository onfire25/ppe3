/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

/**
 *
 * @author c.nadal
 */
public class Test {

    public static void main(String[] args) {
//        ImportExportXML objEXML = new ImportExportXML("export7nov.xml");
//        objEXML.exportFichier();
//        System.out.println(objEXML.importFichier());

//        ImportExportCSV objECSV = new ImportExportCSV("export7nove.csv");
//        objECSV.exportFichier();
//        System.out.println(objECSV.importFichier());

        ImportExportJSON objEJSON = new ImportExportJSON("export7novembr.json");
        objEJSON.exportFichier();
        System.out.println(objEJSON.importFichier());
    }
}
