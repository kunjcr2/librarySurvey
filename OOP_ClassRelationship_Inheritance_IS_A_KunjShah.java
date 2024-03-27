/****************************************************************
 * File: OOP_ClassRelationship_Inheritance_IS_A_KunjShah.java
 * By: Kunj Shah
 * Date: 03/26/2024
 * Description: This code is just a small survey on what people's
 *              test in music is.
 ****************************************************************/
import java.util.*;

public class OOP_ClassRelationship_Inheritance_IS_A_KunjShah {

    static Scanner sc = new Scanner(System.in);

    static void run(){
        //starting
        System.out.println("-".repeat(80));
        System.out.println(" - Welcome to a quick survey for your music test !!!!!!!...");
        System.out.println("         NOTE: Please fill it up as mentioned");
        System.out.println("-".repeat(80));

        System.out.print(" * What kind of Song do you like ? (Hip Hop, Rap, Old or Sad): ");
        String favType = sc.nextLine();
        System.out.println();

        //inputs
        System.out.print(" * What is your favourite Music?: ");
        String fhh = sc.nextLine();
        System.out.print(" * What album is that?:           ");
        String albm = sc.nextLine();
        System.out.print(" * What year was that?:           ");
        int yr = sc.nextInt();
        while((yr<1000||yr>2024)){
            System.out.println("What the heck !!!\nWRITE PROPER YEAR");
            System.out.print(" * What year was that?:           ");
            yr = sc.nextInt();
        }
        sc.nextLine();
        System.out.print(" * Who is the singer?:            ");
        String sng = sc.nextLine();
        System.out.println();

        //printing and object creating stuff
        if(favType.replace(" ","").equalsIgnoreCase("hiphop")){
            HipHop hphpmsc = new HipHop(fhh,albm,yr,sng);
            System.out.println(hphpmsc.toString());
        }else if(favType.replace(" ","").equalsIgnoreCase("rap")){
            RapMusic rpmsc = new RapMusic(fhh,albm,yr,sng);
            System.out.println(rpmsc.toString());
        }else if(favType.replace(" ","").equalsIgnoreCase("sad")){
            Sad sdmsc = new Sad(fhh,albm,yr,sng);
            System.out.println(sdmsc.toString());
        }else if(favType.replace(" ","").equalsIgnoreCase("old")){
            Old oldmsc = new Old(fhh,albm,yr,sng);
            System.out.println(oldmsc.toString());
        }else{
            System.out.println("I couldnt understand the Type.\nIf you think its correct, type YES");
            if(sc.nextLine().equalsIgnoreCase("yes")){
                Other othrmsc = new Other(fhh,albm,yr,sng);
                System.out.println(othrmsc.toString());
            }else{
                System.out.println("TRY AGAIN");
                run();
            }
        }

        //ending message
        System.out.println("-".repeat(80));
        System.out.println(" - RESULT - ");
        System.out.println("-".repeat(80));
        confirmSubmit();
    }
    static void confirmSubmit() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Type 'SUBMIT' to submit the form: ");
        if (!sc.nextLine().equals("SUBMIT")) {
            System.out.print("Do you want to retry? Type 'YES' to retry:           ");
            if (sc.nextLine().equals("YES")) {
                run();
            }
            System.out.println("-".repeat(80));
            System.out.println(" THANK YOU FOR YOUR RESPONSE ");
            System.out.println(" ".repeat(50) + "-Kunj Shah");
            System.out.println("-".repeat(80));
        }
    }

    public static void main (String[]args){
        run();
    }
}
