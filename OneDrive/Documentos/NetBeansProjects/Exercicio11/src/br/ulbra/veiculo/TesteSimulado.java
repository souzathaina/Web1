
package br.ulbra.veiculo;


public class TesteSimulado {
    public static void main(String[] args) {
        Veiculo obj = new Veiculo();
        
        System.out.println(obj.toString());
        obj.setMarca("Chevrolet");
        obj.setModelo("S10");
        obj.setAno(2022);
        System.out.println(obj.toString());
        obj.setMarca("Volkswagen");
        obj.setModelo("Nivus");
        obj.setAno(2020);
        System.out.println(obj.toString());
    }
}
