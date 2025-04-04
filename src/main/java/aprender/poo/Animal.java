package aprender.poo;
import java.util.Scanner;

public class Animal {
     private String nome;
     private String classeAnimal;
     private String familia;
     private Integer idade;
     private boolean estado;
     private Integer caloria;
     private Integer forca;

     public String getNome() {
         return nome;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }
     public String getClasse() {
         return classeAnimal;
     }
     public void setClasse(String classe) {
         this.classeAnimal = classe;
     }
     public String getFamilia() {
         return familia;
     }
     public void setFamilia(String familia) {
         this.familia = familia;
     }
     public Integer getIdade() {
         return idade;
     }
     public void setIdade(Integer idade) {
         this.idade = idade;
     }
     public boolean isEstado() {
         return estado;
     }
     public void setEstado(boolean estado) {
         this.estado = estado;
     }
     public Integer getCaloria() {
         return caloria;
     }
     public void setCaloria(Integer caloria) {
         this.caloria = caloria;
     }
     public Integer getForca() {
         return forca;
     }
     public void setForca(Integer forca) {
         this.forca = forca;
     }

     Scanner entrada = new Scanner(System.in);

     public void nascer() {
        System.out.println("Qual o nome do animal?");
        nome = entrada.next();
        System.out.println("Qual a idade do animal?");
        idade = entrada.nextInt();
        System.out.println("Qual a classe do animal?");
        classeAnimal = entrada.next();
        System.out.println("Qual o nome da familia?");
        familia = entrada.next();

        forca = 10;
        caloria = 10;
        estado = true;
     }

     public void morrer() {
        forca = 0;
        estado = false; 
     }

     public void comer() {
        if (caloria <= 90 || estado == true){ 
            caloria = caloria + 10;
            forca = forca - 2;
        }
     }

     public void correr() {
        if ( estado != false || caloria == 0){
            forca = forca - 5;
            caloria = caloria - 5; 
        }
     }

     public void dormir() {
        if (estado == true) {
            forca = forca + 10;
            caloria = caloria - 2;
        }
     }
     
     public String mostrar() {
        return "Nome: " + nome + ", Classe: " + classeAnimal + ", Família: " + familia +
                           ", Idade: " + idade + ", Estado: " + estado + ", Caloria: " + caloria +
                           ", Força: " + forca;
    }

     public Animal() {
     }
}
