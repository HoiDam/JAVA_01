package model;

import java.util.Dictionary;
import java.util.Hashtable;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String id;

    public static void main(){
        String name = "Alvin";
        int age = 12;
        char gender = 'M';
        String id = "8491A";

    }
    public void getAll(){
        System.out.println("name "+this.name );
        System.out.println("age "+this.age );
        System.out.println("gender "+this.gender );
        System.out.println("id "+this.id );
        System.out.println("\n\n");
    }
    public void setAll(String Nname, int Nage,char    Ngender, String Nid){
        this.name = Nname;
        this.age = Nage  ;
        this.gender = Ngender;
        this.id = Nid;
    }
}
