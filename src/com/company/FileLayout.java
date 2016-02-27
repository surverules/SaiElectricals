package com.company;

import java.math.BigDecimal;

/**
 * Created by surverules on 2/20/2016.
 */
public class FileLayout {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private BigDecimal salary = BigDecimal.ZERO;
    private String location = "";
    String [] list=null;
    public FileLayout(String a){
         list = a.split(" ");
        this.name = list[0];
        this.salary = new BigDecimal(list[1]);
        this.location =  list[2];
    }


}
