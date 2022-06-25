package org.checker;

/*
 * How the University number should work:
 * Position 1 is multiplied by 9, plus
 * Position 2 times 7, plus
 * Position 3 times 3, plus
 * Position 4 times 9, plus
 * Position 5 times 7, plus
 * Position 6 times 3
 * modulus 10
 */

class Number {
    private final int i0;
    private final int i1;
    private final int i2;
    private final int i3;
    private final int i4;
    private final int i5;
    private final int i6;

    public Number(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
        this.i0 = i0;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
    }

    public static void main(String[] args) {
        Number universityNumber = new Number(1, 9, 4, 2, 0, 0, 2);
        if (universityNumber.isValid()) {
            System.out.println("This is a real university number!");
        } else {
            System.out.println("This number is incorrect!!!");
        }
    }

    boolean isValid() {
        int check = (this.i0 * 9 +
                this.i1 * 7 +
                this.i2 * 3 +
                this.i3 * 9 +
                this.i4 * 7 +
                this.i5 * 3) % 10;
        System.out.println(check);
        return check == this.i6;
    }
}
