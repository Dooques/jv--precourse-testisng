package test.classPackages;

import test.TestObjects.*;

import java.util.*;

public class ExerciseClasses {

    public static class FindFirstDentist {

        public static String solve(ArrayList<Person> input) {

            // Insert your code here to return the name of the first dentist in the list
            for (var currentPerson : input) {
                if (currentPerson.isDentist) {
                    return currentPerson.name;
                }
            }
            return null;
        }
    }

    public static class FlipBooleans {

        public static boolean[] solve(boolean[] input) {

            // Insert your code here

            boolean[] newArray = new boolean[input.length];
            int i = 0;

            for (boolean value : input) {
                newArray[i] = !value;
                i++;
            }

            // Implement a function which flips each boolean value in an array
            // e.g. { true, false } should become { false, true}

            return newArray;
        }
    }

    public static class GetFactorials {

        public static ArrayList<Integer> solve(ArrayList<Integer> input){

            // Insert your code here
            ArrayList<Integer> returnList = new ArrayList<>();
            for (int number : input) {
                System.out.println("current number: " + number);
                int finalNumber = number;
                if (finalNumber != 1) {
                    for (int i = 0; i < number; i++) {
                        number--;
                        System.out.println("Index: " + number);
                        System.out.println("Sum: " + finalNumber + " * " + number);
                        finalNumber *= number;
                        System.out.println("Result: " + finalNumber);
                        System.out.println();
                    }
                }
                returnList.add(finalNumber);
            }
            return returnList;
        }
    }

    public static class GetPalindromes {

        public static ArrayList<String> solve(ArrayList<String> input) {

            // Insert your code here to return the list of palindromes
            ArrayList<String> returnList = new ArrayList<>();
            for (String item : input) {
                String stringReversed = new StringBuilder(item).reverse().toString();

                System.out.println("f: " + item);
                System.out.println("b: " + stringReversed);
                System.out.println("f: " + item.length() + " b: " + stringReversed.length());
                System.out.println(item.getClass().getSimpleName() + " " + stringReversed.getClass().getSimpleName());

                if (item.equals(stringReversed)) {
                    System.out.println("palindrome verified");
                    returnList.add(item);
                }
            }
            return returnList;
        }
    }

    public static class GetPugOwners {

        public static ArrayList<String> solve(ArrayList<Dog> input) {

            // Insert your code here to return the names of pug owners
            ArrayList<String> returnList = new ArrayList<>();
            for (Dog dog : input) {
                if (dog.breed.equals("Pug")) {
                    returnList.add(dog.owner);
                }
            }
            return returnList;
        }
    }

    public static class GetWilliams {

        public static ArrayList<String> solve(ArrayList<String> input) {

            // Insert your code here
            ArrayList<String> returnList = new ArrayList<>();
            for (String name : input) {
                String lastName = name.split(" ")[1];
                if (lastName.equals("Williams")) {
                    returnList.add(name);
                }
            }
            return returnList;
        }
    }

    public static class GetWordLengths {

        public static ArrayList<Integer> solve(String input) {

            // Insert your code here to return the lengths of each word in the string
            ArrayList<Integer> returnList = new ArrayList<>();
            int stringLength = input.length();
            if (stringLength == 0) {
                return returnList;
            }
            String[] splitString = input.split(" ");
            for (String string : splitString) {
                returnList.add(string.length());
            }
            return returnList;
        }
    }

    public static class IsValidMobileNumber {

