package com.cognizant.spring_learn;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {

    private String code;
    private String name;
    Logger log = LoggerFactory.getLogger(Country.class);

    public Country(){
        log.debug("Inside Country constructor");
    }

    public void setCode(String code){
       log.debug("Inside Country setCode");
       this.code=code;
    }

    public void setName(String name){
        log.debug("Inside Country setName");
        this.name=name;
    }

    public String getCode(){
        log.debug("Inside Country getCode");
        return this.code;
    }

    public String getName(){
        log.debug("Inside Country getName");
        return this.name;
    }

    @Override
    public String toString(){
        return "Country "+this.name+" "+this.code;
    }

}
