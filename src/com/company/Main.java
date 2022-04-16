package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Int min value = " + myMinValue);
        System.out.println("Int max value = " + myMaxValue);
        System.out.println("Busted max value = " + (myMaxValue + 1));
        System.out.println("Busted min value = " + (myMinValue - 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByte);
        System.out.println("Byte max value = " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShort);
        System.out.println("Short max value = " + myMaxShort);
        
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLong);
        System.out.println("Long max value = " + myMaxLong);

        int myTotal = myMinValue / 2;

        byte myNewByteValue = (byte) (myMinByte / 2);

        short myNewShortValue = (short) (myMinShort / 2);

        //Challenge to solidify

        byte challengeByte = 21;
        short challengeShort = 21212;
        int challengeInt = 2121212;
        long challengeLong = 50000 + ( 10 * (challengeByte + challengeInt + challengeShort));

        System.out.println(challengeLong); //should be 21474450, and it is correct

    }
}
