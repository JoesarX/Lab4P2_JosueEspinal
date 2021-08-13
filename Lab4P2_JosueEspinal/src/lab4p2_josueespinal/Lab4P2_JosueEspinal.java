package lab4p2_josueespinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_JosueEspinal {

    static ArrayList<Vehiculos> v = new ArrayList<Vehiculos>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = menu();
        while (opcion != 11) {
            switch (opcion) {
                case 1: {
                    int tipo = tipoCarro();
                    switch (tipo) {
                        case 1: {
                            Combustion c = new Combustion();
                            System.out.print("Modelo: ");
                            c.setModelo(sc.next());
                            System.out.print("VIN: ");
                            c.setVIN(sc.nextInt());
                            System.out.print("Carroceria: ");
                            c.setCarroceria(sc.next());
                            System.out.print("Cantidad de Pasajeros: ");
                            c.setPasajeros(sc.nextInt());
                            System.out.print("Capacidad del Maletero (en litros): ");
                            c.setMaletero(sc.nextInt());
                            System.out.print("Consumo de combustiblee (en kilómetro por litro): ");
                            c.setConsumo(sc.nextInt());
                            System.out.print("Duración del aceite (en meses): ");
                            c.setAceite(sc.nextInt());
                            System.out.print("Velocidad máxima: ");
                            c.setVelocidad(sc.nextInt());
                            System.out.print("Tipo de cambio (automático o manual): ");
                            c.setCambio(sc.next());

                            v.add(c);
                        }
                        break;
                        case 2: {
                            Hibrido h = new Hibrido();
                            System.out.print("Modelo: ");
                            h.setModelo(sc.next());
                            System.out.print("VIN: ");
                            h.setVIN(sc.nextInt());
                            System.out.print("Carroceria: ");
                            h.setCarroceria(sc.next());
                            System.out.print("Cantidad de Pasajeros: ");
                            h.setPasajeros(sc.nextInt());
                            System.out.print("Capacidad del Maletero (en litros): ");
                            h.setMaletero(sc.nextInt());
                            System.out.print("Capacidad de la batería (en kilowatt por hora): ");
                            h.setBateria(sc.nextInt());
                            System.out.print("Capacidad del motor eléctrico (en kilowatt): ");
                            h.setMotor(sc.nextInt());

                            v.add(h);
                        }
                        break;
                        case 3: {
                            HibridoEnchufable x = new HibridoEnchufable();
                            System.out.print("Modelo: ");
                            x.setModelo(sc.next());
                            System.out.print("VIN: ");
                            x.setVIN(sc.nextInt());
                            System.out.print("Carroceria: ");
                            x.setCarroceria(sc.next());
                            System.out.print("Cantidad de Pasajeros: ");
                            x.setPasajeros(sc.nextInt());
                            System.out.print("Capacidad del Maletero (en litros): ");
                            x.setMaletero(sc.nextInt());
                            System.out.print("Cantidad de kilómetros en modo eléctrico: ");
                            x.setKm(sc.nextInt());
                            System.out.print("Cantidad de motores eléctricos: ");
                            x.setMotores(sc.nextInt());
                            System.out.print("Capacidad de remolque (en toneladas): ");
                            x.setRemolque(sc.nextInt());
                            System.out.print("Es 4x4 [S/N]: ");
                            x.setWheel(siONo());

                            v.add(x);
                        }
                        break;
                        case 4: {
                            Electrico e = new Electrico();
                            System.out.print("Modelo: ");
                            e.setModelo(sc.next());
                            System.out.print("VIN: ");
                            e.setVIN(sc.nextInt());
                            System.out.print("Carroceria: ");
                            e.setCarroceria(sc.next());
                            System.out.print("Cantidad de Pasajeros: ");
                            e.setPasajeros(sc.nextInt());
                            System.out.print("Capacidad del Maletero (en litros): ");
                            e.setMaletero(sc.nextInt());
                            System.out.print("Cantidad de kilómetros que puede recorrer (autonomía): ");
                            e.setKm(sc.nextInt());
                            System.out.print("Cantidad de baterías que almacena: ");
                            e.setBaterias(sc.nextInt());
                            System.out.print("Aceleración de 0-100 (en segundos) : ");
                            e.setAceleracion(sc.nextInt());
                            System.out.print("Tiempo que dura una carga completa (en minutos): ");
                            e.setCarga(sc.nextInt());

                            v.add(e);
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Que Vehiculo desea remover: ");
                    int index = listaCarros();
                    System.out.println("El " + v.get(index).getModelo() + " con VIN:" + v.get(index).getVIN() + " se removio con exito.");
                    v.remove(index);

                }
                break;
                case 3: {
                    System.out.println("Que Vehiculo desea editar: ");
                    int index = listaCarros();
                    if (v.get(index) instanceof Combustion) {
                        int cambio = combustionMenu();
                        switch (cambio) {
                            case 1: {
                                System.out.print("Modelo: ");
                                v.get(index).setModelo(sc.next());
                            }
                            break;
                            case 2: {
                                System.out.print("VIN: ");
                                v.get(index).setVIN(sc.nextInt());
                            }
                            break;
                            case 3: {
                                System.out.print("Carroceria: ");
                                v.get(index).setCarroceria(sc.next());
                            }
                            break;
                            case 4: {
                                System.out.print("Cantidad de Pasajeros: ");
                                v.get(index).setPasajeros(sc.nextInt());
                            }
                            break;
                            case 5: {
                                System.out.print("Capacidad del Maletero (en litros): ");
                                v.get(index).setMaletero(sc.nextInt());
                            }
                            break;
                            case 6: {
                                System.out.print("Consumo de combustiblee (en kilómetro por litro): ");
                                ((Combustion) v.get(index)).setConsumo(sc.nextInt());
                            }
                            break;
                            case 7: {
                                System.out.print("Duración del aceite (en meses): ");
                                ((Combustion) v.get(index)).setAceite(sc.nextInt());
                            }
                            break;
                            case 8: {
                                System.out.print("Velocidad máxima: ");
                                ((Combustion) v.get(index)).setVelocidad(sc.nextInt());
                            }
                            break;
                            case 9: {
                                System.out.print("Tipo de cambio (automático o manual): ");
                                ((Combustion) v.get(index)).setCambio(sc.next());
                            }
                            break;
                        }
                    } else if (v.get(index) instanceof Hibrido) {
                        int cambio = HibridoMenu();
                        switch (cambio) {
                            case 1: {
                                System.out.print("Modelo: ");
                                v.get(index).setModelo(sc.next());
                            }
                            break;
                            case 2: {
                                System.out.print("VIN: ");
                                v.get(index).setVIN(sc.nextInt());
                            }
                            break;
                            case 3: {
                                System.out.print("Carroceria: ");
                                v.get(index).setCarroceria(sc.next());
                            }
                            break;
                            case 4: {
                                System.out.print("Cantidad de Pasajeros: ");
                                v.get(index).setPasajeros(sc.nextInt());
                            }
                            break;
                            case 5: {
                                System.out.print("Capacidad del Maletero (en litros): ");
                                v.get(index).setMaletero(sc.nextInt());
                            }
                            break;
                            case 6: {
                                System.out.print("Capacidad de la batería (en kilowatt por hora): ");
                                ((Hibrido) v.get(index)).setBateria(sc.nextInt());
                            }
                            break;
                            case 7: {
                                System.out.print("Capacidad del motor eléctrico (en kilowatt): ");
                                ((Hibrido) v.get(index)).setMotor(sc.nextInt());
                            }
                            break;
                        }
                    } else if (v.get(index) instanceof HibridoEnchufable) {
                        int cambio = HEMenu();
                        switch (cambio) {
                            case 1: {
                                System.out.print("Modelo: ");
                                v.get(index).setModelo(sc.next());
                            }
                            break;
                            case 2: {
                                System.out.print("VIN: ");
                                v.get(index).setVIN(sc.nextInt());
                            }
                            break;
                            case 3: {
                                System.out.print("Carroceria: ");
                                v.get(index).setCarroceria(sc.next());
                            }
                            break;
                            case 4: {
                                System.out.print("Cantidad de Pasajeros: ");
                                v.get(index).setPasajeros(sc.nextInt());
                            }
                            break;
                            case 5: {
                                System.out.print("Capacidad del Maletero (en litros): ");
                                v.get(index).setMaletero(sc.nextInt());
                            }
                            break;
                            case 6: {
                                System.out.print("Cantidad de kilómetros en modo eléctrico: ");
                                ((HibridoEnchufable) v.get(index)).setKm(sc.nextInt());
                            }
                            break;
                            case 7: {
                                System.out.print("Cantidad de motores eléctricos: ");
                                ((HibridoEnchufable) v.get(index)).setMotores(sc.nextInt());
                            }
                            break;
                            case 8: {
                                System.out.print("Capacidad de remolque (en toneladas): ");
                                ((HibridoEnchufable) v.get(index)).setRemolque(sc.nextInt());
                            }
                            break;
                            case 9: {
                                System.out.print("Es 4x4 [S/N]: ");
                                ((HibridoEnchufable) v.get(index)).setWheel(siONo());
                            }
                            break;
                        }
                    } else if (v.get(index) instanceof Electrico) {
                        int cambio = ElectricoMenu();
                        switch (cambio) {
                            case 1: {
                                System.out.print("Modelo: ");
                                v.get(index).setModelo(sc.next());
                            }
                            break;
                            case 2: {
                                System.out.print("VIN: ");
                                v.get(index).setVIN(sc.nextInt());
                            }
                            break;
                            case 3: {
                                System.out.print("Carroceria: ");
                                v.get(index).setCarroceria(sc.next());
                            }
                            break;
                            case 4: {
                                System.out.print("Cantidad de Pasajeros: ");
                                v.get(index).setPasajeros(sc.nextInt());
                            }
                            break;
                            case 5: {
                                System.out.print("Capacidad del Maletero (en litros): ");
                                v.get(index).setMaletero(sc.nextInt());
                            }
                            break;
                            case 6: {
                                System.out.print("Cantidad de kilómetros que puede recorrer (autonomía): ");
                                ((Electrico) v.get(index)).setKm(sc.nextInt());
                            }
                            break;
                            case 7: {
                                System.out.print("Cantidad de baterías que almacena: ");
                                ((Electrico) v.get(index)).setBaterias(sc.nextInt());
                            }
                            break;
                            case 8: {
                                System.out.print("Aceleración de 0-100 (en segundos) : ");
                                ((Electrico) v.get(index)).setAceleracion(sc.nextInt());
                            }
                            break;
                            case 9: {
                                System.out.print("Tiempo que dura una carga completa (en minutos): ");
                                ((Electrico) v.get(index)).setCarga(sc.nextInt());
                            }
                            break;
                        }
                    }
                }
                break;
                case 4: {
                    for (int i = 0; i < v.size(); i++) {
                        System.out.print(i + "- " + v.get(i));
                        System.out.println();
                    }
                }
                break;
                case 5: {

                }
                break;
                case 6: {
                    System.out.println("Gracias por usar el programa. Que tenga un maravilloso dia.");
                }
                break;
                default: {
                    System.out.println("La opcion no es correcta.");
                }
                break;
            }
            opcion = menu();
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("===========Menu===========");
        System.out.println("1- Añadir un Vehiculo\n"
                + "2- Remover un Vehiculo\n"
                + "3- Customizar un Vehiculo\n"
                + "4- Mostrar Vehiculos\n"
                + "5- Calcular dias sin fallos\n"
                + "6- salir");
        int choice = sc.nextInt();
        return choice;
    }

    public static int tipoCarro() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            System.out.println("QUE TIPO DE CARRO DESEA:");
            System.out.println("1- Combustion\n"
                    + "2- Hibrido\n"
                    + "3- Hibirdo Enchufable\n"
                    + "4- Electrico");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

    public static boolean siONo() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        char choice = 's';
        while (validacion != true) {
            choice = sc.next().charAt(0);
            if (choice == 's' || choice == 'S') {
                validacion = true;
                return true;
            } else if (choice == 'N' || choice == 'n') {
                validacion = true;
                return false;
            } else {
                System.out.println("La opcion ingresada no es valida. Porfavor Ingrese de nuevo [S/N].");
            }
        }
        return false;
    }

    public static int listaCarros() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            for (int i = 0; i < v.size(); i++) {
                System.out.println(i + "- " + v.get(i).getModelo() + " - VIN: " + v.get(i).getVIN());
            }
            choice = sc.nextInt();
            if (choice >= 0 && choice < v.size()) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

    public static int combustionMenu() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            System.out.println("QUE DESEA EDITAR:");
            System.out.println("1- Modelo");
            System.out.println("2- VIN");
            System.out.println("3- Carroceria");
            System.out.println("4- Cantidad de Pasajeros ");
            System.out.println("5- Capacidad del Maletero ");
            System.out.println("6- Consumo de combustible");
            System.out.println("7- Duración del aceite");
            System.out.println("8- Velocidad máxima ");
            System.out.println("9- Tipo de cambio");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 9) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

    public static int HibridoMenu() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            System.out.println("QUE DESEA EDITAR:");
            System.out.println("1- Modelo");
            System.out.println("2- VIN");
            System.out.println("3- Carroceria");
            System.out.println("4- Cantidad de Pasajeros");
            System.out.println("5- Capacidad del Maletero");
            System.out.println("6- Capacidad de la batería");
            System.out.println("7- Capacidad del motor eléctrico");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 7) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

    public static int HEMenu() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            System.out.println("QUE DESEA EDITAR:");
            System.out.println("1- Modelo");
            System.out.println("2- VIN");
            System.out.println("3- Carroceria");
            System.out.println("4- Cantidad de Pasajeros ");
            System.out.println("5- Capacidad del Maletero ");
            System.out.println("6- Cantidad de kilómetros en modo eléctrico");
            System.out.println("7- Cantidad de motores eléctricos");
            System.out.println("8- Capacidad de remolque");
            System.out.println("9- Capacidad de 4x4");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 9) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

    public static int ElectricoMenu() {
        Scanner sc = new Scanner(System.in);
        boolean validacion = false;
        int choice = 0;
        while (validacion != true) {
            System.out.println("QUE DESEA EDITAR:");
            System.out.println("1- Modelo");
            System.out.println("2- VIN");
            System.out.println("3- Carroceria");
            System.out.println("4- Cantidad de Pasajeros ");
            System.out.println("5- Capacidad del Maletero ");
            System.out.println("6- Kilometros que puede recorrer");
            System.out.println("7- Cantidad de Baterias");
            System.out.println("8- Aceleracion 0-100 ");
            System.out.println("9- Duracion de una carga completa");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 9) {
                validacion = true;
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }
        return choice;
    }

}
