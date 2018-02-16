package rotulador.upa;

import Food.IngredientedeFood;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RotuladorUPA {

    public static void main(String[] args) {

        Menu m = new Menu();
        m.mostrarMenuDeInicio();

        Scanner s = new Scanner(System.in);

        int op = 0;

        while (true) {
            try {
                System.out.print("Opcion: ");
                op = Integer.parseInt(s.nextLine());
                if (op == 4) {
                    System.out.println("Gracias por usar el software");
                    break;
                } else if (op == 1) {
                    System.out.println("Crea rotulo de ingrediente de food");

                    int cant_ing = 0;

                    List<IngredientedeFood> ingredientesF = new ArrayList();

//                    System.out.print("Ingrese fecha de elaboracion: ");
//                    String fE = s.nextLine();
                    int hEN;
                    while (true) {

                        try {
                            System.out.print("Ingrese hora de elaboracion: ");
                            hEN = Integer.parseInt(s.nextLine());

                            if (hEN <= 2359 && hEN >= 0000) {
                                break;
                            } else {
                                System.out.println("El numero debe ser igual or mayor que 0000 y menor a 2400");
                            }

                        } catch (Exception e) {
                            System.out.println("Eso no es valido(Ingrese numero entero de 4 digitos, ej: la una de la madrugada"
                                    + "es 0100.)");
                        }
                    }

                    System.out.print("Ingrese responsable de elaboracion: ");
                    String res = s.nextLine();
                    System.out.println("");

                    DateTimeFormatter hoy = DateTimeFormatter.ofPattern("dd/MM/yyyy ");//HH:mm:ss Esto adentro del parentesis agrega la hora
                    LocalDateTime ahora = LocalDateTime.now();
//                    System.out.println(hoy.format(ahora));

                    String fE = hoy.format(ahora);

                    while (true) {
                        IngredientedeFood ing = new IngredientedeFood();
                        ing.setFechaDeElaboracion(fE);
                        String hEpf = Integer.toString(hEN);

                        StringBuilder hEF = new StringBuilder(hEpf);
                        if (hEN < 1000) {
                            hEF.insert(1, ":");
                            if (Integer.parseInt(hEpf.substring(1)) == 55) {
                                hEN += 40;
                            }
                        } else if (hEN >= 1000) {
                            hEF.insert(2, ":");
                            if (Integer.parseInt(hEpf.substring(2)) == 55) {
                                hEN += 40;
                            }
                        }

                        ing.setHoraDeElaboracion(hEF.toString());

                        Calendar calendar = Calendar.getInstance();//Crea nuevo calendario?
//                        System.out.println(calendar.getTime()); print today's date
                        calendar.add(Calendar.DATE, 2);//agrega 2 dia a esa fecha del calendario
                        Date ddd = calendar.getTime();//guarda datos en variable
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");//se usa para darle formato String a la fecha
                        String fVM = df.format(ddd);//pasa la fecha a String
                        ing.setFechaDeVencimiento(fVM);//le da la fecha nueva como String para el metodo que la setea

                        ing.setResponsable(res);
                        ingredientesF.add(ing);

                        hEN += 5;

                        cant_ing++;
                        if (cant_ing == 21) {
                            break;
                        }

                    }

                    ingredientesF.get(0).setNombre("Tomate");
                    ingredientesF.get(1).setNombre("Salsa");
                    ingredientesF.get(2).setNombre("Queso");
                    ingredientesF.get(3).setNombre("Queso");
                    ingredientesF.get(4).setNombre("Mechada");
                    ingredientesF.get(5).setNombre("Palta");
                    ingredientesF.get(6).setNombre("Pollo");
                    ingredientesF.get(7).setNombre("Lomito");
                    ingredientesF.get(8).setNombre("Jamon en cuadros");
                    ingredientesF.get(9).setNombre("Jamon en tiras");
                    ingredientesF.get(10).setNombre("Jamon de pavo");
                    ingredientesF.get(11).setNombre("Choricillo");
                    ingredientesF.get(12).setNombre("Pepperoni");
                    ingredientesF.get(13).setNombre("Pimenton");
                    ingredientesF.get(14).setNombre("Champignon");
                    ingredientesF.get(15).setNombre("Quesillo");
                    ingredientesF.get(16).setNombre("Cheddar");
                    ingredientesF.get(17).setNombre("Mix del Chef");
                    ingredientesF.get(18).setNombre("Mix Capriccosa");
                    ingredientesF.get(19).setNombre("Aceituna");
                    ingredientesF.get(20).setNombre("Lechuga");

                    for (IngredientedeFood ingredientedeFood : ingredientesF) {
                        System.out.println("\n" + ingredientedeFood);
                    }

                    System.out.println("");

                } else if (op == 2) {
                    System.out.println("Crea rotulo de cafe (No disponible)");
                } else if (op == 3) {
                    System.out.println("Crea rotulo de ave palta y/o ave pimenton (No disponible)");
                } else if (op < 1 || op > 4) {
                    System.out.println("Debe elegir uno de los numeros del menu");
                }

            } catch (Exception e) {
                System.out.println("Eso no es valido");
            }

        }

    }

}
