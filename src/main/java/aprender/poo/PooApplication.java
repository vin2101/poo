package aprender.poo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		int indice = 0; 
		Scanner entradaUsuario = new Scanner(System.in);
		Animal animal = new Animal();


		while (indice != 6) {
			
            System.out.println("1-Nascer");
            System.out.println("2-Morrer");
            System.out.println("3-Comer");
            System.out.println("4-Correr");
            System.out.println("5-Dormir");
			System.out.println("6-Sair");
            System.out.println("Selecione a opção desejada:");

			indice = entradaUsuario.nextInt(); 
			switch (indice) {
				case 1:
				animal.nascer();
				System.out.println(animal.mostrar());
				break;
				case 2: 
				animal.morrer();
				System.out.println(animal.mostrar());
				break;
				case 3: 
				animal.comer();
				System.out.println(animal.mostrar());
				break;
				case 4: 
				animal.correr();	
				System.out.println(animal.mostrar());
				break;
				case 5:
				animal.dormir();
				System.out.println(animal.mostrar());
				break;
				case 6: 				
				break;

			}
		}
	}
	}
