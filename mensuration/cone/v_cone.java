//volume of cone

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

class VolumeCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float r = sc.nextFloat();
        System.out.println("Enter Height: ");
        float h = sc.nextFloat();
        float v = 3.14f * (r * r) * (h / 3);
        System.out.println("volume  = " + v);
        
    }

}
