import java.util.Scanner;

public class Pro2_150120526 {
  
  public static void main(String args[]) {
  
	  Scanner input = new Scanner(System.in);
	  
	 
	  String number = input.nextLine();		// Taking number from user
	 
	   
	
	  boolean tf = validateNumber(number);
	  if (tf == false)		
		  System.out.println("Number is Invalid");
	  else
		  System.out.println("Number is Valid");
	  
	  
	  for (int i = 0; i < number.length(); i++) {
		  if (!Character.isDigit(number.charAt(i)) && number.charAt(i) != ' ' && number.length() < 2)
			  System.out.println("Invalid Input !");
	  }
		  
   }
  
  public static boolean validateNumber (String number) {
	  	  
	  if (number.length() < 2)
		  System.out.println("Invalid Input !");
	  else {
	  int count = 0;	  
	  
	  for (int i = 0; i < number.length(); i++) { 	
		  if(Character.isDigit(number.charAt(i))) {	 // Finding length of number without spaces
			  count++;
		  }
	  }
	  
	  int[] numberA = new int[count]; 
	  int a = 0;
	  char numberB = 0;
	  int b = 0;
	  for ( int i = 0; i < number.length(); i++) { 
		
			   if (Character.isDigit(number.charAt(i))) {
				   numberB = number.charAt(i);
				   numberA[b] = numberB;
				   b++;
			   }
			  
	  }
	  for (int i = 0; i < numberA.length; i++)
		  numberA[i] = numberA[i] - 48;
	  
	  System.out.print("DNumber: ");
	  
	  if (numberA.length % 2 == 0) {	// Printing DNumber 
	  for (int i = 0; i < numberA.length; i += 2) {	
		  
		  System.out.print(numberA[i] + "_");	
	  }
	  System.out.println();
	  }
	  else if (numberA.length % 2 == 1) {	// Printing DNumber
		  for (int i = 1; i < numberA.length; i += 2)
			  System.out.print("_" + numberA[i]);
		  System.out.println("_");
		  }

	  int toplam = 0;
	  int[] lNumber = new int[numberA.length];
	  	 	  
	  if (numberA.length % 2 == 0) {  // Finding LNumber 
		  	
		  for (int i = 1; i < lNumber.length; i += 2) {
			  lNumber[i] = numberA[i];	
			  toplam += lNumber[i];
		  }
		  
		  for (int i = 0; i < numberA.length; i += 2) {
			  if ((numberA[i] * 2) > 9) {
				  lNumber[i] = (numberA[i] * 2) - 9;
				  toplam += lNumber[i];
			  }
			  else if ((numberA[i] * 2) <= 9) {
				  lNumber[i] = (numberA[i] * 2);
			  		toplam += lNumber[i]; 
			  }
		  }			  
	  }
	  
	  else if (numberA.length % 2 == 1) {	// Finding LNumber
		  
		  for (int i = 0; i < lNumber.length; i += 2) {
			  lNumber[i] = numberA[i];	
			  toplam += lNumber[i];
		  }
		  
		  for (int i = 1; i < numberA.length; i += 2) {
			  if ((numberA[i] * 2) > 9) {
				  lNumber[i] = (numberA[i] * 2) - 9;
				  toplam += lNumber[i];
			  }
			  else if ((numberA[i] * 2) <= 9) {
				  lNumber[i] = (numberA[i] * 2);
			  		toplam += lNumber[i]; 
			  }
		  }			  
	  }
	  System.out.print("LNumber: ");
	  
	  for (int i = 0; i < lNumber.length; i++)	// Printing LNumber
		  System.out.print(lNumber[i]);		
	  	
	  System.out.println();
	  		   
		  if (toplam % 10 != 0)
			  return false;
	  
	  }
	  return true;
	  
  }
}
