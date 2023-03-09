package LRTStations;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanners
        Scanner s = new Scanner(System.in);
        LRT l = new LRT();
        //inputs
        do {
            do {
                do {
                    do {
                System.out.println("\n|-----------------------------------------------|");
                System.out.println("|   ##### WELCOME TO LRT STATION LINE-1 #####   |");
                System.out.println("|-----------------------------------------------|");
                System.out.println("\n|-----------------------------------------------|");
                System.out.println("|\t===== FOR STARTING STATION =====\t|");
                System.out.println("|-----------------------------------------------|");
                System.out.println("|\t\t\t\t\t\t|");
                System.out.println("|   [1] Roosevelt\t[11] Carriedo\t\t|");
                System.out.println("|   [2] Balintawak\t[12] Central Terminal   |");
                System.out.println("|   [3] Monumento\t[13] UN Avenue\t\t|");
                System.out.println("|   [4] 5th. Avenue\t[14] Pedro Gil\t\t|");
                System.out.println("|   [5] R. Papa\t\t[15] Quirino\t\t|");
                System.out.println("|   [6] Abad Santos\t[16] Vito Cruz\t\t|");
                System.out.println("|   [7] Blumentritt\t[17] Gil Puyat\t\t|");
                System.out.println("|   [8] Tayuman\t\t[18] Libertad\t\t|");
                System.out.println("|   [9] Bambang\t\t[19] EDSA\t\t|");
                System.out.println("|   [10] Doroteo Jose\t[20] Baclaran\t\t|");
                System.out.println("|\t      [0] CANCEL TRIP [0]\t\t|");
                System.out.println("|_______________________________________________|");
                System.out.print("\tEnter Starting Station No. <1-20>: ");
                l.setLocation(s.nextInt());
                System.out.println("-------------------------------------------------");
                if (l.loc==1) {
                    System.out.println("\tStarting Station: Roosevelt\n");
                }
                else if (l.loc==2) {
                    System.out.println("\tStarting Station: Balintawak\n");
                }
                else if (l.loc==3) {
                    System.out.println("\tStarting Station: Monumento\n");
                }
                else if (l.loc==4) {
                    System.out.println("\tStarting Station: 5th. Avenue\n");
                }
                else if (l.loc==5) {
                    System.out.println("\tStarting Station: R. Papa\n");
                }
                else if (l.loc==6) {
                    System.out.println("\tStarting Station: Abad Santos\n");
                }
                else if (l.loc==7) {
                    System.out.println("\tStarting Station: Blumentritt\n");
                }
                else if (l.loc==8) {
                    System.out.println("\tStarting Station: Tayuman\n");
                }
                else if (l.loc==9) {
                System.out.println("\tStarting Station: Bambang\n");
                }
                else if (l.loc==10) {
                    System.out.println("\tStarting Station: Doroteo Jose\n");
                }
                else if (l.loc==11) {
                    System.out.println("\tStarting Station: Carriedo\n");
                }
                else if (l.loc==12) {
                    System.out.println("\tStarting Station: Central Terminal\n");
                }
                else if (l.loc==13) {
                System.out.println("\tStarting Station: UN Avenue\n");
                }
                else if (l.loc==14) {
                    System.out.println("\tStarting Station: Pedro Gil\n");
                }
                else if (l.loc==15) {
                    System.out.println("\tStarting Station: Quirino\n");
                }
                else if (l.loc==16) {
                System.out.println("\tStarting Station: Vito Cruz\n");
                }
                else if (l.loc==17) {
                    System.out.println("\tStarting Station: Gil Puyat\n");
                }
                else if (l.loc==18) {
                    System.out.println("\tStarting Station: Libertad\n");
                }
                else if (l.loc==19) {
                    System.out.println("\tStarting Station: EDSA\n");
                }
                else if (l.loc==20) {
                    System.out.println("\tStarting Station: Baclaran\n");
                }
                else if (l.loc==0) {
                    l.loc=21;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
                else if (l.loc==-1) {
                    System.exit(0);
                }
                else
                {
                    System.out.println("\tInput Error! Please Try Again\n");
                }
                }
            while(l.loc < -1 || l.loc > 20);
            do {
                System.out.println("-------------------------------------------------");
                System.out.println("|      ===== FOR DESTINATION STATION =====\t|");
                System.out.println("|-----------------------------------------------|");
                System.out.println("|\t\t\t\t\t\t|");
                System.out.println("|   [1] Roosevelt\t[11] Carriedo\t\t|");
                System.out.println("|   [2] Balintawak\t[12] Central Terminal   |");
                System.out.println("|   [3] Monumento\t[13] UN Avenue\t\t|");
                System.out.println("|   [4] 5th. Avenue\t[14] Pedro Gil\t\t|");
                System.out.println("|   [5] R. Papa\t\t[15] Quirino\t\t|");
                System.out.println("|   [6] Abad Santos\t[16] Vito Cruz\t\t|");
                System.out.println("|   [7] Blumentritt\t[17] Gil Puyat\t\t|");
                System.out.println("|   [8] Tayuman\t\t[18] Libertad\t\t|");
                System.out.println("|   [9] Bambang\t\t[19] EDSA\t\t|");
                System.out.println("|   [10] Doroteo Jose\t[20] Baclaran\t\t|");
                System.out.println("|\t      [0] CANCEL TRIP [0]\t\t|");
                System.out.println("|_______________________________________________|");
                System.out.print("\tEnter Destination Station No. <1-20>: ");
                l.setDropOff(s.nextInt());
                System.out.println("-------------------------------------------------");
                if(l.doff==1) {
                    System.out.println("\tDrop Off Station: Roosevelt");
                }
                else if (l.doff==2) {
                    System.out.println("\tDrop Off Station: Balintawak");
                }
                else if (l.doff==3) {
                    System.out.println("\tDrop Off Station: Monumento");
                }
                else if (l.doff==4) {
                    System.out.println("\tDrop Off Station: 5th. Avenue");
                }
                else if (l.doff==5) {
                    System.out.println("\tDrop Off Station: R. Papa");
                }
                else if (l.doff==6) {
                    System.out.println("\tDrop Off Station: Abad Santos");
                }
                else if (l.doff==7) {
                    System.out.println("\tDrop Off Station: Blumentritt");
                }
                else if (l.doff==8) {
                    System.out.println("\tDrop Off Station: Tayuman");
                }
                else if (l.doff==9) {
                    System.out.println("\tDrop Off Station: Bambang");
                }
                else if (l.doff==10) {
                    System.out.println("\tDrop Off Station: Doroteo Jose");
                }
                else if (l.doff==11) {
                    System.out.println("\tDrop Off Station: Carriedo");
                }
                else if (l.doff==12) {
                    System.out.println("\tDrop Off Station: Central Terminal");
                }
                else if (l.doff==13) {
                    System.out.println("\tDrop Off Station: UN Avenue");
                }
                else if (l.doff==14) {
                    System.out.println("\tDrop Off Station: Pedro Gil");
                }
                else if (l.doff==15) {
                    System.out.println("\tDrop Off Station: Quirino");
                }
                else if (l.doff==16) {
                    System.out.println("\tDrop Off Station: Vito Cruz");
                }
                else if (l.doff==17) {
                    System.out.println("\tDrop Off Station: Gil Puyat");
                }
                else if (l.doff==18) {
                    System.out.println("\tDrop Off Station: Libertad");
                }
                else if (l.doff==19) {
                    System.out.println("\tDrop Off Station: EDSA");
                }
                else if (l.doff==20) {
                    System.out.println("\tDrop Off Station: Baclaran");
                }
                else if (l.doff==0) {
                    l.loc=21;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
                else
                {
                    System.out.println("\tInput Error! Please Try Again\n");
                }
                }
            while(l.doff < 0 || l.doff > 20);
            }
        while(l.doff < 0 || l.doff > 20 && l.loc < 0 || l.loc > 20);
        l.getComparison();
        l.getFare();
        System.out.print("\tHow many tickets you want to buy? ");
        l.setTicket(s.nextInt());
        l.getTicket();
        System.out.println("\n-------------------------------------------------");
        while(l.confirm !='y' && l.confirm !='Y' && l.confirm !='n' && l.confirm !='N') {
        System.out.print("Confirm your ticket [Y/N]: ");
        l.setConfirmation(s.next().charAt(0));
        System.out.println("-------------------------------------------------");
        l.getConfirmation();
        }
        }
        while (l.confirm=='n' || l.confirm=='N');
        l.getComparison();
        l.getFare();
        l.getTicket();
        }
        while (l.confirm=='y' || l.confirm=='Y');
    }
}