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

    public int real(){
        return a;
    }

    public int imag() {
        return b;
    }

    public gInt add(gInt rhs) {
				//Formula for addition: (a + c) + (b + d)i
        gInt sum = new gInt((a + rhs.real()), (b + rhs.imag())); 
        return sum;
    }

    public gInt multiply(gInt rhs) {
				//Formula for multiplication: (ac - bd) + (ad + bc)i
        gInt product = new gInt((a * rhs.real()) - (b * rhs.imag()), (a * rhs.imag()) + (b * rhs.real()));
        return product;
    }

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
