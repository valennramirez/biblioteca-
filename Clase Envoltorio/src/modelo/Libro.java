package modelo;

public class Libro {
    private int cantidad;
    private String titulo;
    private  String autor;

    public Libro(){
        this.cantidad=0;
        this.titulo= " ";
        this.autor= " ";
    }

    public Libro (String autor, String titulo, int cantidad){
        this.autor= autor;
        this.titulo= titulo;
        this.cantidad= cantidad;
    }

    public Libro (String autor, String titulo){
        this.autor= autor;
        this.titulo= titulo;
        this.cantidad= 0;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return  autor;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad= cantidad;
    }

    public void disminuirCantidad(){
        cantidad= cantidad -1;
    }
    public void aumentarCantidad(){
        cantidad= cantidad +1;
    }

}
