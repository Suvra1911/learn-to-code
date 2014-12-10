/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author sbork1
 */
public class MatchMaking {
    
    public String makeMatch(String[] namesWomen, String[] answersWomen, String[] namesMen, String[] answersMen, String queryWoman){
        //String match = "";
        //int matchingAns = 0;
        Map<String, String> nameAnswerWomen = new HashMap<String, String>();
        Map<String, String> nameAnswerMen = new HashMap<String, String>();
        for(int i = 0, j = 0; i < namesWomen.length; i++, j++) {
            nameAnswerWomen.put(namesWomen[i], answersWomen[j]);
            nameAnswerMen.put(namesMen[i], answersMen[j]);
        }
        Arrays.sort(namesWomen);
        Arrays.sort(namesMen);
        int match = 0;
        int prevMatch = 0;
        String matchingMan = "No match found";
        int matchIndexMen = 0;
        for(int i = 0; i < namesWomen.length; i++){ 
            String aw = nameAnswerWomen.get(namesWomen[i]);
            prevMatch = 0;
            for(int j = 0; j < namesMen.length; j++){
                String am = nameAnswerMen.get(namesMen[j]);
                match = 0;
                for(int k = 0; k < aw.length(); k++){
                    if(aw.charAt(k) == am.charAt(k)){
                        match++;    
                    }
                 }
                if(match > prevMatch){
                    prevMatch = match;
                    matchingMan = namesMen[j];
                    matchIndexMen = j;
                 }
                
            }
            namesMen = (String[]) ArrayUtils.remove(namesMen, matchIndexMen);
            if(namesWomen[i].equals(queryWoman)){
                return matchingMan;
            }
        }
        return matchingMan;
    }
        
    
        

}
    
    
