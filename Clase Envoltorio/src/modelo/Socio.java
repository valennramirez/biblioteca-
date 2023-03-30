package modelo;

public class Socio {

    String dni;
    String nombreApellido;
    int librosLeidos;
    String enPosesion;

    public Socio (){
        this.dni= "";
        this.nombreApellido= "";
        this.librosLeidos= 0;
        this.enPosesion= "";

    }

    public Socio (String dni, String nombreApelido){
        this.dni= dni;
        this.nombreApellido= nombreApellido;
    }

    public String getdni(){
        return dni;
    }

    public String getnombreApellido(){
        return nombreApellido;
    }

    public int getLibrosLeidos (){
        return librosLeidos;
    }

    public void setlibrosLeidos (int librosLeidos){
        this.librosLeidos= librosLeidos;
    }
    public void incrementarLibrosLeidos(){
        librosLeidos++;
    }
    public String getenPosesion (){
        return getenPosesion();
    }

    public void setenPosesion (String enPosesion){
        this.enPosesion= enPosesion;
    }

}
