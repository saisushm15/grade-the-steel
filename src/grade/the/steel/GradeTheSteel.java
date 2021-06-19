/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.the.steel;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class GradeTheSteel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int hardness=input.nextInt();
            int tensile_strength=input.nextInt();
            float carbon_content=input.nextFloat();
            if(hardness>50 && carbon_content<0.7 && tensile_strength>5600)
            {
                System.out.println("10");
            }
            else if(hardness>50 && carbon_content<0.7)
            {
                System.out.println("9");
            }
            else if( carbon_content<0.7 && tensile_strength>5600)
            {
                System.out.println("8");
            }
            else if(hardness>50 && tensile_strength>5600)
            {
                System.out.println("7");
            }
            else if(hardness>50 || carbon_content<0.7 || tensile_strength>5600)
            {
                System.out.println("6");
            }
            else
            {
                System.out.println("5");
            }
        }
        t--;
    }
    
}
