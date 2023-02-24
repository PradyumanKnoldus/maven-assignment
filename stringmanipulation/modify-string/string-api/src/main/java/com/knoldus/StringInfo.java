package com.knoldus;
class StringInfo{
    //Method to Reverse String
    public String reverseString(String inputString){
        String reverse = "";
        for(int index = inputString.length()-1 ; index >= 0; index--){
            reverse += inputString.charAt(index);
        }
        return reverse;
    }

    //Method to get the Length of the String
    public int getStringLength(String inputString){
        int length = 0;
        for (int index = 0; index < inputString.length(); index++) {
            length++;
        }
        return length;
    }
}
