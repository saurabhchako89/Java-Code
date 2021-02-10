package com.java.poc.algo.array;

public class Active_Inactive_Cells_After_N_Days {

    public static void main(String[] args) {
        int[] states = new int[]{1, 0, 0, 0, 1, 0, 0,};
        int days = 2;
        cellCompete(states, days);
    }

    /// <summary>
    /// Method to get the state pf the cells after given number of days.
    /// </summary>
    /// <param name="states">current state of the cells</param>
    /// <param name="days">number of days</param>
    /// <returns>state of cells after given number of days</returns>
    static int[] cellCompete(int[] states, int days) {
        // if the number of cells is not equals to 8
        // or number of days is less than 1
        if (states.length != 8 || days < 1) {
            return states;
        }

        // local variables
        int index, previousValue, nextValue;

        // loop for each day
        for (int i = 0; i < days; i++) {
            // index of current cell
            index = 0;
            // value of the previous cell
            previousValue = 0;
            // value of the next cell
            nextValue = 0;

            // loop for each cell in the array
            while (index < states.length) {
                // if the current index is not last index of the given array,
                // set the value of nextValue, else it would remain 0.
                if (index < states.length - 1) {
                    nextValue = states[index + 1];
                }

                // if nextValue is same as previousValue
                if (nextValue == previousValue) {
                    // save the current index value for next iteration of loop
                    previousValue = states[index];
                    // set current index value
                    states[index] = 0;
                } else {
                    // save the current index value for next iteration of loop
                    previousValue = states[index];
                    // set current index value
                    states[index] = 1;
                }

                // next item in the loop
                index++;
            }
        }

        // return states array
        return states;
    }
}
