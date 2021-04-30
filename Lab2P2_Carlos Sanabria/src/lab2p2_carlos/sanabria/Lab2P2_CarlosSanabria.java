/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carlos.sanabria;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Carlos Sanabria
 */
public class Lab2P2_CarlosSanabria {
public static Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        Computadora c= new Computadora();
        ArrayList<Computadora>clist= new ArrayList();
        while(op!=8){
            System.out.println("***Menu***\n"
            +"1.Crear\n"
            +"2.Listar\n"
            +"3.Modificar\n"
            +"4.Eliminar\n"
            +"5.Informe 1\n"
            +"6.Informe 2\n"
            +"7.Informe 3\n"
            +"Ingrese su opción: ");
            op=leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese el Modelo de computadora: ");
                    String Modelo=leer.next();
                    System.out.println("Ingrese el numero de serie: ");
                    int num_s=leer.nextInt();
                     for (int i = 0; i < clist.size(); i++) {
                        while(clist.get(i).getNumeroS()==num_s){
                            System.out.println("El numero de serie que ingreso ya existe porfavor ingrese otro: ");
                            num_s=leer.nextInt();
                        }
                    }
                    System.out.println("Ingrese el capacidad disco duro: ");
                    int capcidadD=leer.nextInt();
                    System.out.println("Ingrese el tamaño de la pantalla: ");
                    int tpantalla=leer.nextInt();
                    System.out.println("Su computadora tiene un teclado numerico? (si/no) ");
                    String resp=leer.next();
                    while(!resp.equalsIgnoreCase("Si")&&!resp.equalsIgnoreCase("No")){
                        System.out.println("Por favor ingrese (si/no): ");
                        resp=leer.next();
                    }
                    System.out.println("Ingrese el tipo de Procesor que tiene su computadora: ");
                    String procesa=leer.next();
                    System.out.println("Ingrese el tipo de targeta grafica que tiene: (normal/gamer)");
                    String resp1=leer.next();
                     while(!resp1.equalsIgnoreCase("Normal")&&!resp1.equalsIgnoreCase("Gamer")){
                        System.out.println("Por favor ingrese (normal/gamer): ");
                        resp1=leer.next();
                    }
                     System.out.println("Ingrese su sistema operativo (windows/chromeOS)");
                     String resp2=leer.next();
                     while(!resp2.equalsIgnoreCase("Windows")&&!resp2.equalsIgnoreCase("ChromeOS")){
                        System.out.println("Por favor ingrese (windows/chromeOS): ");
                        resp2=leer.next();
                    }
                     System.out.println("Tiempo que se tardo en fabricarse: ");
                     int tiempof=leer.nextInt();
                     System.out.println("Cual es la capacidad de bateria: ");
                     int capbat=leer.nextInt();
                     System.out.println("Cuanto tiempo dura su batteria: ");
                     int durabat= leer.nextInt();
                    if(resp.equalsIgnoreCase("Si")){
                        boolean t=true;
                        clist.add(new Computadora(Modelo,procesa,resp1,resp2,num_s,capcidadD,tpantalla,tiempof,capbat,durabat,t));
                    }else if(resp.equalsIgnoreCase("No")){
                        clist.add(new Computadora(Modelo,procesa,resp1,resp2,num_s,capcidadD,tpantalla,tiempof,capbat,durabat));
                    }
                break;
                case 2:
                    if(clist.isEmpty()){
                        System.out.println("No hay computadoras registradas en el sistema");   
                    }else{
                    for (int i = 0; i < clist.size(); i++) {
                        System.out.println(i+")"+" "+clist.get(i));
                    }
                    }
                break;
                case 3:
                    System.out.println("Ingrese su numero serie: ");
                    int nums=leer.nextInt();
                    int n=0;
                    for (int i = 0; i < clist.size(); i++) {
                        if(clist.get(i).getNumeroS()==nums){
                            n=i;
                        }
                    }
                    int op1=0;
                    System.out.println("**MENU**\n"
                            +"1. Tam. Pantalla\n"
                            + "2. Capacidad Disco Duro\n"
                            + "3. Capacidad Bateria\n"
                            + "4. Duracion Bateria\n"
                            + "5. Tiempo de Fabricacion\n"
                            + "6. Modelo de Computadora\n"
                            + "7. Tipo de Procesador\n"
                            + "8. Tipo de Tarjeta Grafica\n"
                            + "9. Tipo de Sistema Operativo\n"
                            + "10. Teclado Numerico\n"
                            +"Ingrese Atributo a Modificar");
                    op1=leer.nextInt();
                    switch(op1){
                        case 1:
                            System.out.println("El tamaño actual es: "+clist.get(n).getTPantalla()+" pulgadas");
                            System.out.println("Ingregrese el nuevo tamaño: ");
                            int tpan=leer.nextInt();
                            clist.get(n).setTPantalla(tpan);
                        break;
                        case 2:
                            System.out.println("La capacidad actual es: "+clist.get(n).getCapiDisco()+" GB");
                            System.out.println("Ingregrese la nueva capacidad de disco: ");
                            int tcapd=leer.nextInt();
                            clist.get(n).setCapiDisco(tcapd);
                        break;
                        case 3:
                            System.out.println("La capacidad actual es: "+clist.get(n).getCapiBat()+" amh");
                            System.out.println("Ingregrese la nueva capacidad de bateria es: ");
                            int tcapb=leer.nextInt();
                            clist.get(n).setCapiBat(tcapb);
                        break;
                        case 4:
                            System.out.println("La durabilidad de bateria actual es: "+clist.get(n).getDuraBat()+" horas");
                            System.out.println("Ingregrese la nueva durabilidad de la bateria es: ");
                            int tdurab=leer.nextInt();
                            clist.get(n).setDuraBat(tdurab);
                        break;
                        case 5:
                            System.out.println("El tiempo de fabricacion es: "+clist.get(n).getTiempof());
                            System.out.println("Ingregrese el nuevo tiempo de fabricacion es: ");
                            int tiempoff=leer.nextInt();
                            clist.get(n).setTiempof(tiempoff);
                        break;
                        case 6:
                            System.out.println("El modelo actual es: "+clist.get(n).getModelo());
                            System.out.println("Ingregrese el nuevo Modelo: ");
                            String Mod=leer.next();
                            clist.get(n).setModelo(Mod);
                        break;
                        case 7:
                            System.out.println("El procesador actual es: "+clist.get(n).getTipo_Procesa());
                            System.out.println("Ingregrese el nuevo Procesador es: ");
                            String Pros=leer.next();
                            clist.get(n).setTipo_Procesa(Pros);
                        break;
                        case 8:
                            System.out.println("La targeta grafica actual es: "+clist.get(n).getTarjetaG());
                            System.out.println("Ingregrese la nueva targeta grafica es: ");
                            String resp3=leer.next();
                            while(!resp3.equalsIgnoreCase("Normal")&&!resp3.equalsIgnoreCase("Gamer")){
                                System.out.println("Por favor ingrese (normal/gamer): ");
                                resp3=leer.next();
                            }
                            clist.get(n).setTarjetaG(resp3);
                        break;
                        case 9:
                            System.out.println("El sistema operativo actual es: "+clist.get(n).getSistemasO());
                            System.out.println("Ingregrese el nuevo sistema operativo es: ");
                            String resp4=leer.next();
                             while(!resp4.equalsIgnoreCase("Windows")&&!resp4.equalsIgnoreCase("ChromeOS")){
                                System.out.println("Por favor ingrese (windows/chromeos): ");
                                resp4=leer.next();
                            }
                            clist.get(n).setSistemasO(resp4);
                        break;
                        case 10:
                            System.out.println("Su computadora actualmente tiene teclado numerico : "+clist.get(n).returnS0N());
                            System.out.println("Ingregrese el nuevo sistema operativo es: ");
                            String resp5=leer.next();
                             while(!resp5.equalsIgnoreCase("Si")&&!resp5.equalsIgnoreCase("No")){
                                System.out.println("Por favor ingrese (windows/chromeos): ");
                                resp5=leer.next();
                            }
                             if(resp5.equals("Si")){
                                clist.get(n).setTec(true);
                             }else if(resp5.equals("No")){
                                 clist.get(n).setTec(false);
                             }
                        break;
                    }
                break;
                case 4:
                    System.out.println("Ingrese su numero serie de la computadora que desea eliminar: ");
                    int nums1=leer.nextInt();
                    int n1=0;
                    for (int i = 0; i < clist.size(); i++) {
                        if(clist.get(i).getNumeroS()==nums1){
                            n1=i;
                        }
                    }
                    clist.remove(n1);
                break;
                case 5:
                    System.out.println("Computadoras Gamer: ");
                    for (int i = 0; i < clist.size(); i++) {
                        if(clist.get(i).getTarjetaG().equalsIgnoreCase("Gamer")&&clist.get(i).getTPantalla()>17){
                            System.out.println(clist.get(i));
                            System.out.println("");
                        }
                    }
                break;
                case 6:
                    System.out.println("Computadoras Educativas: ");
                    for (int i = 0; i < clist.size(); i++) {
                        if(clist.get(i).getCapiDisco()<300&&clist.get(i).getTPantalla()<13&&clist.get(i).getSistemasO().equalsIgnoreCase("ChromeOs")){
                            System.out.println(clist.get(i));
                            System.out.println("");
                        }
                    }
                break;
                case 7:
                    System.out.println("Computadoras de poco uso: ");
                    for (int i = 0; i < clist.size(); i++) {
                        if(clist.get(i).getTiempof()>2&&clist.get(i).getDuraBat()<1&&clist.get(i).getSistemasO().equalsIgnoreCase("Windows")){
                            System.out.println(clist.get(i));
                            System.out.println("");
                        }
                    }
                break;
            }
        }
    }
    
}
