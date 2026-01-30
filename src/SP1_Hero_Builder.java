public class SP1_Hero_Builder {

    void main(){

        String name = "Ledut";
        int healthPoints = 85;
        int maxHealth = 100;
        int level = 1;
        int experiencePoints = 150;
        double gold = 250.50;
        boolean isAlive = true;
        String specialization = "R";

        String[] inventory = {"Dagger", "Thieves Kit", "Smokebomb"};

        System.out.println("======= Character Sheet =======");
        System.out.println("Name: "+name);
        System.out.println("Class: "+specialization);
        System.out.println("Health: "+healthPoints+"/"+maxHealth);
        System.out.println("XP: "+experiencePoints);
        System.out.println("Gold: "+gold);
        System.out.println("Alive: "+isAlive);
        System.out.println();
        System.out.println("Inventory ("+inventory.length+" items):");

        for (int i = 0; i < inventory.length; i++){

            System.out.println("- "+inventory[i]);

        }



    }
}
