package br.com.mariani.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Cavalo extends Animal {

    private String raca;
    Scanner entrada = new Scanner(System.in);
    private List<Animal> listaAnimais = new ArrayList<>();

    public Cavalo(String raca, EnumEspecie especie, String nome, double peso) {
        super(especie, nome, peso);
        this.raca = raca;
    }

    public Cavalo(EnumEspecie especie) {
        super(especie);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void cavalgar(){
        System.out.println("pocotó, pocotó, pocotó,...");
    }

    public void cadCavalo() {
        System.out.println("=============CADASTRO CAVALO=========");
        System.out.print("Digite a RAÇA: ");
        this.raca = entrada.nextLine();
        System.out.print("Digite o nome do seu Cavalo: ");
        super.setNome(entrada.nextLine());
        System.out.print("Digite o peso do seu Cavalo: ");
        super.setPeso(entrada.nextDouble());
        entrada.nextLine();
        listaAnimais.add(this);
        System.out.println("--------------------------------------");
    }

}
