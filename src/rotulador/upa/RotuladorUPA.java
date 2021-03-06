package rotulador.upa;

import Food.IngredienteOProducto;
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

        System.out.println("Bienvenido al menu de creacion de rotulos Upa");
        Menu m = new Menu();

        Scanner s = new Scanner(System.in);

        int op = 0;

        while (true) {
            try {
                m.mostrarMenuDeInicio();
                System.out.print("Opcion: ");
                op = Integer.parseInt(s.nextLine());
                if (op == 4) {
                    System.out.println("Gracias por usar el software");
                    break;
                } else if (op == 1) {
                    System.out.println("Crea rotulo de ingrediente de food (se usara hora actual del PC)");

                    int cant_ing = 0;

                    List<IngredienteOProducto> ingredientesF = new ArrayList();

//                    System.out.print("Ingrese fecha de elaboracion: ");
//                    String fE = s.nextLine();
                    int ele;


//                    while (true) {
//                        try {
//
//                            System.out.println("1. Si");
//                            System.out.println("2. No");
//
//                            ele = Integer.parseInt(s.nextLine());
//                            if (ele == 1 || ele == 2) {
//                                break;
//                            } else if (ele != 1 && ele != 2) {
//                                System.out.println("Debe elegir 1 o 2");
//                            }
//
//                        } catch (Exception e) {
//                            System.out.println("Eso no es valido.");
//                        }
//                    }
//
//                    int hEN = 0;
//
//                    while (true) {
//
//                        try {
//                            if (ele == 2) {
//                                System.out.print("Ingrese hora de elaboracion: ");
//                                hEN = Integer.parseInt(s.nextLine());
//
//                                if (hEN <= 2359 && hEN >= 0000) {
//                                    System.out.println("Generacion manual de hora, seleccionada. Habra una diferencia de 5 minutos entre rotulo.");
//                                    break;
//                                } else {
//                                    System.out.println("El numero debe ser igual or mayor que 0000 y menor a 2400");
//                                }
//
//                            } else if (ele == 1) {
//                                System.out.println("Se generaran rotulos con una diferencia de 5 minutos entre si a partir de la hora de la creacion.");
//                                break;
//                            }
//
//                        } catch (Exception e) {
//                            System.out.println("Eso no es valido(Ingrese numero entero de 4 digitos, ej: la una de la madrugada"
//                                    + "es 0100.)");
//                        }
//                    }

                    System.out.print("Ingrese responsable de elaboracion: ");
                    String res = s.nextLine();
                    System.out.println("");

                    DateTimeFormatter hoy = DateTimeFormatter.ofPattern("dd/MM/yyyy ");//HH:mm:ss Esto adentro del parentesis agrega la hora
                    LocalDateTime ahora = LocalDateTime.now();
//                    System.out.println(hoy.format(ahora));

                    String fE = hoy.format(ahora);

                    int minutosaAgregar = 5;
                    while (true) {
                        IngredienteOProducto ing = new IngredienteOProducto();
                        ing.setFechaDeElaboracion(fE);
//
//                        String hEpf = Integer.toString(hEN);
//
//                        StringBuilder hEF = new StringBuilder(hEpf);
//                        if (hEN < 1000) {
//                            hEF.insert(1, ":");
//                            if (Integer.parseInt(hEpf.substring(1)) == 55) {
//                                hEN += 40;
//                            }
//                        } else if (hEN >= 1000) {
//                            hEF.insert(2, ":");
//                            if (Integer.parseInt(hEpf.substring(2)) == 55) {
//                                hEN += 40;
//                            }
//                        }
//
//                        ing.setHoraDeElaboracion(hEF.toString());

                        Calendar calendar = Calendar.getInstance();//Crea nuevo calendario?
//                        System.out.println(calendar.getTime()); muestra fecha de hoy
                        calendar.add(Calendar.DATE, 2);//agrega 2 dia a esa fecha del calendario
                        Date ddd = calendar.getTime();//guarda datos en variable
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");//se usa para darle formato String a la fecha
                        String fVM = df.format(ddd);//pasa la fecha a String
                        ing.setFechaDeVencimiento(fVM);//le da la fecha nueva como String para el metodo que la setea

                        ing.setResponsable(res);
                        ingredientesF.add(ing);

                        Calendar cale = Calendar.getInstance();
                        DateFormat formatoTiempo = new SimpleDateFormat("HH:mm");

                        cale.add(Calendar.MINUTE, minutosaAgregar);
                        String horaModificada = formatoTiempo.format(cale.getTime());
                        ing.setHoraDeElaboracion(horaModificada);

                        minutosaAgregar += 5;

//                        hEN += 5;

                        cant_ing++;
                        if (cant_ing == 21) {
                            break;
                        }

                    }

                    Calendar cale = Calendar.getInstance();
                    DateFormat formatoTiempo = new SimpleDateFormat("HH:mm");
//
//                    int minutosAAgregar = 5;
//                    if (ele == 1) {
//                        for (int i = 0; i < 21; i++) {
//
//                            cale.add(Calendar.MINUTE, minutosAAgregar);
//                            String horaModificada = formatoTiempo.format(cale.getTime());
//
//                            minutosAAgregar += 5;
//                            ingredientesF.get(i-1).setHoraDeElaboracion(horaModificada);
//                        }
//
//                    }

                    Calendar horaPrimerIngre = Calendar.getInstance();
                    Date horaTomate = horaPrimerIngre.getTime();
                    DateFormat formatoTomate = new SimpleDateFormat("HH:mm");
                    String horaTom = formatoTomate.format(horaTomate);

                    Calendar cUnDia = Calendar.getInstance();
                    cUnDia.add(Calendar.DATE, 1);
                    Date dfvT = cUnDia.getTime();
                    DateFormat dfT = new SimpleDateFormat("dd/MM/yyyy ");
                    String fvmT = dfT.format(dfvT);
                    ingredientesF.get(0).setFechaDeVencimiento(fvmT);

                    ingredientesF.get(0).setNombre("Tomate");
                    ingredientesF.get(0).setHoraDeElaboracion(horaTom);
                    ingredientesF.get(1).setNombre("Salsa");
                    ingredientesF.get(2).setNombre("Queso");
                    ingredientesF.get(3).setNombre("Queso");
                    ingredientesF.get(4).setNombre("Mechada");
                    ingredientesF.get(5).setFechaDeVencimiento(fvmT);
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
                    ingredientesF.get(15).setFechaDeVencimiento(fvmT);
                    ingredientesF.get(15).setNombre("Quesillo");
                    ingredientesF.get(16).setNombre("Cheddar");
                    ingredientesF.get(17).setNombre("Mix del Chef");
                    ingredientesF.get(18).setNombre("Mix Capriccosa");
                    ingredientesF.get(19).setNombre("Aceituna");
                    ingredientesF.get(20).setFechaDeVencimiento(fvmT);
                    ingredientesF.get(20).setNombre("Lechuga");

                    for (IngredienteOProducto ingredientedeFood : ingredientesF) {
                        System.out.println("\n" + ingredientedeFood);
                    }

                    System.out.println("");
                    ingredientesF.clear();

                } else if (op == 2) {
                    System.out.println("Crear rotulos de cafe (Isla)");

                    System.out.print("Ingrese nombre de responsable de Cafe: ");

                    String resCafe = s.nextLine();

                    List<IngredienteOProducto> ingredientesC = new ArrayList();

                    Calendar cDosDiaCafe = Calendar.getInstance();
                    cDosDiaCafe.add(Calendar.DATE, 2);
                    Date dfvT = cDosDiaCafe.getTime();
                    DateFormat dfT = new SimpleDateFormat("dd/MM/yyyy ");
                    String fvdosDiaCafe = dfT.format(dfvT);

                    Calendar cUnDiaCafe = Calendar.getInstance();
                    cUnDiaCafe.add(Calendar.DATE, 1);
                    Date dfvCafeAlterada = cUnDiaCafe.getTime();
                    String stringDfvCafeAlterada = dfT.format(dfvCafeAlterada);

                    for (int i = 0; i < 8; i++) {
                        IngredienteOProducto ingC = new IngredienteOProducto();
                        ingredientesC.add(ingC);

                    }

                    ingredientesC.get(0).setNombre("Palta");
                    ingredientesC.get(1).setNombre("Ketchup");
                    ingredientesC.get(2).setNombre("Mostaza");
                    ingredientesC.get(3).setNombre("Mayonesa");
                    ingredientesC.get(4).setNombre("Tomate");
                    ingredientesC.get(5).setNombre("Chucrut");
                    ingredientesC.get(6).setNombre("Pepinillo");
                    ingredientesC.get(7).setNombre("Americana");

                    DateTimeFormatter hoyDiaCafe = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDateTime ahoraCafe = LocalDateTime.now();
                    String fEC = hoyDiaCafe.format(ahoraCafe);

                    Calendar muestraHoraIsla = Calendar.getInstance();
                    DateFormat formatoTiempoIsla = new SimpleDateFormat("HH:mm");

                    for (IngredienteOProducto ingredientedeFood : ingredientesC) {
                        muestraHoraIsla.add(Calendar.MINUTE, 5);
                        String horaModificadaIsla = formatoTiempoIsla.format(muestraHoraIsla.getTime());
                        ingredientedeFood.setResponsable(resCafe);
                        ingredientedeFood.setFechaDeElaboracion(fEC);
                        ingredientedeFood.setFechaDeVencimiento(fvdosDiaCafe);
                        ingredientedeFood.setHoraDeElaboracion(horaModificadaIsla);

                    }

                    ingredientesC.get(0).setFechaDeVencimiento(stringDfvCafeAlterada);
                    ingredientesC.get(4).setFechaDeVencimiento(stringDfvCafeAlterada);

                    for (IngredienteOProducto ingredientedeFood : ingredientesC) {
                        System.out.println("\n" + ingredientedeFood);
                    }

                    ingredientesC.clear();

                } else if (op == 3) {
                    System.out.println("Crea rotulos de ave palta y ave pimenton");

                    int cantAPal = 0;
                    int cantAPim = 0;

                    while (true) {
                        try {
                            System.out.print("\nCuantos ave palta? ");
                            cantAPal = Integer.parseInt(s.nextLine());
                            System.out.print("\nCuantos ave pimenton? ");
                            cantAPim = Integer.parseInt(s.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Debe seleccionar un numero entero");
                        }
                    }

                    System.out.print("\nQuien es el responsable de los ave palta? ");
                    String resAvPal = s.nextLine();
                    System.out.print("\nQuien es el responsable de los ave pimenton? ");
                    String resAvPim = s.nextLine();

                    List<IngredienteOProducto> rotulosApalta = new ArrayList();
                    List<IngredienteOProducto> rotulosApimenton = new ArrayList();

                    Calendar calendarioAP = Calendar.getInstance();

                    DateFormat formatoHora = new SimpleDateFormat("HH:mm");
                    String horaEla = formatoHora.format(calendarioAP.getTime());

                    Date feEAV = calendarioAP.getTime();

                    calendarioAP.add(Calendar.DATE, 2);
                    Date fechaAves = calendarioAP.getTime();
                    DateFormat formatoAves = new SimpleDateFormat("dd/MM/yyyy");
                    String fVAves = formatoAves.format(fechaAves);

//                    calendarioAP.add(Calendar.DATE, -2);
                    String fEAves = formatoAves.format(feEAV);

                    for (int i = 0; i < cantAPal; i++) {
                        IngredienteOProducto AvePalta = new IngredienteOProducto();
                        AvePalta.setNombre("Ave Palta");
                        AvePalta.setFechaDeElaboracion(fEAves);
                        AvePalta.setHoraDeElaboracion(horaEla);
                        AvePalta.setFechaDeVencimiento(fVAves);
                        AvePalta.setResponsable(resAvPal);

                        rotulosApalta.add(AvePalta);
                    }

                    for (int i = 0; i < cantAPim; i++) {
                        IngredienteOProducto AvePimenton = new IngredienteOProducto();
                        AvePimenton.setNombre("Ave Pimenton");
                        AvePimenton.setFechaDeElaboracion(fEAves);
                        AvePimenton.setHoraDeElaboracion(horaEla);
                        AvePimenton.setFechaDeVencimiento(fVAves);
                        AvePimenton.setResponsable(resAvPim);

                        rotulosApimenton.add(AvePimenton);

                    }

                    for (IngredienteOProducto ingredientedeFood : rotulosApalta) {
                        System.out.println("\n" + ingredientedeFood);

                    }

                    for (IngredienteOProducto ingredientedeFood : rotulosApimenton) {
                        System.out.println("\n" + ingredientedeFood);

                    }

                    rotulosApalta.clear();
                    rotulosApimenton.clear();

                }else if(op==5){
                    Detalles_del_software detalles=new Detalles_del_software();
                    detalles.Mostrar_info_de_software();
                }
                
                
                else if (op < 1 || op > 5) {
                    System.out.println("Debe elegir uno de los numeros del menu");
                } 

            } catch (Exception e) {
                System.out.println("Eso no es valido");
            }

        }

    }

}
