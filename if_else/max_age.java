// input four person AGE and check greatest age

import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter age of Ram:   ");
int ram = sc.nextInt();

System.out.print("Enter age of Mohan:   ");
int mohan = sc.nextInt();

System.out.print("Enter age of Kamal:   ");
int kamal = sc.nextInt();

System.out.print("Enter age of Raj:   ");
int raj = sc.nextInt();

if(ram>mohan)
  if(ram>kamal)  
     if(ram>raj) 
         System.out.print("Greatest age of Ram");
	 
if(kamal>ram)
  if(kamal>mohan)  
     if(kamal>raj) 
         System.out.print("Greatest age of Kamal");


if(mohan>ram)
  if(mohan>kamal)  
     if(mohan>raj) 
         System.out.print("Greatest age of Mohan");


if(raj>ram)
  if(raj>kamal)  
     if(raj>ram) 
         System.out.print("Greatest age of Raj");	 
	 
	 
}}