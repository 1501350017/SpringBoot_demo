package com.example.empproject;

public class Employee {
    private long id;
    private String name;
    private String mobileNo;
    private long salary;

    public Employee(){}

    public Employee(long id,String name, String mobileNo, long salary){
        this.id=id;
        this.name=name;
        this.mobileNo=mobileNo;
        this.salary= salary;

    }
    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(Long salary){
        this.salary= salary;
    }
    public String getMobileNo(){
        return mobileNo;
    }
    public void setMobileNo(String mobileNo){
        this.mobileNo= mobileNo;
    }

}
