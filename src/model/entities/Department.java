package model.entities;

import java.io.Serializable;

public class Department implements Serializable{

    private Integer id;
    private String name;

    public Department (){

    }

    public Department (Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){

        final int prime = 31;
        int result = 1;
        result = prime * result +((id == null) ? 0 : id.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;

        Department other = (Department)  obj;
         if(id == null){

             return other.id == null;

         }else return id.equals(other.id);
    }

    @Override
    public String toString(){

        return "Id: " + id + "name: " + name;
    }

}
