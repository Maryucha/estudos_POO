package br.com.mariani.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Gato extends Animal {

    private Scanner entrada = new Scanner(System.in);
    private String raca;
    List<Animal> listaAnimais = new ArrayList<>();

    public Gato(String raca, EnumEspecie especie, String nome, double peso) {
        super(especie, nome, peso);
        this.raca = raca;
    }

    public Gato(EnumEspecie especie) {
        super(especie);
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void miar(){
        System.out.println("miau, miau, miau...");
    }

    public void cadGato() {
        System.out.println("=============CADASTRO GATO=========");
        System.out.print("Digite a RAÇA: ");
        this.raca = entrada.nextLine();
        System.out.print("Digite o nome do seu Gato: ");
        super.setNome(entrada.nextLine());
        System.out.print("Digite o peso do seu Gato: ");
        super.setPeso(entrada.nextDouble());
        entrada.nextLine();
        listaAnimais.add(this);
        System.out.println("--------------------------------------");
    }

}
