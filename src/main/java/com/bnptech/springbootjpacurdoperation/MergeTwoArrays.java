//package com.bnptech.springbootjpacurdoperation;
//
//import com.bnptech.springbootjpacurdoperation.utility.EmployeeClassDemo;
//
//import java.util.Arrays;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class MergeTwoArrays {
//    public static void main(String[] args) {
//
//        // Merge 2 array
//        //Approach 1 - Merge two integer arrays
//        //Solution Steps
//        //Define Two Input Arrays: Provide two arrays that need to be merged.
//        //Use Java 8 Streams: Use Stream.concat() to merge the two arrays into one stream.
//        //Convert to Array: Collect the merged stream into a new array.
//        //Display the Result: Print the merged array.
//        int firstArray[] = {1, 3, 5, 7, 9};
//        int secondArray[] = {2, 4, 6, 8, 10};
//        int[] mergedIntArray = IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray
//        )).toArray();
//        System.out.println("After Merged IntArrayResults::" + Arrays.toString(mergedIntArray));
//
//        // Using System.arraycopy() method
//        // resultant array of size first array and second array
//        int[] resultArray = new int[firstArray.length + secondArray.length];
//        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
//        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
//        System.out.println("Result Merged Array::" + Arrays.toString(resultArray));
//        //System.out.println("Ascending Ordered Result Merged Array::" + Arrays.toString(Arrays.stream(resultArray).sorted().toArray()));
//
//        /*Integer[] result = MergeTwoArrays.toObject(resultArray);
//        Integer[] results = Arrays.stream(result).sorted().toArray(Integer[]::new);
//        System.out.println("Object Array::" + results.toString());*/
//        /*Integer[] ascendingArrayValue = Arrays.stream(resultArray).sorted().toArray(IntStream[]::new);
//        Integer[] result = Arrays.stream(resultArray).boxed().toArray(Integer[]::new);
//        System.out.println("Result::" + result.toString());*/
//
//        //Approach 2 - Merge two String arrays
//        //Arrays.stream(array1): Converts the first array into an IntStream.
//        //Arrays.stream(array2): Converts the second array into an IntStream.
//        //IntStream.concat(): Merges the two streams into one stream.toArray(): Converts the merged stream back into an array.
//        //Arrays.toString(): Prints the resulting merged array.
//        String arr1[] = {"Apple", "Orange", "Grapes"};
//        String arr2[] = {"Banana", "Pinaple", "Mango"};
//        String mergedStringArray[] = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(String[]::new);
//        System.out.println("After Merged StringArrayResults::" + Arrays.toString(mergedStringArray));
//
//        //Approach 3 - Merge Two Arrays of Custom Objects (Using Employee Class)
//        // Step 1: Define two input arrays of Employee objects
//        EmployeeClassDemo[] employees1 = {new EmployeeClassDemo(1000, "Jagannath", 30000.00)};
//        EmployeeClassDemo[] employees2 = {new EmployeeClassDemo(2000, "Krishna", 40000.00)};
//        // Step 2: Merge the two arrays using Streams
//        EmployeeClassDemo[] employeesMerged = Stream.concat(Arrays.stream(employees1), Arrays.stream(employees2)).toArray(EmployeeClassDemo[]::new);
//        // Step 3: Display the merged array of Employee objects
//        System.out.println("Emploee Object Array::" + Arrays.toString(employeesMerged));
//
//
//    }
//
//    public static Integer[] toObject(int[] intArray) {
//
//        Integer[] result = new Integer[intArray.length];
//        for (int i = 0; i < intArray.length; i++) {
//            result[i] = Integer.valueOf(intArray[i]);
//        }
//        return result;
//    }
//
//    public static int[] toPrimitive(Integer[] IntegerArray) {
//
//        int[] result = new int[IntegerArray.length];
//        for (int i = 0; i < IntegerArray.length; i++) {
//            result[i] = IntegerArray[i].intValue();
//        }
//        return result;
//    }
//}
//
