package modelo;

import java.util.*;

public class Magic {
int s,no, sum, magicSum =0;
boolean isMagic = true;

public void setNo(){

  
}

  public Magic(){}
  // Method for generating the odd-sized magic squares
  public void makeSquare(int s) {
    int magicSqr[][] = new int[s][s];
    // Initialize position for 1
    int r = s / 2;
    int c = s - 1;
    // One by one put all values in magic square
    for (no = 1; no <= s * s;) {
      if (r == -1 && c == s) // 3rd rule
      {
        c = s - 2;
        r = 0;
      } else {
        // 1st rule helper if the next number
        // is going out of the range
        if (c == s) {
          c = 0;
        }

        // 1st rule helper if the next number is
        // going out of the range
        if (r < 0) {
          r = s - 1;
        }
      }

      // the 2nd rule
      if (magicSqr[r][c] != 0) {
        c = c - 2;
        r = r + 1;
        continue;
      } else {
        // setting the number
        magicSqr[r][c] = no;
        no = no + 1;
      }

      // the first condition
      c = c + 1;
      r = r - 1;
    }

    		    //find the sum that makes the square magic
            for (c = 0; c < s; c++) {
              magicSum += magicSqr[0][c];
          }
            //check if every row makes the magic sum
            for (r = 1; r < s; r++) {
              for (c = 0; c < s; c++) {
                  sum += magicSqr[r][c];
              }
              if (sum != magicSum) {isMagic = false;
              sum = 0;}
          }
            //check if every column makes the magic sum
            for (c = 0; c < s; c++) {
              for (r = 0; r < s; r++) {
                  sum += magicSqr[r][c];
              }
              if (sum != magicSum) {isMagic = false;
              sum = 0;}
          }
          //check the sum of the diagonals
         for (int i = 0; i < s; i++) {
              sum += magicSqr[i][i];
          }
          if (sum != magicSum) {isMagic = false;
          sum = 0;}
    
          for (int i = 0; i < s; i++) {
              sum += magicSqr[i][s - i - 1];
          }
          if (sum != magicSum) {
              isMagic = false;
          }
    

    // printing the magic square
    System.out.println("The Magic Square for " + s + ": \n");
    System.out.println("Sum of each column or row " + s * (s * s + 1) / 2 + ": \n");
    for (r = 0; r < s; r++) {
      for (c = 0; c < s; c++) {
        System.out.print(magicSqr[r][c] + " ");
      }
      System.out.println();
    }
  }




}