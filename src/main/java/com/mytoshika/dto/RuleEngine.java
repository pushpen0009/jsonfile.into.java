package com.mytoshika.dto;

public class RuleEngine {

    private OldEmployee oldEmployee;

    private GoodSalary goodSalary;

    public void setOldEmployee(OldEmployee oldEmployee){
        this.oldEmployee = oldEmployee;
    }
    public OldEmployee getOldEmployee(){
        return this.oldEmployee;
    }
    public void setGoodSalary(GoodSalary goodSalary){
        this.goodSalary = goodSalary;
    }
    public GoodSalary getGoodSalary(){
        return this.goodSalary;
    }
}
