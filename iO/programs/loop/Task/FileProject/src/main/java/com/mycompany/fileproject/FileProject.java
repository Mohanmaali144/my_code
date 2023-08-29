package com.mycompany.fileproject;

import java.io.*;
import java.util.Scanner;

class FileProject {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("creat your directory or file");

        System.out.println("choice are :");
        System.out.println("1 for creat a new file");
        System.out.println("2 for creat a new directory");
        System.out.println("\nEnter your choice ");
        int ch = sc.nextInt();
//        File fobj = new File("");
        switch (ch) {
            case 1 -> {
                System.out.println("choice are : \n");
                System.out.println("1 for .txt");
                System.out.println("2 for .doc");
                System.out.println("3 for .java");
                int ch2 = sc.nextInt();
                String s = "";
                switch (ch2) {
                    case 1 ->
                        s = ".txt";
                    case 2 ->
                        s = ".doc";
                    case 3 ->
                        s = ".java";
                    default ->
                        System.out.println("Invalid choice !!");
                }

                System.out.println("Enter file name");
                String s2 = sc.next();
            /*  File fobj = */
            File fobj = new File(s2 + s);
                fobj.createNewFile();
            }
            case 2 -> {
                System.out.println("Enter directory name");
                String s2 = sc.next();
            File fobj = new File(s2);
                fobj.mkdir();
            }
        }
        
        FileOutputStream fos = new FileOutputStream();
        String str = sc.next();
        //continuee.........
        fos.write(str.getBytes());
    }
}
