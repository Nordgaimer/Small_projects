package JDBCUtils;

public class QueryBuilder {
    //Заголовок
    public static String getHeader (int documentId){
        String temp = "SELECT * FROM t_Ven WHERE ChID="+documentId;
        return temp;
    }
    //Товар
    public static String getProduct (int documentId){
        String temp =  "SELECT * FROM t_VenA WHERE ChID="+documentId;
        return temp;
    }
    //Партия
    public static String getProductBatch (int documentId){
        String temp =  "SELECT * FROM t_VenD WHERE ChID="+documentId;
        return temp;
    }
    //Виды упаковок
    public static String getPackType (int documentId){
        String temp =  "SELECT * FROM t_VenD_UM WHERE ChID="+documentId;
        return temp;
    }
    //Маршрут
    public static String getProductRoutes (int documentId){
        String temp =  "SELECT * FROM t_VenRoutes WHERE ChID="+documentId;
        return temp;
    }
    //Затраты
    public static String getProductSpends (int documentId){
        String temp = "SELECT * FROM t_VenSpends WHERE ChID="+documentId;
        return temp;
    }
    //Несоответствие штрихкодов
    public static String getUnknownBarCodes (int documentId){
        String temp =  "SELECT * FROM t_VenUnknBarCodes WHERE ChID="+documentId;
        return temp;
    }
    //Несоответствие остатков
    public static String getProductImbalance(int documentId){
        String temp =  "SELECT * FROM t_VenDiscrepancyRecordsRem WHERE ChID="+documentId;
        return temp;
    }

}
