package leetcode1239;

import java.util.ArrayList;
import java.util.List;

public class FindMaximumLength {
    public int maxLength(List<String> arr) {
        List<String> result = new ArrayList<>();
        
        result.add("");
        
        for(String word : arr){
            if(!isUnique(word)){
                continue;
            }
            
            List<String> tempList = new ArrayList<>();
            
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
    
    private boolean isUnique(String word){
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
