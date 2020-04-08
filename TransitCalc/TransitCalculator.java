import java.util.Arrays;
/* 
Pay-per-ride (single ride): $2.75
7-day Unlimited Rides: $33.00
30-day Unlimited Rides: $127.00


*/
public class TransitCalculator {

    int totalDays;
    int totalRides;

    //By index singleRide, Week, monthly
    double prices[] = {2.75, 33, 127};
    //this should be like a JavaScript Object
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
        
        //how much to buy
        double cost = passes *  prices[1];

        //calculate how much each ride would cost
        cost = cost / totalRides;
        System.out.println(cost);
        return cost;
    }
    public static void main(String[] args) {
        System.out.println("This is my first test");

        TransitCalculator jake =  new TransitCalculator(19 , 20);

        jake.unlimited7Price();
    }
}