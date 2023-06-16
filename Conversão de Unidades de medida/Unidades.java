import java.util.Scanner;

public class Unidades {
    
    Scanner scanner = new Scanner(System.in);

    void unidades_de_comprimento(){
        System.out.println("Você quer converter de que para que? \n"
        		+ "(1) de Km para metro\n"
        		+ "(2) de Km para cm\n"
        		+ "(3) de Km para mm \n"
        		+ "(4) de m para Km \n"
        		+ "(5) de m para cm \n"
        		+ "(6) de m para mm \n"
        		+ "(7) de mm para Km \n"
        		+ "(8) de mm para m \n"
        		+ "(9) de mm para cm");
        
        int conversao = scanner.nextInt();
        
        switch (conversao){

        case 1:
        	System.out.println("Quantos km para m?");	
        	int km1 = scanner.nextInt();
        	double km_m = (km1 * Math.pow(10, 3));
        	System.out.println("O seu resultado em m é de: "+km_m);
        break;
        
        case 2:
        	System.out.println("Quantos km para cm?");	
        	int km2 = scanner.nextInt();
        	double km_cm = (km2 * Math.pow(10, 5));
        	System.out.println("O seu resultado em cm é de: "+km_cm);
        break;
        
        case 3:
        	System.out.println("Quantos km para mm?");
        	int km3 = scanner.nextInt();
        	double km_mm = (km3 * Math.pow(10, 6));
        	System.out.println("O seu resultado em mm é de: "+km_mm);
        break;
        
        case 4:
        	System.out.println("Quantos m para km?");
        	int m1= scanner.nextInt();
        	double m_km = (m1 / Math.pow(10, 3));
        	System.out.println("O seu resultado em km é de: "+m_km);
        break;
        
        case 5:
        	System.out.println("Quantos m para cm?");
        	int m2= scanner.nextInt();
        	double m_cm = (m2 * Math.pow(10, 2));
        	System.out.println("O seu resultado em cm é de: "+m_cm);
        break;
        
        case 6:
        	System.out.println("Quantos m para mm?");
        	int m3= scanner.nextInt();
        	double m_mm = (m3 * 10);
        	System.out.println("O seu resultado em mm é de: "+m_mm);
        break;
        
        case 7:
        	System.out.println("Quantos mm para km?");
        	int mm1 = scanner.nextInt();
        	double mm_km = (mm1 / Math.pow(10, 6));
        	System.out.println("O seu resultado em km é de: "+mm_km);
        break;
        
        case 8:
        	System.out.println("Quantos mm para m?");
        	int mm2 = scanner.nextInt();
        	double mm_m = (mm2 / Math.pow(10, 3));
        	System.out.println("O seu resultado em m é de: "+mm_m);
        break;
        
        case 9:
        	System.out.println("Quantos mm para cm");
        	int mm3 = scanner.nextInt();
        	double mm_cm = (mm3 / 10);
        	System.out.println("O seu resultado é em cm de: "+mm_cm);
        break;
        
        default:
        System.out.println("Não existente");
        break;
        
        }
    }
    
