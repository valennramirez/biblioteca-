package modelo;

public class Biblioteca {
    private Libro libros [];
    private int validosLibros;
    private Socio socios[];
    private int validosSocios;


    public Biblioteca(){
        libros= new Libro[20];
        validosLibros= 0;
        socios= new Socio[20];
        validosSocios= 0;
    }
    public boolean agregarLibro(Libro libro){
        if (validosLibros < 20){
            libros[validosLibros]= libro;
            validosLibros++;
        }
        return true;
    }
    public  boolean agregarSocio(Socio socio){
        if(validosSocios < 20){
            socios[validosSocios]= socio;
            validosSocios++;
        }
        return true;
    }

    private int buscarEnArregloLibro (String aBuscar){
        int contador=0;
        boolean flag=false;

        while (contador<validosLibros && flag==false){

            if (libros[contador].getTitulo().equals(aBuscar)){
                flag=true;
            }
            contador++;
        }

        return contador;
    }

    private int buscarEnArregloSocio (String aBuscar){
        int contador=0;
        boolean flag=false;

        while (contador<validosSocios && flag==false){

            if (socios[contador].getdni().equals(aBuscar)){
                flag=true;
            }
            contador++;
        }

        return contador;
    }

    public void prestar (String titulo, String dni){

        int posLibro= 0;
        int posSocio= 0;

        posSocio=buscarEnArregloSocio(dni);
        posLibro=buscarEnArregloLibro(titulo);

        libros[posLibro].disminuirCantidad();
        socios[posSocio].enPosesion=titulo;
    }

    public void devolver (String dni){
        int posLibro= 0;
        int posSocio= 0;

        posSocio= buscarEnArregloSocio(dni);
        posLibro= buscarEnArregloLibro(socios[posSocio].enPosesion);

        libros[posLibro].aumentarCantidad();
        socios[posSocio].setenPosesion(" ");
        socios[posSocio].incrementarLibrosLeidos();
    }

}
