import java.util.Scanner;


public class exercise8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("How many people?");
        String people = input.next();
        int convPeople = Integer.parseInt(people);

        Scanner input2 = new Scanner (System.in);
        System.out.println("How many pizzas do you have?");
        String pizza = input2.next();
        int convPizza = Integer.parseInt(pizza);

        Scanner input3 = new Scanner (System.in);
        System.out.println("How many slices per pizza?");
        String slices = input3.next();
        int convSlices = Integer.parseInt(slices);

        int numSlices = convPizza * convSlices;

        System.out.println(convPeople+" people with "+convPizza+" pizzas "+"("+numSlices+" slices)" );

        int pricesPer = numSlices/convPeople;
        int leftover = numSlices % convPeople;

        System.out.println("Each person gets "+pricesPer+" pieces of pizza." );
        System.out.println("There are "+leftover+" leftover pieces." );


    }
}
