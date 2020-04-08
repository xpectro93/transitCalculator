/* 
PThis app will tell the use which metrocard will give them the best value


*/
public class TransitCalculator {

    int totalDays;
    int totalRides;

    //By index singleRide, Week, monthly
    double prices[] = {2.75, 33, 127};
    String cardName[] = {"One and Done", "Weekly Relief", "Raking in The monthly Benefits package"};
    //this should be like a JavaScript Object
    // constructor
    public TransitCalculator (final int days, final int rides) {
        this.totalDays = days;
        this.totalRides = rides;

    }

    // 7 day calc method
    public double unlimited7Price() {
        int passes = totalDays / 7;

        if (passes % 7 > 0) {
            passes += 1;
        }

        // how much to buy
        double cost = passes * prices[1];

        // calculate how much each ride would cost
        cost = cost / totalRides;

        return cost;
    }

    public double[] getRidesPrices() {
        final double maxSingleRide = totalRides * prices[0];
        final double maxMonthRide = prices[2];
        final double[] ridesCost = { maxSingleRide, unlimited7Price(), maxMonthRide };
        // this value will only show location of where the data is stored
        return ridesCost;
    }

    public String getBestFare() {
        int lowest = 0;
        for (int i = 0; i < prices.length; i++) {
            // System.out.print(prices[i]);
            if (getRidesPrices()[i] < getRidesPrices()[lowest]) {
                lowest = i;
            }
        }
        return "You should choose the " + cardName[lowest] + " at " + getRidesPrices()[lowest] + " per ridarino.";
    }

    public static void main(final String[] args) {

        final TransitCalculator jake = new TransitCalculator(22, 50);

        System.out.println(jake.unlimited7Price());

        //Wrapping our method in Arrays.toString() would allow us to see the values in the array
        // System.out.println(jake.getRidesPrices());
        System.out.println(jake.getBestFare());

    }
}