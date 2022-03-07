/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadodigo;

import java.time.LocalDateTime;
import java.util.Scanner;
import supermercadodigo.Archivos.Archivos;
import supermercadodigo.Clases.Usuarios;

/**
 *
 * @author jarvi
 */
public class SuperMercadoDigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario;
        String cont;
        int nivel;
        //Declaramos el scanner
        Scanner in = new Scanner(System.in);
        //Realizamos el Login para los usuarios
        System.out.println("-----------BIENVENIDO A SUPER MERCADO DIEGO-----------\n");
         
        
        //Realizamos el menu de acceso    
         System.out.println("-------------------------------------------------------------------");
        System.out.println("-------¿CON QUE NIVEL DE ACCESO QUIERES INGRESAR?------\n");
        System.out.println("1. Administrador: ");
        System.out.println("2. Vendedor: ");
        System.out.println("3. Invitado: ");
        System.out.println("DIGITA EL NUMERO CORRESPONDIENTE AL NIVEL AL QUE QUIERES INGRESAR: \n\n");
        System.out.println("---------------------------------------------------------------------");

        nivel = in.nextInt();

        //CREANMOS LAS VARIABLES
        Usuarios U = new Usuarios();
        Archivos a = new Archivos();

        switch (nivel) {
            case 1:

                do {
                    System.out.println("BIENVENIDO ADMINISTRADOR");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  ");
                    cont = in.next();

                } while (U.AccesoConcecidoAdministrador(usuario, cont) == false);
                LocalDateTime localDate = LocalDateTime.now();
                int hora = localDate.getHour();
                int minuto = localDate.getMinute();
                int segundo = localDate.getSecond();

                int dia = localDate.getDayOfMonth();
                int mes = localDate.getMonthValue();
                int anio = localDate.getYear();

                a.EscribirFichero("\nAdministrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
                boolean salir = false;

                int opc;
                
                
                //OPCION ADMINISTRADOR
                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1. AGREAR NUEVA VENTA");
                    System.out.println("2. INVENTARIO");
                    System.out.println("3. CAMBIAR CONTRASEÑA");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc = in.nextInt();
                    switch (opc) {
                        case 1:
                        //VENTAS  
                        System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");

                            int compra;
                            int productos;
                            int cod[] = new int[10];
                            int cantidad[] = new int[10];
                            int c = 0;
                            double descuento = 0.03;
                            double totaldescuento = 0;
                            double totalfinal = 0;
                            double total1 = 0;
                            double total2 = 0;
                            double total3 = 0;
                            double total4 = 0;
                            double total5 = 0;
                            double total6 = 0;
                            double total7 = 0;
                            double total8 = 0;
                            double total9 = 0;
                            double total10 = 0;

                            do {

                                System.out.println("Digite codigo del producto a adquirir");
                                cod[c] = in.nextInt();
                                System.out.println("Digite la cantidad de productos a adquirir");
                                cantidad[c] = in.nextInt();
                                c++;
                                System.out.println("Desea agregar mas productos(Presionar 1 y si no 0");

                                compra = in.nextInt();

                            } while (compra == 1);
                            System.out.println("------------------------------------");
                            System.out.println("FACTURA DE COMPRA");
                            System.out.println("SUPER MERCADO DIEGO");
                            System.out.println("------------------------------------");
                            for (int i = 0; i < c; i++) {

                                if (cod[i] == 1) {

                                    int huevos = 30;
                                    if (cantidad[i] <= huevos) {

                                        total1 = cantidad[i] * 0.10;
                                        System.out.println("Huevos--" + cantidad[i] + "x $0.10 = $" + total1);

                                    } else {

                                        System.out.println("Huevos--Disculpa las molestias,producto agotado!");

                                    }

                                }

                                if (cod[i] == 2) {
                                    int Pollo = 5;
                                    if (cantidad[i] <= Pollo) {

                                        total2 = cantidad[i] * 5.00;
                                        System.out.println("Pollo--" + cantidad[i] + "x $5.00 = $" + total2);
                                    } else {

                                        System.out.println("Pollo--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 3) {
                                    int Aceite = 60;
                                    if (cantidad[i] <= Aceite) {
                                        total3 = cantidad[i] * 3.00;

                                        System.out.println("Aceite--" + cantidad[i] + "x $3.00 = $" + total3);

                                    } else {

                                        System.out.println("Aceite--Disculpa las molestias,producto agotado!");
                                    }
                                }

                                if (cod[i] == 4) {
                                    int Fosforos = 60;
                                    if (cantidad[i] <= Fosforos) {
                                        total4 = cantidad[i] * 0.50;

                                        System.out.println("Fosforos--" + cantidad[i] + "x $0.50 = $" + total4);
                                    } else {
                                        System.out.println("Fosforos--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 5) {
                                    int Dulces = 500;
                                    if (cantidad[i] <= Dulces) {
                                        total5 = cantidad[i] * 0.80;

                                        System.out.println("Dulces--" + cantidad[i] + "x $0.80 = $" + total5);

                                    } else {
                                        System.out.println("Dulces--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 6) {
                                    int Margarina = 20;
                                    if (cantidad[i] <= Margarina) {
                                        total6 = cantidad[i] * 0.30;

                                        System.out.println("Margarina--" + cantidad[i] + "x $0.30 = $" + total6);

                                    } else {
                                        System.out.println("Margarina--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 7) {
                                    int Jabon = 25;
                                    if (cantidad[i] <= Jabon) {
                                        total7 = cantidad[i] * 2.25;

                                        System.out.println("Jabon--" + cantidad[i] + "x $2.25 = $" + total7);

                                    } else {
                                        System.out.println("Jabon--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 8) {
                                    int Carne = 30;
                                    if (cantidad[i] <= Carne) {
                                        total8 = cantidad[i] * 2.75;

                                        System.out.println("Carne--" + cantidad[i] + "x $2.75 = $" + total8);

                                    } else {
                                        System.out.println("Carne--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 9) {
                                    int Gaseosa = 180;
                                    if (cantidad[i] <= Gaseosa) {
                                        total9 = cantidad[i] * 1.80;

                                        System.out.println("Gaseosa--" + cantidad[i] + "x $1.80 = $" + total9);
                                    } else {
                                        System.out.println("Gaseosa--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 10) {
                                    int Desechables = 50;
                                    if (cantidad[i] <= Desechables) {
                                        total10 = cantidad[i] * 3.25;

                                        System.out.println("Desechables--" + cantidad[i] + "x $3.25 = $" + total10);
                                    } else {
                                        System.out.println("Desechables--Disculpa las molestias,producto agotado!");

                                    }
                                }
                            }

                            double totalproducto;
                            totalproducto = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;

                            if (totalproducto > 20) {
                                totalfinal = totalproducto;

                                totaldescuento = totalproducto * descuento;

                                totalproducto = totalproducto - totaldescuento;

                            }

                            System.out.println("------------------------------------");
                            System.out.println("Total: $" + totalfinal);
                            System.out.println("Descuento del 3% $" + totaldescuento);
                            System.out.println("Total con descuento :$" + totalproducto);
                            System.out.println("------------------------------------");
                            break;
                        
                        
                        case 2:
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");
                        break;
                        
                        
                        case 3:
                        //CAMBIO DE CONTRASEÑA
                            System.out.println("**Menu para cambiar contraseña**");
                            System.out.println("Seleccione su nueva contraseña:");
                            System.out.println("Escriba nuevamente su contraseña nueva:\n\n");
                            break;
                    
                        case 4:
                            System.out.println("Saliendo del programa");
                            a.EscribirFichero("\nSalida del Administrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;
                    }
                } while (opc != 4);
                break;

            //OPCION VENDEDOR
            case 2:
                do {
                    System.out.println("BIENVENIDO VENDEDOR BRYAN");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  "+"\n");
                   
                    cont = in.next();
                } while (U.AccesoConcedidoVendedor(usuario, cont) == false);

                LocalDateTime localDate2 = LocalDateTime.now();
                int hora2 = localDate2.getHour();
                int minuto2 = localDate2.getMinute();
                int segundo2 = localDate2.getSecond();
                int dia2 = localDate2.getDayOfMonth();
                int mes2 = localDate2.getMonthValue();
                int anio2 = localDate2.getYear();

                a.EscribirFichero("\nVendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);

                int opc1;
                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1. AGREAR NUEVA VENTA");
                    System.out.println("2. INVENTARIO");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc1 = in.nextInt();
                    switch (opc1) {
                        //VENTAS 
                        case 1:
                            System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");

                            int compra;
                            int productos;
                            int cod[] = new int[10];
                            int cantidad[] = new int[10];
                            int c = 0;
                            double descuento = 0.03;
                            double totaldescuento = 0;
                            double totalfinal = 0;
                            double total1 = 0;
                            double total2 = 0;
                            double total3 = 0;
                            double total4 = 0;
                            double total5 = 0;
                            double total6 = 0;
                            double total7 = 0;
                            double total8 = 0;
                            double total9 = 0;
                            double total10 = 0;

                            do {

                                System.out.println("Digite codigo del producto a adquirir");
                                cod[c] = in.nextInt();
                                System.out.println("Digite la cantidad de productos a adquirir");
                                cantidad[c] = in.nextInt();
                                c++;
                                System.out.println("Desea agregar mas productos(Presionar 1 y si no 0");

                                compra = in.nextInt();

                            } while (compra == 1);
                            System.out.println("------------------------------------");
                            System.out.println("FACTURA DE COMPRA");
                            System.out.println("SUPER MERCADO DIEGO");
                            System.out.println("------------------------------------");
                            for (int i = 0; i < c; i++) {

                                if (cod[i] == 1) {

                                    int huevos = 30;
                                    if (cantidad[i] <= huevos) {

                                        total1 = cantidad[i] * 0.10;
                                        System.out.println("Huevos--" + cantidad[i] + "x $0.10 = $" + total1);

                                    } else {

                                        System.out.println("Huevos--Disculpa las molestias,producto agotado!");

                                    }

                                }

                                if (cod[i] == 2) {
                                    int Pollo = 5;
                                    if (cantidad[i] <= Pollo) {

                                        total2 = cantidad[i] * 5.00;
                                        System.out.println("Pollo--" + cantidad[i] + "x $5.00 = $" + total2);
                                    } else {

                                        System.out.println("Pollo--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 3) {
                                    int Aceite = 60;
                                    if (cantidad[i] <= Aceite) {
                                        total3 = cantidad[i] * 3.00;

                                        System.out.println("Aceite--" + cantidad[i] + "x $3.00 = $" + total3);

                                    } else {

                                        System.out.println("Aceite--Disculpa las molestias,producto agotado!");
                                    }
                                }

                                if (cod[i] == 4) {
                                    int Fosforos = 60;
                                    if (cantidad[i] <= Fosforos) {
                                        total4 = cantidad[i] * 0.50;

                                        System.out.println("Fosforos--" + cantidad[i] + "x $0.50 = $" + total4);
                                    } else {
                                        System.out.println("Fosforos--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 5) {
                                    int Dulces = 500;
                                    if (cantidad[i] <= Dulces) {
                                        total5 = cantidad[i] * 0.80;

                                        System.out.println("Dulces--" + cantidad[i] + "x $0.80 = $" + total5);

                                    } else {
                                        System.out.println("Dulces--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 6) {
                                    int Margarina = 20;
                                    if (cantidad[i] <= Margarina) {
                                        total6 = cantidad[i] * 0.30;

                                        System.out.println("Margarina--" + cantidad[i] + "x $0.30 = $" + total6);

                                    } else {
                                        System.out.println("Margarina--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 7) {
                                    int Jabon = 25;
                                    if (cantidad[i] <= Jabon) {
                                        total7 = cantidad[i] * 2.25;

                                        System.out.println("Jabon--" + cantidad[i] + "x $2.25 = $" + total7);

                                    } else {
                                        System.out.println("Jabon--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 8) {
                                    int Carne = 30;
                                    if (cantidad[i] <= Carne) {
                                        total8 = cantidad[i] * 2.75;

                                        System.out.println("Carne--" + cantidad[i] + "x $2.75 = $" + total8);

                                    } else {
                                        System.out.println("Carne--Disculpa las molestias,producto agotado!");
                                    }
                                }
                                if (cod[i] == 9) {
                                    int Gaseosa = 180;
                                    if (cantidad[i] <= Gaseosa) {
                                        total9 = cantidad[i] * 1.80;

                                        System.out.println("Gaseosa--" + cantidad[i] + "x $1.80 = $" + total9);
                                    } else {
                                        System.out.println("Gaseosa--Disculpa las molestias,producto agotado!");

                                    }
                                }
                                if (cod[i] == 10) {
                                    int Desechables = 50;
                                    if (cantidad[i] <= Desechables) {
                                        total10 = cantidad[i] * 3.25;

                                        System.out.println("Desechables--" + cantidad[i] + "x $3.25 = $" + total10);
                                    } else {
                                        System.out.println("Desechables--Disculpa las molestias,producto agotado!");

                                    }
                                }
                            }

                            double totalproducto;
                            totalproducto = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;

                            if (totalproducto > 20) {
                                totalfinal = totalproducto;

                                totaldescuento = totalproducto * descuento;

                                totalproducto = totalproducto - totaldescuento;

                            }

                            System.out.println("------------------------------------");
                            System.out.println("Total: $" + totalfinal);
                            System.out.println("Descuento del 3% $" + totaldescuento);
                            System.out.println("Total con descuento :$" + totalproducto);
                            System.out.println("------------------------------------");
                            break;

                        //INVENTARIOS
                        case 2:
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerProductos();
                            System.out.println("-----------------------------------------");
                            break;
                         
                        case 3:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Vendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);
                            break;

                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;
                    }
                } while (opc1 != 3);

                break;

            //MODO INVITADO 
            case 3:

                do {
                    System.out.println("BIENVENIDO INVITADO OQUELI");
                    System.out.println("INGRESE SU USUARIO:  ");
                    usuario = in.next();
                    System.out.println("INGRESE SU CONTRASEÑA:  ");
                    cont = in.next();

                } while (U.AccesoConcecidoInvitado(usuario, cont) == false);

                LocalDateTime localDate3 = LocalDateTime.now();
                int hora3 = localDate3.getHour();
                int minuto3 = localDate3.getMinute();
                int segundo3 = localDate3.getSecond();

                int dia3 = localDate3.getDayOfMonth();
                int mes3 = localDate3.getMonthValue();
                int anio3 = localDate3.getYear();

                a.EscribirFichero("\nInvitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                int opc2;

                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("2. INVENTARIO");
                    System.out.println("INVENTARIO EN MANTENIMIENTO, NO DISPONIBLE DE MOMENTO\n");//BORRAR ESTO AL METER EL CODIGO
                     System.out.println("-------------------------------------------------------------------\n");
                    System.out.println("4. SALIR");
                    System.out.println("DIGITE LA OPCION\n");
                    opc2 = in.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("LISTA DE INVENTARIOS");
                             System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");
                            break;
                        case 2:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Invitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                            break;
                    }
                } while (opc2 != 2);
                break;
        }
    }
}
