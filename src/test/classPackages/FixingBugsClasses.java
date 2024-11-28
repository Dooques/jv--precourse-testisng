package test.classPackages;

import java.util.*;
import test.TestObjects.*;

public class FixingBugsClasses {

   public static class GetFirstItemPartOne {
       public static <T> T solve(ArrayList<T> input){
           return input.getFirst();
       }
   }

   public static class GetFirstItemPartTwo {
       public static String solve(ArrayList<String> input){
           int inputLength = input.size();
           if (inputLength == 0) { 
               return null;
           }
           return input.getFirst();
       }
   }

   public static class PlaylistDuration {
       public static int solve(List<Song> allSongs) {
           int totalDuration = 0;

           for (Song song : allSongs) {
               if (song.getIsInPlaylist()) {
                   totalDuration += song.getLength();
               }
           }

           return totalDuration;
       } 
   }

   public static class SendPartyInvites {

       public static List<String> solve(List<String> friends){
           List<String> invitedFriends = new ArrayList<>();

           for (String friend : friends) {
               if (friend.length() % 2 == 0) {
                   invitedFriends.add(friend);
               }
           }

           return invitedFriends;
       }
   }

   public static class SplitString {

       public static char[] solve(String input){
           if (input == null) {
               return new char[0];
           }

           char[] charArray = new char[input.length()];

           for (int i = 0; i < input.length(); i++) {
               charArray[i] = input.charAt(i);
           }

           return charArray;
       }
   }

   public static class SumEvenNumbers {

       public static int solve(int start, int end){
           if (start > end) {
               throw new IllegalArgumentException("Invalid range: start should be less than or equal to end");
           }
           int sum = 0;
           for (int i = start; i <= end; i++) {
               if (i % 2 == 0) {  // Check if the number is even
                   sum += i;       // Add the even number to the sum
                   System.out.println(sum);
               }
           }
           return sum;
       }
   }
}
