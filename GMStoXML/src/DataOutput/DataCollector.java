package DataOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Exceptions.DBSystemException;
import JDBCUtils.DAO_Manager;


public class DataCollector {

    public void CreateXMLFile (String path) throws IOException, DBSystemException{


        File file = new File("c:\\newfile.xml"); //path

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        DAO_Manager dao_Manager = new DAO_Manager();

        List <Integer> listOfDocs =  dao_Manager.getDocsChIdToList();

        for (int i=0;i<listOfDocs.size();i++){
            bw.write("<DocID "+listOfDocs.get(i)+">");
            bw.write(dao_Manager.getHeaderInString(listOfDocs.get(i)));
            bw.write(dao_Manager.getProductInString(listOfDocs.get(i)));
            bw.write(dao_Manager.getPackTypeInString(listOfDocs.get(i)));
            bw.write(dao_Manager.getProductSpendsInString(listOfDocs.get(i)));
            bw.write(dao_Manager.getPackTypeInString(listOfDocs.get(i)));
            bw.write("</DocID>");
        }

        bw.close();
        System.out.println("Done");
    }


}
