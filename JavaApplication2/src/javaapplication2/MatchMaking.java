/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sbork1
 */
public class MatchMaking {
    
    public Map<String, String> makeMatch(String[] namesWomen, String[] answersWomen, String[] namesMen, String[] answersMen, String queryWoman){
        //String match = "";
        //int matchingAns = 0;
        Map<String, String> nameAnswerWomen = new HashMap<String, String>();
        Map<String, String> nameAnswerMen = new HashMap<String, String>();
        for(int i = 0, j = 0; i < namesWomen.length; i++, j++) {
            nameAnswerWomen.put(namesWomen[i], answersWomen[j]);
            nameAnswerMen.put(answersMen[i], namesMen[j]);
        }
        PrintStream.print("Name of women not in lexicographic order::"+Arrays.toString(namesWomen));
        Arrays.sort(namesWomen);
        PrintStream.print("Name of women in lexicographic order::"+Arrays.toString(namesWomen));
        int match = 0;
        for(int i = 0; i < namesWomen.length; i++){
            for(int j = 0; j < namesWomen[i].length(); j++) {
              if(namesWomen[i].charAt(j) == namesMen[i].charAt(j)){
                  match++;
              }
            }
            
            
        }
        
        return nameAnswerWomen;
    }
        
    
        

}
    
    
