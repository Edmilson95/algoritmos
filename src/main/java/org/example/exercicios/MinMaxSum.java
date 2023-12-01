package org.example.exercicios;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class MinMaxSum {
        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
        public static void miniMaxSum(List<Integer> arr) {
            long max = arr.get(0);
            long min = arr.get(0);
            long sum = arr.get(0);

            for(int i = 1; i < arr.size(); ++i)    {
                int current = arr.get(i);
                sum += current;
                if (current < min){
                    min = current;
                }
                else if (current > max){
                    max = current;
                }
            }

            long maxSum = sum - max;
            long minSum = sum - min;
            System.out.println(maxSum + " " + minSum);
        }



    }

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            MinMaxSum.miniMaxSum(arr);

            bufferedReader.close();
        }
    }