    void unidades_de_temperatura() {
    	System.out.println("Você quer converter:\n"
    			+ "(1) C° para F°\n" 
                + "(2) C° para K°\n" 
                + "(3) F° para C°\n" 
                + "(4) F° para K°\n" 
                + "(5) K° para C°\n" 
                + "(6) K° para F°"); 
        int temperatura = scanner.nextInt(); 

        switch (temperatura){ 
        	
        	case 1: 

                System.out.println("Qual é a temperatura em C° que você quer converter? "); 
                double c1 = scanner.nextInt(); 
                double c_f = ((c1 * 1.8) + 32); 
                System.out.println("A sua temperatura em F° é de: "+c_f); 
                break;
          
            case 2: 
                System.out.println("Qual é a temperatura em C° que você quer converter? "); 
                double c2 = scanner.nextInt(); 
                double c_k = (c2 + 273); 
                System.out.println("A sua temperatura em K° é de: "+c_k); 
                break;  

            case 3: 
                System.out.println("Qual é a temperatura em F° que você quer converter? "); 
                double f1 = scanner.nextInt(); 
                double f_c = ((f1 - 32) / 1.8); 
                System.out.println("A sua temperatura em "+f_c); 
                break; 

            case 4: 
                System.out.println("Qual é a temperatura em F° que você quer converter? "); 
                double f2 = scanner.nextInt(); 
                double f_k = (((f2 - 32) * 5/9) + 273); 
                System.out.println("A sua temperatura em K° é de: "+f_k); 
                break; 

            case 5: 
                System.out.println("Qual é a temperatura em K° que você quer converter? "); 
                double k1 = scanner.nextInt(); 
                double k_c = (k1 - 273); 
                System.out.println("A sua temperatura em C° é de: "+k_c); 
                break; 

            case 6: 
                System.out.println("Qual é a temperatura em K° que você quer converter? "); 
                double k2 = scanner.nextInt(); 
                double k_f = (((k2 - 273) * 1.8) + 32); 
                System.out.println("A sua temperatura em F° é de: "+k_f); 
                break; 

            default: 
                System.out.println("Não existente"); 
                break; 
                
        } 
        
    }
    void unidade_de_massa() {
    	
    	System.out.println("Você quer converter de que para que? \n"
        		+ "(1) de kg para g\n"
        		+ "(2) de kg para mg \n"
        		+ "(3) de g para kg \n"
        		+ "(4) de g para mg \n"
        		+ "(5) de mg para kg \n"
        		+ "(6) de mg para g \n");
        
        int conversao = scanner.nextInt();
        
        switch (conversao){

        case 1:
        	System.out.println("Quantos kg para g?");	
        	int kg1 = scanner.nextInt();
        	double kg_g = (kg1 * Math.pow(10, 3));
        	System.out.println("O seu resultado em g é de: "+kg_g);
        break;
        
        case 2:
        	System.out.println("Quantos kg para mg?");
        	int kg2 = scanner.nextInt();
        	double kg_mg = (kg2 * Math.pow(10, 6));
        	System.out.println("O seu resultado em mg é de: "+kg_mg);
        break;
        
        case 3:
        	System.out.println("Quantos g para kg?");
        	int g1= scanner.nextInt();
        	double g_kg = (g1 / Math.pow(10, 3));
        	System.out.println("O seu resultado em kg é de: "+g_kg);
        break;
        
        case 4:
        	System.out.println("Quantos g para mg?");
        	int g2= scanner.nextInt();
        	double g_mg = (g2 * 10);
        	System.out.println("O seu resultado em mg é de: "+g_mg);
        break;
        
        case 5:
        	System.out.println("Quantos mg para kg?");
        	int mg1 = scanner.nextInt();
        	double mg_kg = (mg1 / Math.pow(10, 6));
        	System.out.println("O seu resultado em kg é de: "+mg_kg);
        break;
        
        case 6:
        	System.out.println("Quantos mg para g?");
        	int mg2 = scanner.nextInt();
        	double mg_g = (mg2 / Math.pow(10, 3));
        	System.out.println("O seu resultado em g é de: "+mg_g);
        break;
        
        default:
        System.out.println("Não existente");
        break;
        
        }
    	
    }
    void unidade_de_tempo() {
    	
    	System.out.println("Você quer converter: \n"
    			+ "(1) Hora para Minuto\n"
    			+ "(2) Hora para Segundo\n"
    			+ "(3) Minuto para Hora\n"
    			+ "(4) Minuto para segundo\n"
    			+ "(5) Segundo para Hora\n"
    			+ "(6) Segundo para minuto");
    	int tempo = scanner.nextInt();
    	
    	switch (tempo) {
    	
    	case 1:
    		System.out.println("Quantas horas você quer converter? ");
    		double hora1 = scanner.nextInt();
    		double ho_min = (hora1 * 60);
    		System.out.println("O seu tempo em minutos é de: "+ho_min);
    	break;
    	
    	case 2:
    		System.out.println("Quantas horas você quer converter? ");
    		double hora2 = scanner.nextInt();
    		double ho_sec = (hora2 * (Math.pow(60, 2)));
    		System.out.println("O seu tempo em segundos é de: "+ho_sec);
    	break;
    	
    	case 3:
    		System.out.println("Quantos minutos você quer converter? ");
    		double minuto1 = scanner.nextInt();
    		double min_ho = (minuto1 / 60);
    		System.out.println("O seu tempo em horas é de: "+min_ho);
    	break;
    	
    	case 4:
    		System.out.println("Quantos minutos você quer converter? ");
    		double minuto2 = scanner.nextInt();
    		double min_sec = (minuto2 * 60);
    		System.out.println("O seu tempo em segundos é de: "+min_sec);
    	break;
    	
    	case 5:
    		System.out.println("Quantos segundos você quer converter? ");
    		double segundo1 = scanner.nextInt();
    		double sec_ho = (segundo1 / (Math.pow(60, 2)));
    		System.out.println("O seu tempo em horas é de: "+sec_ho);
    	break;
    	
    	case 6:
    		System.out.println("Quantos segundos você quer converter? ");
    		double segundo2 = scanner.nextInt();
    		double sec_min = (segundo2 / 60);
    		System.out.println("O seu tempo em minutos é de: "+sec_min);
    	break;
    	
    	default:
    		System.out.println("Não existente");
    	break;
    	
    	}
    	
    }
    void unidade_de_litro() {
    	
    	System.out.println("Você quer converter de que para que? \n"
        		+ "(1) de kl para l\n"
        		+ "(2) de kl para ml \n"
        		+ "(3) de l para kl \n"
        		+ "(4) de l para ml \n"
        		+ "(5) de ml para kl \n"
        		+ "(6) de ml para l \n");
        
        int conversao = scanner.nextInt();
        
        switch (conversao){

        case 1:
        	System.out.println("Quantos kl para l?");	
        	int kl1 = scanner.nextInt();
        	double kl_l = (kl1 * Math.pow(10, 3));
        	System.out.println("O seu resultado em l é de: "+kl_l);
        break;
        
        case 2:
        	System.out.println("Quantos kg para mg?");
        	int kl2 = scanner.nextInt();
        	double kl_ml = (kl2 * Math.pow(10, 6));
        	System.out.println("O seu resultado em ml é de: "+kl_ml);
        break;
        
        case 3:
        	System.out.println("Quantos l para kl?");
        	int l1= scanner.nextInt();
        	double l_kl = (l1 / Math.pow(10, 3));
        	System.out.println("O seu resultado em kl é de: "+l_kl);
        break;
        
        case 4:
        	System.out.println("Quantos l para ml?");
        	int l2= scanner.nextInt();
        	double l_ml = (l2 * 10);
        	System.out.println("O seu resultado em ml é de: "+l_ml);
        break;
        
        case 5:
        	System.out.println("Quantos ml para kl?");
        	int ml1 = scanner.nextInt();
        	double ml_kl = (ml1 / Math.pow(10, 6));
        	System.out.println("O seu resultado em kl é de: "+ml_kl);
        break;
        
        case 6:
        	System.out.println("Quantos mg para g?");
        	int ml2 = scanner.nextInt();
        	double ml_l = (ml2 / Math.pow(10, 3));
        	System.out.println("O seu resultado em l é de: "+ml_l);
        break;
        
        default:
        System.out.println("Não existente");
        break;
        
        }
    	
    }
    void unidade_de_velocidade() {
    	  System.out.println("Você quer converter:\n"
    	  		+ "(1) Km/h para m/s\n"
    	  		+ "(2) m/s para Km/h"); 

          int velocidade = scanner.nextInt(); 

          switch (velocidade){ 

              case 1: 
                  System.out.println("Quantos Km/h você quer converter?"); 
                  double km = scanner.nextInt(); 
                  double km_ms = (km / 3.6); 
                  System.out.println("A sua velocidade em m/s é de: "+km_ms);
                  break; 

              case 2: 
                  System.out.println("Quantos m/s você quer converter?"); 
                  double ms = scanner.nextInt(); 
                  double ms_km = (ms * 3.6); 
                  System.out.println("A sua velocidade em Km/h é de: "+ms_km);
                  break; 
                  
              default: 
                  System.out.println("Não existente"); 
                  break;
          } 
    }
}
