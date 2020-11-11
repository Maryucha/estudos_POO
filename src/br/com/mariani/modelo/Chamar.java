package br.com.mariani.modelo;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Chamar {

    Scanner entrada = new Scanner(System.in);
    Cachorro dog = new Cachorro(Especie.CACHORRO);
    Cavalo horse = new Cavalo(Especie.EQUINO);
    Gato cat = new Gato(Especie.FELINO);
    Peixe fish = new Peixe(Especie.AQUATICOS);

    List<Animal> listaAnimais = new ArrayList<>();

    public void cadAnimal() {
        Integer menu = 0;

        do {
            try {
                System.out.println("==========MENU CADASTRAR========"
                        + "\n1 Cachorro: "
                        + "\n2 Gato: "
                        + "\n3 Cavalo: "
                        + "\n4 Peixe: "
                        + "\n5 Voltar: "
                        + "\n===================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        dog.cadCachorro();
                        listaAnimais.add(dog);
                        break;
                    case 2:
                        cat.cadGato();
                        listaAnimais.add(cat);
                        break;
                    case 3:
                        horse.cadCavalo();
                        listaAnimais.add(horse);
                        break;
                    case 4: 
                        fish.cadPeixe();
                        listaAnimais.add(fish);
                       
                        break;
                    case 5:
                        System.out.println("Até mais!");
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!");
                        break;
                }
            }
        } while (menu != 5);
    }

    public void imprimeLista() {
        String raca = "";
        String tipoHabitat = "";
        System.out.println("======================ANIMAIS CADASTRADOS============");
        for (int i = 0; i < listaAnimais.size(); i++) {
            System.out.println("======================================");
            System.out.println("ESPÉCIE " + listaAnimais.get(i).getEspecie() + " ");
            System.out.println("NOME " + listaAnimais.get(i).getNome() + " ");
            
            if (listaAnimais.get(i).getEspecie()==Especie.CACHORRO) {
                raca = dog.getRaca();
                System.out.println("RAÇA "+raca);
            } else if (listaAnimais.get(i).getEspecie()==Especie.FELINO) {
                raca = cat.getRaca();
                System.out.println("RAÇA "+raca);
            } else if (listaAnimais.get(i).getEspecie()==Especie.AQUATICOS) {
                tipoHabitat = fish.getTipoHabitat();
                System.out.println("Habitat "+tipoHabitat);
            } else if (listaAnimais.get(i).getEspecie()==Especie.EQUINO) {
                raca = horse.getRaca();
                System.out.println("RAÇA "+raca);
            }
            System.out.println("PESO " + listaAnimais.get(i).getPeso()+ " ");
            System.out.println("======================================");
        }
        System.out.println("");
    }
}
