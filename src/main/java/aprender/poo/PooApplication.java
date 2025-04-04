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


		while (indice != 7) {
			System.out.println("Escolha uma função (Digite um número de 1 a 6):");
			indice = entradaUsuario.nextInt(); 
			switch (indice) {
				case 1:
				animal.nascer();
				case 2: 
				animal.morrer();
				case 3: 
				animal.comer();
				case 4: 
				animal.correr();	
				case 5:
				animal.dormir();
				case 6: 
				animal.mostrar();
				case 7: 
					break;
			}
		}
	}
}
