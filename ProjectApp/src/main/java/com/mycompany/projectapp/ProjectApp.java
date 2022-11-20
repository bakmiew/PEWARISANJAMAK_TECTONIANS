/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectapp;
import java.util.Scanner;
/**
 *
 * @author Tectonia
 */
public class ProjectApp {

    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        Phone iphone = new Iphone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();
        
        PhoneUser tecto = new PhoneUser(xiaomi);
        PhoneUser nia = new PhoneUser(iphone);
        PhoneUser nurul = new PhoneUser(samsung);
        PhoneUser silvani = new PhoneUser(oppo);
        
        Scanner input = new Scanner(System.in);

        int pil;

        do {
            System.out.println("APLIKASI INTERFACE");
            System.out.println("");
            System.out.println("Silahkan pilih HP");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih   : ");
            pil = input.nextInt();
            
            System.out.println("");
            System.out.println("");
            
            switch (pil) {
                case 1 :
                    do {
                        System.out.println("Menu HP Xiaomi");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                tecto.turnOnThePhone();
                                break;
                            case 2 :
                                tecto.turnOffThePhone();
                                break;
                            case 3 :
                                tecto.makePhoneLouder();
                                break;
                            case 4 :
                                tecto.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah...");
                        }

                    } while (pil != 0);
                    break;
                case 2 :
                    do {
                        System.out.println("Menu HP Iphone");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                nia.turnOnThePhone();
                                break;
                            case 2 :
                                nia.turnOffThePhone();
                                break;
                            case 3 :
                                nia.makePhoneLouder();
                                break;
                            case 4 :
                                nia.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 3 :
                    do {
                        System.out.println("Menu HP Samsung");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                nurul.turnOnThePhone();
                                break;
                            case 2 :
                                nurul.turnOffThePhone();
                                break;
                            case 3 :
                                nurul.makePhoneLouder();
                                break;
                            case 4 :
                                nurul.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 4 :
                    do {
                        System.out.println("Menu HP Oppo");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                silvani.turnOnThePhone();
                                break;
                            case 2 :
                                silvani.turnOffThePhone();
                                break;
                            case 3 :
                                silvani.makePhoneLouder();
                                break;
                            case 4 :
                                silvani.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 0 :
                    System.out.println("Selamat tinggal....");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan salah....");
            }
        } while (pil != 0);
    }  
}
