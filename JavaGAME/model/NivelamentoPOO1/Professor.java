package model.NivelamentoPOO1;

public class Professor extends Pessoa{
    
    private String titulo;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getTitulo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