        public static boolean checkInt(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public static boolean solve(String input) {
            // Insert your code here
            switch (input.length()) {
                case 11:
                    if (checkInt(input)) {
                        if (input.startsWith("07")) {
                            return true;
                        }
                    }
                    break;

                case 13:
                    if (input.startsWith("+44")) {
                        return true;
                    }
                    break;
                case 14:
                    if (input.startsWith("0044")) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
            return false;
        }
    }

    public static class LargestNumber {

        public static int solve(int input) {

            // Insert your code here
            System.out.println(input);
            //
            String numberAsString = String.valueOf(input);
            String[] splitString = numberAsString.split("");
            Arrays.sort(splitString);
            int arrayLength = splitString.length;
            String[] sortedArray = new String[arrayLength];
            int index = arrayLength - 1;
            for (String i : splitString) {
                sortedArray[index] = i;
                index--;
            }
            String joinedString = String.join("", sortedArray);
            return Integer.parseInt(joinedString);
        }
    }

    public static class LocateWrongFruit {

        public static int solve(ArrayList<String> input) {

            // Insert your code here
            int l = input.size();
            if (l <= 2) {
                return 0;
            }
            for (int i = 0; i < l; i++) {
                if (!Objects.equals(input.get(i), input.getFirst())) {
                    return i;
                }
            }
            return 0;
        }
    }

    public static class MatchDNAPairs {

        public static ArrayList<String> solve(String input) {

            // Insert your code here
            ArrayList<String> returnList = new ArrayList<>();

            ArrayList<String> splitInput = new ArrayList<>(Arrays.asList(input.split("")));

            ArrayList<String> dnaTypes = new ArrayList<>(Arrays.asList("G", "C", "T", "A"));

            String matchingLetter = null;

            for (String i : splitInput) {
                if (dnaTypes.contains(i.toUpperCase())) {
                    switch (i.toUpperCase()) {
                        case "G":
                            matchingLetter = "C";
                            System.out.println("G -> C");
                            break;
                        case "C":
                            matchingLetter = "G";
                            System.out.println("C -> G");
                            break;
                        case "T":
                            matchingLetter = "A";
                            System.out.println("T -> A");
                            break;
                        case "A":
                            matchingLetter = "T";
                            System.out.println("A -> T");
                            break;
                        default:
                            break;
                    }
                    System.out.println(matchingLetter);

                    if (matchingLetter != null) {
                        returnList.add(i.toUpperCase() + matchingLetter);
                    }
                }
            }

            return returnList;

        }
    }

    public static class ReplaceLettersWithX {

        public static String solve(String input) {

            // Insert your code here
            ArrayList<String> alphabet = new ArrayList<>(
                    Arrays.asList(
                            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
                    )
            );
            ArrayList<String> splitString = new ArrayList<>(Arrays.asList(input.split(" ")));
            ArrayList<String> returnList = new ArrayList<>();

            for (String i : splitString) {
                ArrayList<String> wordToConcat = new ArrayList<>();
                String[] word = i.split("");
                for (String n : word) {
                    if (alphabet.contains(n.toUpperCase())) {
                        wordToConcat.add("X");
                    } else {
                        wordToConcat.add(n);
                    }
                }
                returnList.add(String.join("", wordToConcat));
            }
            String returnWord = String.join(" ", returnList);
            System.out.println("To return: " + returnWord);
            return returnWord;
        }
    }

    public static class SumDigitsFromString {

        public static int solve(String input) {

            // Insert your code here
            int returnInt = 0;
            ArrayList<String> numberList = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));

            ArrayList<String> stringList = new ArrayList<>(Arrays.asList(input.split("")));
            System.out.println(stringList);


            if (input.isEmpty()) {
                return returnInt;
            }

            for (String i : stringList) {
                if (numberList.contains(i)) {
                    int digitToAdd = Integer.parseInt(i);
                    returnInt += digitToAdd;
                }
            }

            return returnInt;
        }
    }

    public static class TallyHashtagsAndMentions {

        public static Map<String, Integer> solve(String input) {

            Map<String, Integer> map = new HashMap<>();

            // Insert your code here to return  the number of hashtags and mentions

            int numMentions = 0;
            int numHashtags = 0;
            ArrayList<String> splitInput = new ArrayList<>(Arrays.asList(input.split(" ")));

            for (String word : splitInput) {
                String[] splitWord = word.split("");
                for (String i : splitWord) {
                    System.out.print(i);
                }
                System.out.println();
                if (splitWord[0].equals("@")) {
                    System.out.println("@ Found, total: " + numMentions);
                    numMentions += 1;
                } else if (splitWord[0].equals("#")) {
                    System.out.println("# Found, total: " + numHashtags);
                    numHashtags += 1;
                }
            }

            map.put("hashtags", numHashtags);
            map.put("mentions", numMentions);

            return map;
        }
    }

    public static class TallyPeopleInManchester {

        public static int solve(ArrayList<PersonCity> input) {

            // Insert your code here to return the count of people who live in Manchester
            int numPeople = 0;
            for (PersonCity person : input) {
                if (person.city.equals("Manchester")) {
                    numPeople += 1;
                }
            }
            return numPeople;
        }
    }

    public static class TranslateKey {

        public static EnglishStudent solve(FrenchStudent input) {

            // Insert your code here to convert the test.TestObjects.FrenchStudent to an test.TestObjects.EnglishStudent
            FrenchStudent f = input;
            EnglishStudent e = new EnglishStudent(f.prénom, f.age, f.location);
            return e;
        }
    }
}