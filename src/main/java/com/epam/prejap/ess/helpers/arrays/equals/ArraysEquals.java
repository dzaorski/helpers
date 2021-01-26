package com.epam.prejap.ess.helpers.arrays.equals;

import java.util.Arrays;

import static java.lang.System.*;

/**
 * <p>Equals, deepEquals and Arrays</p>
 *
 * <i>Equals</i> method from Arrays in not enough
 * for comparing nested arrays.
 * deepEquals is the method needed to do that.
 *
 * Equals method is checking if all corresponding pairs of
 * elements in array are the same. But if those elements are
 * Objects (like arrays), that are not equals,
 * method returns false, even if they contains the same values itself.
 *
 * deepEquals method steps into every Object and does
 * equality check at all levels.
 *
 * @author Dawid Zaorski
 */
class ArraysEquals {
    public static void main(String[] args) {
        //Preparing 1-dimensional arrays
        int[] firstArray1D = {1, 2, 3, 4};
        int[] secondArray1D = {1, 2, 3, 4};

        //Preparing 2-dimensional arrays
        int[][] firstArray2D = {firstArray1D, firstArray1D};
        int[][] secondArray2D = {secondArray1D, secondArray1D};

        //Comparing 1-dimensional arrays with == --> false
        out.println(firstArray1D == secondArray1D);

        //Comparing 2-dimensional arrays with == --> false
        out.println(firstArray2D == secondArray2D);

        //Comparing 1-dimensional arrays with equals --> true
        out.println(Arrays.equals(firstArray1D, secondArray1D));

        //Comparing 2-dimensional arrays with equals --> false
        out.println(Arrays.equals(firstArray2D, secondArray2D));

        //Comparing 1-dimensional arrays with deepEquals --> true
        out.println(Arrays.deepEquals((new Object[]{firstArray1D}), new Object[]{ secondArray1D}));

        //Comparing 2-dimensional arrays with deepEquals --> true
        out.println(Arrays.deepEquals(firstArray2D, secondArray2D));
    }
}
