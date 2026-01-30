public class VariableBasics {

    void main() {

        //opgave 1
        /*
        double bread = 6.50;
        double milk = 3.00;
        double eggs = 12.5;

        double subtotal = bread+milk+eggs;

        double moms = 25;

        double withTax = subtotal + (subtotal * moms / 100);

        System.out.println("Subtotal - "+subtotal+" kr");
        System.out.println("With tax - "+withTax+" kr");

         */


        //opgave 2
        /*

        double food = 350.00;
        double drinks = 125.00;
        double tip = 35.00;
        int people = 5;

        double totalCost = food+drinks+tip;
        double costPerPerson = totalCost/people;

        System.out.println(costPerPerson);

         */

        //opgave 3
        /*

        double price = 300;
        double discount = 20;
        double priceDiscounted = price-(price*discount/100);

        double tax = 25;
        double finalPrice = priceDiscounted+(priceDiscounted*tax/100);

        System.out.println(price);
        System.out.println(priceDiscounted);
        System.out.println(finalPrice);

         */

        //opgave Array
        /*
        String[] names = {"August","Lukas","Jesper"};

        String[] sortedNames = new String[3];
        sortedNames[0] = "Jesper";
        sortedNames[1] = "Lukas";

        String a = sortedNames[0];

        System.out.println(names[0]);
        System.out.println(sortedNames[1]);
        System.out.println(a);

        for (int i = 0; i < names.length; i++){

            System.out.println("Person "+(i+1)+" = "+names[i]);

        }

        System.out.println("Length of Array "+names.length);
    }

         */
}
