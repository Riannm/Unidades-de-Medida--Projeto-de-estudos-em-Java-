import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Unidades unidades = new Unidades();
    boolean converter_novamente = true;
    
    do {
    System.out.println("Quais tipo de grandeza você quer converter?\n"
    		+ "(1) para unidade de comprimento\n"
    		+ "(2) para unidade de temperatura\n"
    		+ "(3) para unidade de massa\n"
    		+ "(4) para unidade de tempo\n"
    		+ "(5) para unidade de litro\n"
    		+ "(6) para unidade de velocidade");

    int quais_unidades = scanner.nextInt();

    switch(quais_unidades){
    
        case 1:
        	unidades.unidades_de_comprimento();
        break;
        case 2:
        	unidades.unidades_de_temperatura();
        break;
        case 3:
        	unidades.unidade_de_massa();
        break;
        case 4:
        	unidades.unidade_de_tempo();
        break;
        case 5:
        	unidades.unidade_de_litro();
        break;
        case 6:
        	unidades.unidade_de_velocidade();
        break;
       default:
        	System.out.println("Não existente");
        break;
    }
 	System.out.println("Você quer converter novamente? ");
 	String sim_nao = scanner.next();
    if (sim_nao.equalsIgnoreCase("N")) {
            converter_novamente = false;
            scanner.close();
            System.out.println("Conversão de Unidades por: Riann Matheus");
        }
        else if (!sim_nao.equalsIgnoreCase("S") && !sim_nao.equalsIgnoreCase("N")) {
        	System.out.println("Invalido");
        	break;
        }
    }while (converter_novamente);
    
    
}
}
