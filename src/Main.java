/*
/
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static int calcualte_buses_needed(int people){
        int capacity = 45;
        int busNeeded = people/capacity;
        int busNeedeMoudle = people % capacity;
        if (busNeedeMoudle > 0) {
            busNeeded += 1;
        }
        return busNeeded;
    };

    public static int cost_per_person(int people, int bus){
        DecimalFormat df = new DecimalFormat("#.00");
        int cost = (125/people)*bus;
        String rounded = df.format(cost);
        int roundedAsInt = (int) Math.round(Double.parseDouble(rounded));
        return roundedAsInt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people need:");
        int NumOfPeople = input.nextInt();
       int busNeeded = calcualte_buses_needed(NumOfPeople);
       int personCost = cost_per_person(NumOfPeople, busNeeded);

        System.out.println("You need " + busNeeded + "buses");
        System.out.println("Each people need to pay $" + personCost);
    }
}