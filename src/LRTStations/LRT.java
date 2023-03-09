package LRTStations;
public class LRT {
    //declaration of states
    public char confirm;
    public int fare, ticket, loc, doff, diff, totalf;
    //setter
    public void setLocation(int value) {
        loc = value;
    }
    public void setDropOff(int value) {
        doff = value;
    }
    public void setTicket(int value) {
        ticket = value;
    }
    public void setConfirmation(char value){
        confirm = value;
    }
    //getter
    public int getComparison() {
        //process
        if (doff > loc)
        {
            diff = doff-loc;
            System.out.println("\tYou're about to travel " + diff + " Stations");
        }
        else
        {
            diff = loc-doff;
            System.out.println("\tYou're about to travel " + diff + " Stations");
        }
        return diff;
    }
    public int getFare() {
        //process
        if (diff>=1 && diff <=5) {
            fare = 15;
            System.out.println("\tOne ticket cost Php. " + fare);
        }
        else if(diff>=6 && diff <=11) {
            fare = 20;
            System.out.println("\tOne ticket cost Php. " + fare);
        }
        else {
            fare = 30;
            System.out.println("\tOne ticket cost Php. " + fare);
        }
        return fare;
    }
    public char getConfirmation() {
        if (confirm=='y' || confirm=='Y') {
            System.out.println("\t##### CUSTOMER'S RECEIPT #####");
        }
        else if (confirm=='n' || confirm=='N') {
            System.out.println("\t     ##### CANCELED #####");
        }
        else {
            System.out.println("Invalid Input! Please Try Again");
            System.out.println("-------------------------------------------------");
        }
        return confirm;
    }
    public int getLocation() {
        return loc;
    }
    public int getDropOff() {
        return doff;
    }
    public int getTicket() {
        totalf = ticket * fare;
        System.out.println("\tYour total fare is: " + totalf);
        return ticket;
    }
}