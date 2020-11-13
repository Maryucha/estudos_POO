package br.com.mariani.main;

import br.com.mariani.modelo.Animal;
import br.com.mariani.controle.ControleAnimais;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Animal> listaAnimais = new ArrayList<>();
        ControleAnimais telefone = new ControleAnimais();
        Integer menu = 0;
        
        do {
            try {
                System.out.println("===========MENU==========="
                        + "\n1 Cadastrar Animal: "
                        + "\n2 Printar Animais: "
                        + "\n3 Sair: "
                        + "\n===================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        telefone.cadAnimal();  
                        break;
                    case 2:
                        telefone.imprimeLista();
                        break;
                    case 3:
                        System.out.println("Até mais!");
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!");
                        break;
                }
            }
        } while (menu != 3);
    }

}
