package Blanks;

import Utils.DBSystemException;


/**
 * Created by javadev on 08.04.14.
 */
public interface Public_Service_DAO {
    //////////////////////////////////////////////////////////
    //SERVICE NAME AND ID                                   //
    //READ, UPDATE                                          //
    //////////////////////////////////////////////////////////
    public String readServiceName() throws DBSystemException;
    public void updateServiceName(String newName) throws DBSystemException;

    //////////////////////////////////////////////////////////
    //TARIFF                                                //
    //READ, UPDATE                                          //
    //////////////////////////////////////////////////////////
    public String readTariffDate() throws DBSystemException;
    public void updateTariffDate(String current_tariff) throws DBSystemException;
    public double readTariffCurrent()throws DBSystemException;
    public void updateTariffCurrent(double data)throws DBSystemException;
    public boolean tariffFixedStatus() throws DBSystemException;
    //////////////////////////////////////////////////////////
    //COUNTER                                               //
    //READ, UPDATE                                          //
    //////////////////////////////////////////////////////////

    public String readCounterDate() throws DBSystemException;
    public void updateCounterDate(String date) throws DBSystemException;
    public short readCounterCurrent() throws DBSystemException;
    public void updateCounterCurrent(short data) throws DBSystemException;

    //////////////////////////////////////////////////////////
    //SERVICE UNIT                                          //
    //READ, UPDATE                                          //
    //////////////////////////////////////////////////////////
    public String readServiceUnitName() throws DBSystemException;
    public void updateServiceUnitName(String unit_name) throws DBSystemException;

}
