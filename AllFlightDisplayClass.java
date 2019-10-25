/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airlinemanagementjdbc;

/**
 *
 * @author nakul
 */
public class AllFlightDisplayClass {
    
    private int flight_no;
    private String depart_airport, arrival_airport, depart_date, arrival_date;
    
    public AllFlightDisplayClass(int flight_no, String depart_airport, String arrival_airport, String depart_date, String arrival_date)
    {
        this.flight_no = flight_no;
        this.depart_airport = depart_airport;
        this.arrival_airport = arrival_airport;
        this.depart_date = depart_date;
        this.arrival_date = arrival_date;
    }
    
    public int getFlightNo()
    {
        return flight_no;
    }
    public String getDepartAirport()
    {
        return depart_airport;
    }
    public String getArrivalAirport()
    {
        return arrival_airport;
    }
    public String getDepartDate()
    {
        return depart_date;
    }
    public String getArrivalDate()
    {
        return arrival_date;
    }
}
