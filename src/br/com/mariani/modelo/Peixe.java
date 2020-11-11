
package br.com.mariani.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Peixe extends Animal {
    private Scanner entrada=new Scanner(System.in);
    private String tipoHabitat;
    List<Animal> listaAnimais = new ArrayList<>();

    public Peixe(String tipoHabitat, EnumEspecie especie, String nome, double peso) {
        super(especie, nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public Peixe(EnumEspecie especie) {
        super(especie);
    }

      
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public void cadPeixe() {
        System.out.println("=============CADASTRO PEIXE=========");
        System.out.print("Digite o habitat: ");
        this.tipoHabitat=entrada.nextLine();
        System.out.print("Digite o nome do seu peixe: ");
        super.setNome(entrada.nextLine());
        System.out.print("Digite o peso do seu Peixe: ");
        super.setPeso(entrada.nextDouble());
        entrada.nextLine();
        listaAnimais.add(this);
        System.out.println("--------------------------------------");
    }
    
}
