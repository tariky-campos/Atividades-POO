public class Etiqueta{
    private String marca;
    private String tamanho;

    public Etiqueta(String marca, String tamanho){
        this.marca = marca;
        this.tamanho = tamanho;
    }

    // Getters

    public String getMarca(){
        return marca;
    }
    public String getTamaho(){
        return tamanho;
    }

    // Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Marca: "+(marca)+ ", Tamanho: "+(tamanho);
    }
}