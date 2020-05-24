package leetcode1239;

import java.util.ArrayList;
import java.util.List;

public class FindMaximumLength {
    public int maxLength(List<String> arr) {
        List<String> result = new ArrayList<>();
        
        // As a base case to add itself
        result.add("");
        
        for(String word : arr){
        	// Input could have duplicates too
            if(!isUnique(word)){
                continue;
            }
            
            List<String> tempList = new ArrayList<>();
            
            // For every combination, save the unique one
            for(String savedWord : result){
                String temp = savedWord + word;
                
                if(isUnique(temp)){
                    tempList.add(temp);
                }
            }
            
            result.addAll(tempList);
        }
        
        int maxLength = 0;
        
        for(String word : result){
            maxLength = Math.max(maxLength, word.length());
        }
    
        return maxLength;
    }
    
    // A helper method that check if duplicates
    private boolean isUnique(String word){
    	// greater than 26 means it has duplicates
        if(word.length() > 26){
            return false;
        }
        
        int[] letters = new int[26];
        
        for(char letter : word.toCharArray()){
            if(letters[letter - 'a'] == 1){    
                return false;
            } else {
                letters[letter - 'a'] = 1;
            }
        }
        
        return true;
    }
}
