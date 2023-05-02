package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private double baseSalary;

    private Department department;

    public Seller(){}

    public Seller(Integer id, String name, String email, Date birthDate, double baseSalary, Department department ){

        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode(){

        final int prime = 31;
        int result = 1;

        result = prime * result +((id == null) ? 0 : id.hashCode());
        return  result;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Seller other = (Seller) obj;
        if(id == null) {

            return other.id == null;
        }else return id.equals(other.id);
    }

    @Override
    public String toString(){

        return "name: "+this.name
                +" e-mail: "+this.email
                +" birth date: "+this.birthDate
                +" base salary: "+this.baseSalary
                +" id: "+this.id
                +" department"+this.department;
    }
}
