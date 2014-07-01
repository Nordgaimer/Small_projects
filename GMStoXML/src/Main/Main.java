package Main;

import java.io.IOException;

import DataOutput.DataCollector;
import Exceptions.DBSystemException;


public class Main {

    public static void main(String[] args) throws DBSystemException, IOException {
        DataCollector collector = new DataCollector();
        collector.CreateXMLFile("lol");

    }


}
