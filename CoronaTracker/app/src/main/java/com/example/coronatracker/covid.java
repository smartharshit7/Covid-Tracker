package com.example.coronatracker;

public class covid {
    String state;
   String confirmed;
     String active;
    String recovered;
   String deaths;

    public covid(String state,String confirmed,String active,String recovered,String deaths) {
        this.state = state;
        this.confirmed=confirmed;
        this.active=active;
        this.recovered=recovered;
        this.deaths = deaths;



    }

    public String getState() {
        return state;
    }
    public String getConfirmed(){
        return confirmed;
    }
    public String getActive(){
        return active;
    }
    public String getRecovered(){
        return recovered;
    }
    public String getDeaths() {
        return deaths;
    }



}
