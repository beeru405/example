package com.training.example.JacocoExample;

//public class Palindrome {
	
	//public boolean isPalindrome(String inputString) {
	    //if (inputString.length() == 0) {
	       // return true;
	    //} else {
	    //	String rev = "";
	    	//int length = inputString.length();
	    	 
	       // for ( int i = length - 1; i >= 0; i-- )
	       //    rev = rev + inputString.charAt(i);
	   
	       // if (inputString.equals(rev))
	      //     return true;
	       // else
	       //    return false;
	  //  }
//	}

//}



class GFG
{

// Function that returns true if the word is found
static boolean isWordPresent(String sentence, String word)
{
	// To break the sentence in words
	String []s = sentence.split(" ");

	// To temporarily store each individual word
	for ( String temp :s)
	{

		// Comparing the current word
		// with the word to be searched
		if (temp.compareTo(word) == 0)
		{
			return true;
		}
	}
	return false;
}
