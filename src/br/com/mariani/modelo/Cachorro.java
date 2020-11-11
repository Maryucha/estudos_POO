package br.com.mariani.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Cachorro extends Animal {

    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat dF = new DecimalFormat("0.##");
    private String formatado = "";
    private List<Animal> listaAnimais = new ArrayList<>();

    private String raca;

    public Cachorro(String raca, EnumEspecie especie, String nome, double peso) {
        super(especie, nome, peso);
        this.raca = raca;
    }

    public Cachorro(EnumEspecie especie) {
        super(especie);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void latir(){
        System.out.println("au au au au au!");
    }

    public void cadCachorro() {
        System.out.println("=============CADASTRO CACHORRO=========");
        System.out.print("Digite o nome do seu dog: ");
        super.setNome(entrada.nextLine());
        System.out.print("Digite a RAÇA: ");
        this.raca=entrada.nextLine();
        System.out.print("Digite o peso do seu dog: ");
        super.setPeso(entrada.nextDouble());
        entrada.nextLine();
        listaAnimais.add(this);
        System.out.println("--------------------------------------");
    }

}
