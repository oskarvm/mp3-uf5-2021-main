package Excepcions.ActivitatExceptions;

import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClientAccountException {
        CompteEstalvi compteEstalvi = new CompteEstalvi("110796");
        CompteEstalvi cuenta1 = new CompteEstalvi("1234567890");
        CompteEstalvi cuenta2 = new CompteEstalvi("0987654321");
        String dni, dni2, dni3;
        int opcio;
        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("1 - Añadir dos clientes con DNI correcto");
            System.out.println("2 - Añadir un cliente con DNI incorrecto");
            System.out.println("3 - Eliminar un cliente");
            System.out.println("4 - Ingresar y sacar dinero de la cuenta correctamente");
            System.out.println("5 - Ingresar y sacar dinero de la cuenta incorrectamente");
            System.out.println("6 - Hacer una transferencia");
            System.out.println("0 - Salir");
            opcio = sc.nextInt();

            switch (opcio){
                case 1:
                    try {
                        dni = "54039629W";
                        dni2 = "54039631G";
                        Client cliente1 = new Client("Oscar", "Vazquez", dni);
                        Client cliente2 = new Client("Jordi", "Ciutat", dni2);
                        compteEstalvi.addUser(cliente1);
                        compteEstalvi.addUser(cliente2);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        dni3 = "52907X8";
                        Client cliente3 = new Client("Pepito", "Grillo", dni3);
                        compteEstalvi.addUser(cliente3);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        dni = "54039629W";
                        compteEstalvi.removeUser(dni);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        compteEstalvi.ingressar(100);
                        System.out.println();
                        compteEstalvi.treure(30);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        compteEstalvi.ingressar(20);
                        System.out.println();
                        compteEstalvi.treure(500);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        cuenta1.ingressar(350);
                        compteEstalvi.transferencia(cuenta1, cuenta2, 55);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("Numero de cuenta: " + cuenta1.getNumCompte() + " - Saldo: " + cuenta1.getSaldo());
                        System.out.println("Numero de cuenta: " + cuenta2.getNumCompte() + " - Saldo: " + cuenta2.getSaldo());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error prueba del 1 al 6");
            }
        }while (opcio != 0);
    }
}
