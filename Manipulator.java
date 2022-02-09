public class Manipulator {
    //String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class

    public String trimAndConcat(String s1, String s2){      //our trim and concat method has a return type of string and to concat we must add the two "trimmed strings" together. our two strings will be set in our test class not here in our method
        String result = s1.trim() + s2.trim();
        return result;
    }


    //Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.

    public Integer getIndexOrNull(String s, char c){        //create a method called getIndexorNull with a return type of "Integer" because we're looking for the index of a char/letter within a string which is a integer, the parameters are a String which we will look through and a character which we're looking for. the string and character will be set within our test class not here inside the method
        if (s.indexOf(c) >= 0){         //no need for a loop here, just write a if statement to check to see where the index of c (character) is located within s (string)
            return s.indexOf(c);        //return the index
        }
        else {
            return null;    //character couldnt be found
        }
    }


    //Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.

    public Integer getIndexOrNull(String s, String ss){     //create a method called getIndexorNull that will instead search for the index of a substring instead of a character within a string, here the return type is integer because the index is always a integer, the params are string which we will look through and a string that we will look for. the string and substrings will be set within our test class not here inside the method
        if (s.indexOf(ss) >= 0){        //if statement checking to see where the index of ss (substring) is within s (string)
            return s.indexOf(ss);       //return the index of our substring
        }
        else{
            return null;        //substring was never found
        }
    }

    //String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.

    public String concatSubstring(String s1, int a, int b, String s2){
        return s1.substring(a, b).concat(s2);       //take a string and create a substring using the indexes a through b, then concat that onto our second string inputted
    }
}
