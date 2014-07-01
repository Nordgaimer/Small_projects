package JDBCUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import Exceptions.DBSystemException;

public class XMLBuilder {
    /*
    * Create xml string - fastest, but may have encoding issues
    */
    public static String toXML(ResultSet rs,String XMLDataName) throws SQLException, DBSystemException
    {
        DAO_Manager dao_Manager = new DAO_Manager();

        List <Integer> listOfDocs =  dao_Manager.getDocsChIdToList();

        for (int i=0;i<listOfDocs.size();i++){



        }
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        StringBuffer xml = new StringBuffer();
        xml.append("<Table "+XMLDataName+"\n");

        while (rs.next())
        {
            //xml.append("");

            for (int i = 1; i <= colCount; i++)
            {
                String addDescription = XMLDescriptionMaker.addRusDesc(rsmd.getColumnName(i));
                String columnName = rsmd.getColumnName(i);
                Object value = rs.getObject(i);
                xml.append("<" + columnName + addDescription + ">");

                if (value != null)
                {
                    xml.append(value.toString().trim());
                }
                xml.append("</" + columnName + ">" +"\n");
            }
            // xml.append("</Row>");
        }

        xml.append("</Table>");

        return xml.toString();
    }



}