/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private int fecha_Nacimiento;
    private int NIA;
    private String grupo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private double max;
    private double min;
    public static final int MAYOREDAD = 18;
    private static int contador = 0;
    final  String cod;
    
    public Alumno(String nom, String ape, int fecha, int nia, String grupo){
        this.nombre = nom;
        this.apellidos = ape;
        this.fecha_Nacimiento = fecha;
        this.NIA = nia;
        this.grupo = grupo;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.media = 0.0;
        this.min = 0.0;
        this.max = 0.0;
        contador++;
        this.cod=grupo + "_-_" + nom;
        
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setApellidos(String ape){
        this.apellidos = ape;
    }
    public void setFecha_Nacimiento(int fecha){
        this.fecha_Nacimiento = fecha;
    }
    public void setNIA(int nia){
        this.NIA = nia;
    }
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    public void setNota1(double n1){
        this.nota1 = n1;
    }
    public void setNota2(double n2){
        this.nota2 = n2;
    }
    public void setNota3(double n3){
        this.nota3 = n3;
    }
    public double getMedia(){
        return this.media = ((this.getNota1()+this.getNota2()+this.getNota3())/3);
    }
    public double getMin(){
       double mini = 99;
            if (this.getNota1()<mini){mini = this.getNota1();}
            if (this.getNota2()<mini){mini = this.getNota2();}  
            if (this.getNota3()<mini){mini = this.getNota3();} 
       return this.min = mini;
    }
    public double getMax(){
       double maxi = 0;
            if (this.getNota1()>maxi){maxi = this.getNota1();}
            if (this.getNota2()>maxi){maxi = this.getNota2();}  
            if (this.getNota3()>maxi){maxi = this.getNota3();} 
       return this.max = maxi;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public int getFecha_Nacimiento(){
        return this.fecha_Nacimiento;
    }
    public int getNIA(){
        return this.NIA;
    }
    public double getNota1(){
        return this.nota1;
    }
    public double getNota2(){
        return this.nota2;
    }
    public double getNota3(){
        return this.nota3;
    }
    public String getGrupo(){
        return this.grupo;
    }
    public String getInfo(){return this.nombre+"-"+this.apellidos+"-"+this.fecha_Nacimiento+"-"+this.NIA+"-"+this.grupo+"-"+this.nota1+"-"+this.nota2+" "+this.nota3;}
   
    public String getCadNota(){return this.getNota1()+" "+this.getNota2()+" "+this.getNota3()+" "+this.getNombre()+" "+this.getApellidos();}
}
    