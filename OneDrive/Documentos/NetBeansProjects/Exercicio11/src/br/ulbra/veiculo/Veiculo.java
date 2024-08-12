
package br.ulbra.veiculo;


public class Veiculo {
    private String marca;
    private String modelo; 
    private int ano;
    
    public Veiculo(){
        this.marca= "Fiat";
        this.modelo="Palio";
        this.ano=2005;
    }
    
    public void setMarca (String marca){
        this.marca=marca;
    }
    
    public String getMarca (){
        return marca;
    }
    public void setModelo (String modelo){
        this.modelo=modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setAno (int ano){
        this.ano=ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String toString (){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nAno: "+ano;
    }
}
