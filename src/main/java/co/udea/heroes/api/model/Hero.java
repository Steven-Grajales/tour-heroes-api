package co.udea.heroes.api.model;

public class Hero {

    private int id;
    private String name;

    public Hero(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = Name;
    }
}
