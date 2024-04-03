package Activities.Stats_Activity;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StatsProgram {

   // Input 5 Integers and return the Integers in an ArrayList
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
      /* Type your code here. */
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i < 5; i++) {
         list.add(scnr.nextInt());
      }
      return list;
   }

   // Input 5 Doubles and return the Doubles in an ArrayList
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
      /* Type your code here. */
      ArrayList<Double> list = new ArrayList<Double>();
      for(int i = 0; i < 5; i++) {
         list.add(scnr.nextDouble());
      }
      return list;
   }

   // Input 5 Strings, and return the Strings in an ArrayList
   public static ArrayList<String> inputWords(Scanner scnr) {
      /* Type your code here. */
      ArrayList<String> list = new ArrayList<String>();
      for(int i = 0; i < 5; i++) {
         list.add(scnr.next());
      }
      return list;
   }

   // Output the elements of the ArrayList parameter
   public static <TheType extends Comparable<TheType>>
      void print(ArrayList<TheType> list) {
      /* Type your code here. */
      for(int i = 0; i < list.size(); i++) {
         System.out.print(list.get(i) + " ");
      }
      System.out.println();
   }

   // Return the min, median, and max of the ArrayList parameter in a new ArrayList
   public static <TheType extends Comparable<TheType>>
      ArrayList<TheType> getStatistics(ArrayList<TheType> list)
   {
      /* Type your code here. */
      ArrayList<TheType> newList = new ArrayList<TheType>();

      Collections.sort(list);
      
      newList.add(list.get(0));
      newList.add(list.get(list.size() / 2));
      newList.add(list.get(list.size() - 1));

      return newList;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();

      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
