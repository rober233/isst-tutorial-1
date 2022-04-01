package es.upm.dit.isst.tfgapi.model;
import javax.persistence.*;

 @Entity public class TFG {
    @Id public String email; 
    public String pass;
    public String nombre;
    public  String titulo;
    public int status;
    @Lob  public Byte[] memoria; 
    public double nota;
    public String tutor;
    
    
    public TFG() {
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPass() {
        return pass;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }


    public Byte[] getMemoria() {
        return memoria;
    }


    public void setMemoria(Byte[] memoria) {
        this.memoria = memoria;
    }


    public double getNota() {
        return nota;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }


    public String getTutor() {
        return tutor;
    }


    public void setTutor(String tutor) {
        this.tutor = tutor;
    }



    


    
}
