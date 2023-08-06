//wap to check if the given character is upper case consonant or upper case vowel or lower case consonant or lower case vowel or number or special character
package qsp;

public class p27 {
    //4.nested DMS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char ch='#';
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("it is upper case vowel");
	}
     else if (ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='G'||ch=='H'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
	       System.out.println("it is upper case consonant");
    }
     else if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("it is lower case vowel");
	}	  
     else if (ch=='b'||ch=='c'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z') {
    	System.out.println("it is lower case consonant");
    	
	}else if (ch>=0 && ch<=9) {//else if (ch>=48 && ch<=57)
		System.out.println("it is number");
		
	}else {
		System.out.println("it is special character");
	}
}	

}
/*NOTE:-The ASCII value of the uppercase alphabets range from 65 - 90, 
lowercase alphabets range from 97 - 122 and the digits range from 48 - 57.*/
