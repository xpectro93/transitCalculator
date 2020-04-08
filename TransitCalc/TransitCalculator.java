import java.util.*;

public class TransitCalculator {

    int totalDays;
    int totalRides;
    Dictionary metroCards = new Hashtable();
    // constructor
    public TransitCalculator (int days, int rides){
        this.totalDays = days;
        this.totalRides = rides;

    }


    // 7 day calc method
    public double unlimited7Price () {
        int passes = totalDays / 7;

        if(passes % 7 > 0){
            passes += 1;
        }


        
        double cost = passes *  ;



        return cost;
    }
    public static void main(String[] args) {
        System.out.println("This is my first test");
    }
}