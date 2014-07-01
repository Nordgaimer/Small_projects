package JDBCUtils;

public class XMLDescriptionMaker {
    public static String TablesDesc = "<dict>\n"
            + "<tablesource>\n"
            + "<tablesource id=\"100\" name=\"t_Ven\" desc=\"Заголовок\"/>\n"
            + "<tablesource id=\"101\" name=\"t_VenA\" desc=\"Товар\"/>\n"
            + "<tablesource id=\"102\" name=\"t_VenD\" desc=\"Партии\"/>\n"
            + "<tablesource id=\"103\" name=\"t_VenD_UM\" desc=\"Виды упаковок\"/>\n"
            + "<tablesource id=\"104\" name=\"t_VenRoutes\" desc=\"Маршрут\"/>\n"
            + "<tablesource id=\"104\" name=\"t_VenSpends\" desc=\"Затраты\"/>\n"
            + "<tablesource id=\"105\" name=\"t_VenUnknBarCodes\" desc=\"Неизвестные штрихкоды\"/>\n"
            + "<tablesource id=\"106\" name=\"t_VenDiscrepancyRecordsRem\" desc=\"Несоответствие учетного остатка\"/>\n"
            + "<tablesource id=\"107\" name=\"t_Ven\" desc=\"Заголовок\"/>\n"
            +"</tablesource>";
    public static String FieldsDesc = "<tablefields>\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"2\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"3\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"4\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"5\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"6\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"7\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"8\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"9\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"10\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"11\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"
            + "<field id=\"1\" name=\"ChID\"  desc=\"Код регистрации\"\n"


            + "";

    public static String addRusDesc (String columnName){
        if (columnName.equals("ChID")) {
            return " description=\"Код регистрации\"";
        }
        if (columnName.equals("DocID")) {
            return " description=\"a\"";
        }
        if (columnName.equals("DocDate")) {
            return " description=\"Дата\"";
        }
        if (columnName.equals("KursMC")) {
            return " description=\"КурсОВ\"";
        }
        if (columnName.equals("OurID")) {
            return " description=\"Фирма\"";
        }
        if (columnName.equals("StockID")) {
            return " description=\"Склад\"";
        }
        if (columnName.equals("CodeID1")) {
            return " description=\"Признак 1\"";
        }
        if (columnName.equals("CodeID2")) {
            return " description=\"Признак 2\"";
        }
        if (columnName.equals("CodeID3")) {
            return " description=\"Признак 3\"";
        }
        if (columnName.equals("CodeID4")) {
            return " description=\"Признак 4\"";
        }
        if (columnName.equals("CodeID5")) {
            return " description=\"Признак 5\"";
        }
        if (columnName.equals("EmpID")) {
            return " description=\"Служащий\"";
        }
        if (columnName.equals("Notes")) {
            return " description=\"Примечание\"";
        }
        if (columnName.equals("IntDocID")) {
            return " description=\"Доп номер\"";
        }
        if (columnName.equals("CompID")) {
            return " description=\"Предприятие\"";
        }
        if (columnName.equals("Discount")) {
            return " description=\"Скидка\"";
        }
        if (columnName.equals("SrcDocID")) {
            return " description=\"Номер источника\"";
        }
        if (columnName.equals("SrcDocDate")) {
            return " description=\"Дата источника\"";
        }
        if (columnName.equals("CurrID")) {
            return " description=\"Валюта\"";
        }
        if (columnName.equals("TSumCC_nt")) {
            return " description=\"Итого без НДС\"";
        }
        if (columnName.equals("TTaxSum")) {
            return " description=\"Итого НДС\"";
        }
        if (columnName.equals("TSumCC_wt")) {
            return " description=\"Итого с НДС\"";
        }
        if (columnName.equals("TNewSumCC_nt")) {
            return " description=\"Нов Итого без НДС\"";
        }
        if (columnName.equals("TNewTaxSum")) {
            return " description=\"Нов Итого НДС\"";
        }
        if (columnName.equals("TNewSumCC_wt")) {
            return " description=\"Нов Итого с НДС\"";
        }
        if (columnName.equals("TSpendSumCC")) {
            return " description=\"Итого затрат ВС\"";
        }
        if (columnName.equals("TRouteSumCC")) {
            return " description=\"Итого доставка ОВ\"";
        }
        if (columnName.equals("StateCode")) {
            return " description=\"Статус\"";
        }
        return "" ;

    }


}
