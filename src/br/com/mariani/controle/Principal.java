package br.com.mariani.controle;

import br.com.mariani.modelo.Animal;
import br.com.mariani.modelo.Chamar;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.HeadlessException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Principal {

    public static void main(String[] args) {
        Principal tocar = new Principal();

        Scanner entrada = new Scanner(System.in);
        List<Animal> listaAnimais = new ArrayList<>();
        Chamar telefone = new Chamar();
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
