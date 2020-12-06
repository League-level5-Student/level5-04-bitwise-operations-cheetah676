package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		String binaryByte="";
		String reverseBinaryByte="";
		while(b>0) {
			int remainder=b%2;
			binaryByte+=remainder;
			if(b%2==1) {
				b-=1;
				b/=2;
			}
			else {
				b/=2;
			}
		}
		for(int i=0; i<binaryByte.length(); i++) {
			reverseBinaryByte+=binaryByte.charAt(binaryByte.length()-i-1);
		}
	System.out.println(reverseBinaryByte);
	}
	
	public void printShortBinary(short s) {
		String shortByte="";
		String reverseShortByte="";
		while(s>0) {
			int remainder=s%2;
			shortByte+=remainder;
			if(s%2==1) {
				s-=1;
				s/=2;
			}
			else {
				s/=2;
			}
		}
		for(int i=0; i<shortByte.length(); i++) {
			reverseShortByte+=shortByte.charAt(shortByte.length()-i-1);
		}
	System.out.println(reverseShortByte);
	}
	
	public void printIntBinary(int i) {
		String intByte="";
		String reverseIntByte="";
		while(i>0) {
			int remainder=i%2;
			intByte+=remainder;
			if(i%2==1) {
				i-=1;
				i/=2;
			}
			else {
				i/=2;
			}
		}
		for(int j=0; j<intByte.length(); j++) {
			reverseIntByte+=intByte.charAt(intByte.length()-j-1);
		}
	System.out.println(reverseIntByte);
	}
	
	public void printLongBinary(long l) {
		String longByte="";
		String reverseLongByte="";
		while(l>0) {
			long remainder=l%2;
			longByte+=remainder;
			if(l%2==1) {
				l-=1;
				l/=2;
			}
			else {
				l/=2;
			}
		}
		for(int i=0; i<longByte.length(); i++) {
			reverseLongByte+=longByte.charAt(longByte.length()-i-1);
		}
	System.out.println(reverseLongByte);
	}
	
	public static void main(String[] args) {
		BinaryPrinter bp=new BinaryPrinter();
		byte bb=23;
		bp.printByteBinary(bb);
		
		short ss=35;
		bp.printShortBinary(ss);
		
		int ii=76;
		bp.printIntBinary(ii);
		
		long ll=123;
		bp.printLongBinary(ll);
	}
}
