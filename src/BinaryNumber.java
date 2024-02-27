//Gowlikar Vishal
//SUID: 20018206

import java.util.Arrays;

public class BinaryNumber {
    


    private int data[];//saving the data in the array[]
    private boolean overflow;

//constructor for binary number of specified length
    public BinaryNumber(int length) {
        data = new int[length];
        Arrays.fill(data, 0);//Array.fill for the coversion of data array members
    }
//constructor for binary number in form of string
    public BinaryNumber(String str) {
        if (str.length() == 0) {
            System.out.println("Please enter a positive number");
        } else {
            data = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                data[i] = Character.getNumericValue(str.charAt(i));
            }
        }
    }
//length of binary number
    public int getLength() {
        return data.length;
    }
//getdigit class binary digit for required index
    public int getDigit(int index) {
        if (index < 0 || index >= data.length) {
            System.out.println("Index is out of bounds");
            return 0;
        }
        return data[index];
    }
//shifing the binary number to right side for considered position
    public void shiftR(int amount) {
        int[] copyOfArray = new int[data.length + amount];
        for (int i = 0; i < data.length; i++) {
            copyOfArray[i + amount] = data[i];
        }
        data = copyOfArray;
    }
    //adding the binary1  to binary2
    public void add(BinaryNumber aBinaryNumber) {
        int maxLength = Math.max(data.length, aBinaryNumber.getLength());
        int[] result = new int[maxLength + 1]; // Extra space for possible carry
        int carryon = 0;
    
        for (int i = 0; i < maxLength; i++) {
            int sum = data[i] + aBinaryNumber.getDigit(i) + carryon;
            result[i] = sum % 2; // Current digit in the result
            carryon = sum / 2;     // Carry to be added to the next position
        }
    
        result[maxLength] = carryon; // Set the last position with any remaining carry
    
        // Update the data array with the result
        data = Arrays.copyOf(result, maxLength + 1);
        overflow = carryon != 0;
    }
    

    //string conversion
    public String toString() {
        StringBuilder binaryString = new StringBuilder();
        for (int digit : data) {
            binaryString.append(digit);
        }
        return binaryString.toString();
    }
    //binary to decimal conversion
    public int toDecimal() {
        int result = 0;
        for (int i = data.length - 1,  pow = 0; i >= 0; i--, pow++) {
            result += data[i] * Math.pow(2, pow);
        }
        return result;
    }
    
    public void clearOverflow(){
        overflow=false;
    }

    public static void main(String[] args) {
        BinaryNumber binary1 = new BinaryNumber(5);//00000
        BinaryNumber binary2 = new BinaryNumber("1011001");
        System.out.println(binary1.toString());//00000
        System.out.println(binary2.toDecimal());//89
        System.out.println(binary1.getLength()); // 5
        System.out.println(binary1.getDigit(1));  // 0 i would be "0" because the binary number are 0's
        binary1.shiftR(2);
        System.out.println(binary1);//0000000
        binary1.add(binary2);
        System.out.println(binary1.toString());//10110010

    }
}
