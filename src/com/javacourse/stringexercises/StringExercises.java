package com.javacourse.stringexercises;

public class StringExercises {
	
	public int countUppercaseLetters(String str) {
        int cont = 0;
        for (int i = 0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                cont++;
            }
        }
    return cont;    
}
	public boolean hasConsecutiveDuplicates(String str) {
        boolean duplicate=false;
        for(int i = 1; i < str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                duplicate = true;
            }
        }
        return duplicate;
    }
	
	public int getRightmostDigit(String str) {
        int temp = 0;
        for(int i = 0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                temp = Character.getNumericValue(str.charAt(i));
            }
        }
        if(temp == 0){temp = -1;}
        return temp;
    }
	
	public String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        int maxLength = 0;
        int currentLength = 0;
        String longestWord = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            if (currentChar != ' ') {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestWord = sentence.substring(i - currentLength + 1, i + 1);
                }
            } else {
                currentLength = 0;
            }
        }
        
        return longestWord;
    }

	public static void main(String[] args) {
		StringExercises stringExercises = new StringExercises();

        // Prueba del método countUppercaseLetters
        String str1 = "HelloWorld";
        int uppercaseCount = stringExercises.countUppercaseLetters(str1);
        System.out.println("Número de letras mayúsculas en '" + str1 + "': " + uppercaseCount);

        // Prueba del método hasConsecutiveDuplicates
        String str2 = "fernandorr";
        boolean hasDuplicates = stringExercises.hasConsecutiveDuplicates(str2);
        System.out.println("Tiene duplicados consecutivos en '" + str2 + "': " + hasDuplicates);

        // Prueba del método getRightmostDigit
        String str3 = "Hello12345";
        int rightmostDigit = stringExercises.getRightmostDigit(str3);
        System.out.println("Último dígito en '" + str3 + "': " + rightmostDigit);

        // Prueba del método findLongestWord
        String sentence = "Esta es una prueba muy maravillosa";
        String longestWord = stringExercises.findLongestWord(sentence);
        System.out.println("Palabra más larga en la oración: '" + longestWord + "'");
    
	}

}
