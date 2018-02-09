package rotulador.upa;

import Food.IngredientedeFood;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RotuladorUPA {

    public static void main(String[] args) {

        Menu m = new Menu();
        m.mostrarMenuDeInicio();

        Scanner s = new Scanner(System.in);

        int op = 0;

        while (true) {
            try {
                System.out.print("Opcion: ");
                op=Integer.parseInt(s.nextLine());
                if(op==4){
                    System.out.println("Gracias por usar el software");
                    break;
                }else if (op==1){
                    System.out.println("Crea rotulo de ingrediente de food");
                    
                    List<IngredientedeFood> ingredientesF =new ArrayList();
                    
                    String nom="Tomate";
                    String fE=s.nextLine();
                    String hE=s.nextLine();
                    String fV=s.nextLine();
                    String res=s.nextLine();
                    
                    IngredientedeFood ing=new IngredientedeFood(nom, hE, res, fV, res);
                    ingredientesF.add(ing);
                    
                    for (IngredientedeFood ingredientedeFood : ingredientesF) {
                        System.out.println(ing);
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
            }else if(op==2){
                    System.out.println("Crea rotulo de cafe");
            }else if(op==3){
                    System.out.println("Crea rotulo de ave palta y/o ave pimenton");
            }else if(op<1 || op>4){
                    System.out.println("Debe elegir uno de los numeros del menu");
            }
                
                

            } catch (Exception e) {
                System.out.println("Eso no es valido");
            }

        }

    }

}
