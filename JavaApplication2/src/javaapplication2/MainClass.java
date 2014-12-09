/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author sbork1
 */
public class MainClass {
    public static void main(String[] args){
        /*BettingMoney bm = new BettingMoney();
        int[] amounts = new int[] {0};
        int[] centsPerDollar = new int[] {0};
        int finalResult = 0;
        PrintStream.print("The net gain is::"+bm.moneyMade(amounts, centsPerDollar, finalResult)+" cents");*/

        MatchMaking mm = new MatchMaking();
        String[] namesWomen = {"Constance", "Alice", "Bertha", "Delilah", "Emily"};
        String[] answersWomen = {"baabaa","ababab","aaabbb", "bababa", "baabba"};
        String[] namesMen = {"Ed","Duff","Chip","Abe", "Biff"};
        String[] answersMen = {"aabaab","babbab","bbbaaa", "abbbba", "abaaba    "};
        String queryWoman = "Emily";
        
       PrintStream.print("The matching man for "+queryWoman+" is "+mm.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman));
        
        

    }

}
