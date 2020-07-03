// Code provided by instructor and modified to use BigInteger

import java.math.*;

public class RationalBigInteger extends Number implements Comparable<RationalBigInteger> {
  // Data fields for numerator and denominator
  private BigInteger numerator = new BigInteger("0");
  private BigInteger denominator = new BigInteger("1");
  /** Construct a rational with default properties */
  public RationalBigInteger() {
    this(BigInteger.ZERO, BigInteger.valueOf(1));
  }
  /** Construct a rational with specified numerator and denominator */
  public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);
    this.numerator = BigInteger.valueOf((denominator.compareTo(BigInteger.ZERO)))
    		.multiply(numerator).divide(gcd);
    this.denominator = denominator.abs().divide(gcd);
  }
  /** Find GCD of two numbers */
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 = n.abs();
    BigInteger n2 = d.abs();
    BigInteger gcd = new BigInteger("1");
    for (BigInteger k = new BigInteger("1"); (k.compareTo(n1) == -1 || k.compareTo(n1) == 0) &&
    		(k.compareTo(n2) == -1 || k.compareTo(n2) == 0); k = k.add(BigInteger.valueOf(1))) {
    	if (n1.divideAndRemainder(k)[1] == BigInteger.ZERO &&
    			n2.divideAndRemainder(k)[1] == BigInteger.ZERO) 
    		gcd = k;
    }
    return gcd;
  }
  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }
  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }
  /** Add a rational number to this rational */
  public RationalBigInteger add(RationalBigInteger secondRational) {
    BigInteger n = (numerator.multiply(secondRational.getDenominator()))
      .add(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalBigInteger(n, d);
  }
  /** Subtract a rational number from this rational */
  public RationalBigInteger subtract(RationalBigInteger secondRational) {
    BigInteger n = (numerator.multiply(secondRational.getDenominator()))
      .subtract(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalBigInteger(n, d);
  }
  /** Multiply a rational number to this rational */
  public RationalBigInteger multiply(RationalBigInteger secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new RationalBigInteger(n, d);
  }
  /** Divide a rational number from this rational */
  public RationalBigInteger divide(RationalBigInteger secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.numerator);
    return new RationalBigInteger(n, d);
  }
  @Override  
  public String toString() {
    if (denominator.compareTo(new BigInteger("1")) == 0)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }
  @Override // Override the equals method in the Object class 
  public boolean equals(Object other) {
    if ((this.subtract((RationalBigInteger)(other))).getNumerator() == new BigInteger("0"))
      return true;
    else
      return false;
  }
  @Override // Implement the abstract intValue method in Number 
  public int intValue() {
    return (int)doubleValue();
  }
  @Override // Implement the abstract floatValue method in Number 
  public float floatValue() {
    return (float)doubleValue();
  }
  @Override // Implement the doubleValue method in Number 
  public double doubleValue() {
    return (numerator.divide(denominator)).doubleValue();
  }
  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }
  @Override // Implement the compareTo method in Comparable
  public int compareTo(RationalBigInteger o) {
    BigInteger n1 = this.getNumerator();
    BigInteger n2 = o.getNumerator();
	if (n1.max(n2) == n1)
      return 1;
    else if (n1.max(n2) == n2)
      return -1;
    else
      return 0;
  }
}
