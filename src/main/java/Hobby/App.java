package Hobby;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {run();}
    public static void run (){
        Scanner scanner = new Scanner (System.in);

            System.out.println("Enter price");
            int price=scanner.nextInt();
            System.out.println("Enter phases quantity");
            short vrm_phases=scanner.nextShort();
            System.out.println("Enter year of production");
            long year_of_prod=scanner.nextLong();
            System.out.println("Enter motherboard height in cm");
            float mb_height_in_cm=scanner.nextFloat();
            System.out.println("Enter motherboard width in cm");
            double mb_width_in_cm=scanner.nextDouble();
            System.out.println("Is overclocking unlocked on this motherboard?");
            boolean unlocked_oc=scanner.nextBoolean();
            System.out.println("Enter hobby name");
            String hobby_name=scanner.next();
            System.out.println("Enter chipset");
            char chipset=scanner.next().charAt(0);
            Hobby hobby1 = new Hobby(price,vrm_phases,year_of_prod,mb_height_in_cm,mb_width_in_cm,unlocked_oc,hobby_name,chipset);
            Hobby hobby2 = new Hobby(300, (short)16,true,'X');
            Hobby hobby3 = new Hobby();

            Hobby[] array_of_hobby = {hobby1,hobby2,hobby3};
            for(int i=0;i<array_of_hobby.length;i++){
                System.out.println(array_of_hobby[i]);}
        }
        }



