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
       
        return cost;
    }
    public double[] getRidesPrices () {
        double[] ridesCost = { totalRides * prices[0], unlimited7Price(), prices[2]};
        //this value will only show location of where the data is stored
        return ridesCost;
    }

    public static void main(String[] args) {
        System.out.println("This is my first test");

        TransitCalculator jake =  new TransitCalculator(22 , 50);

        System.out.println(jake.unlimited7Price());

        //Wrapping our method in Arrays.toString() would allow us to see the values in the array
        System.out.println(jake.getRidesPrices());
    }
}