/*
Author: Nischaal Cooray
Date: 5/31/2015
Description: A basic set of methods that provides the ability to parse, add, mulitply and find the normal of Gaussian integers.
*/

public class gInt {
    int a = 0;
    int b = 0;

    public gInt(int r) {
        a = r;
    }

    public gInt(int r, int i) {
        a = r;
        b = i;
    }
    
    //Return the real number component of the Gaussian Integer
    public int real(){
        return a;
    }

    public int imag() {
        return b;
    }
    
    //Add two Gaussian Integers
    //Pre-conditions: The two integers should be valid gInts().
    //Post-conditions:  The two Gaussian integers that were added should not be changed.
    //                  Returns the sum of the two Gaussian integers
    public gInt add(gInt rhs) {
	   //Formula for addition: (a + c) + (b + d)i
        gInt sum = new gInt((a + rhs.real()), (b + rhs.imag())); 
        return sum;
    }

    //Multiplies two Gaussian Integers
    //Pre-conditions: The two integers should be valid gInts().
    //Post-conditions:  The two Gaussians integers that were passed in should not be changed.
    //                  Returns the product of the two Gaussian integers.
    public gInt multiply(gInt rhs) {
		//Formula for multiplication: (ac - bd) + (ad + bc)i
        gInt product = new gInt((a * rhs.real()) - (b * rhs.imag()), (a * rhs.imag()) + (b * rhs.real()));
        return product;
    }

    //Calculates the normal of a Gaussian integer (the L2 distance using Pythagoras Theorem)
    //Pre-conditions: The integer should be a valid gInt().
    //Post-conditions:  The Gaussian integer passed in should not be changed.                      
    public float norm() {
	   return (float)(Math.sqrt((a * a) + (b * b)));
    }

    public static void main(String[] args) {
	  gInt firstNum = new gInt(2, 3);
      gInt secondNum = new gInt(5, 4);
      gInt sum = null;
      sum = firstNum.add(secondNum);
      System.out.println(sum.real() + " + " + sum.imag() + "i");
      gInt prod = null;
      prod = firstNum.multiply(secondNum);
      System.out.println(prod.real() + " + " + prod.imag() + "i");
      gInt normal = new gInt(9, 2);
      System.out.println(normal.norm());
    }
}
