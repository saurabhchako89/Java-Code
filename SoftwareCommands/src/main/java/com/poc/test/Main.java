package com.poc.test;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            //read input from stdin
            Scanner scan = new Scanner(System.in);

            while (true) {
                String line = scan.nextLine();

                //no action for empty input
                if (line == null || line.length() == 0) {
                    continue;
                }

                //the END command to stop the program
                if ("END".equals(line)) {
                    System.out.println("END");
                    break;
                }

                //Please provide your implementation here
                DependencyManager dm = new DependencyManager();
                dm.checkDependency(line);
            }

        }
    }