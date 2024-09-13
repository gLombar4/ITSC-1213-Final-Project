import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
        boolean looper = true;
        BufferedWriter writer = new BufferedWriter(new FileWriter("monsters.txt"));
        Scanner scnr = new Scanner(System.in);
        while(looper == true){
        System.out.println("We're gonna add a new monster to the compendium.");
        System.out.print("Choose which kind of monster you want to add:\n");
        System.out.println("0. Exit Program\n1. Flying Wyvern\n2. Brute Wyvern\n3. Piscine Wyvern");

        int choice = scnr.nextInt();
            
        switch(choice){
            case 0:
                looper = false;
                break;
            case 1:
                scnr.nextLine();
                System.out.println("Enter the name: ");
                String fName = scnr.nextLine();
                Wyvern.check(fName);
                System.out.println("Enter the monster's element: ");
                String fElement = scnr.nextLine();
                Wyvern.check(fElement);
                System.out.println("Enter the monster's habitat: ");
                String fHabitat = scnr.nextLine();
                Wyvern.check(fHabitat);
                FlyingWyvern f = new FlyingWyvern(fName, fElement, fHabitat);
                writer.write(f.getName() + ", " + f.getElement() + ", " + f.getHabitat() + ", Flying Wyvern"+ "\n");
                continue;

            case 2:
                scnr.nextLine();
                System.out.println("Enter the name: ");
                String bName = scnr.nextLine();
                Wyvern.check(bName);
                System.out.println("Enter the monster's element: ");
                String bElement = scnr.nextLine();
                Wyvern.check(bElement);
                System.out.println("Enter the monster's habitat: ");
                String bHabitat = scnr.nextLine();
                Wyvern.check(bHabitat);
                BruteWyvern b = new BruteWyvern(bName, bElement, bHabitat);
                writer.write(b.getName() + ", " + b.getElement() + ", " + b.getHabitat() + ", Brute Wyvern"+ "\n");
                continue;
            
            case 3:
                scnr.nextLine();
                System.out.println("Enter the name: ");
                String pName = scnr.nextLine();
                Wyvern.check(pName);
                System.out.println("Enter the monster's element: ");
                String pElement = scnr.nextLine();
                Wyvern.check(pElement);
                System.out.println("Enter the monster's habitat: ");
                String pHabitat = scnr.nextLine();
                Wyvern.check(pHabitat);
                PiscineWyvern p = new PiscineWyvern(pName, pElement, pHabitat);
                writer.write(p.getName() + ", " + p.getElement() + ", " + p.getHabitat() + ", Piscine Wyvern" + "\n");
                continue;
        
            
        }
        writer.close();
        }
        }

        catch(IOException e){
            e.printStackTrace();
   
            }

        //Switches to reading the file written by user
        System.out.println("Here is your Monster Compendium: ");
        try{
            File file = new File("monsters.txt");
            Scanner scan = new Scanner(file);
            Scanner secondScan = new Scanner(file);
            Scanner userInput = new Scanner(System.in);
            while(scan.hasNext()){
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                System.out.println(lineArray[0]);
            }
            System.out.println("Whose entry would you like to view? (Case Sensitive)");
            String monName = userInput.nextLine();
            while(secondScan.hasNext()){
                String line = secondScan.nextLine();
                String[] lineArray = line.split(",");
                
                if(monName.equals(lineArray[0])){
                    System.out.println("This monster is a" + lineArray[3] + " that lives in the" + lineArray[1] + " and belongs to the" + lineArray[2] + " element.");
                    
                }
            
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
        
}
        

    

        
        
        

        // FlyingWyvern f1 = new FlyingWyvern("Seregios","Dunes","Bleed");  
        // BruteWyvern b1 = new BruteWyvern("Glavenus","Jungle","Fire");
        // PiscineWyvern p1 = new PiscineWyvern("Plesioth", "Deserted Island", "Water");

        // System.out.println(f1.display());
        // System.out.println(b1.display());
        // System.out.println(p1.display());
        // writer.close();
        
        
        
        



    

