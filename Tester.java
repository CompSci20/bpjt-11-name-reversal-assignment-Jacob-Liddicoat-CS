//Author: Jacob Liddicoat
//Date Created: Apr 7,2018
import java.io.*;
import java.util.*;
public class Tester
{
 public static void main(String args[])
 {
  Scanner kbReader = new Scanner(System.in);
  System.out.print("Please enter your name. ");
  String name = kbReader.nextLine();
  
  int strLen = name.length();
  String reversedName ="";
  for(int j =strLen - 1;j>= 0;j--)
  {
   
