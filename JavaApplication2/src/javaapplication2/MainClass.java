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
        String[] namesWomen = {"Constance", "Bertha", "Alice"};
        String[] answersWomen = {"aaba","baab","aaaa"};
        String[] namesMen = {"Chip","Biff","Abe"};
        String[] answersMen = {"bbaa","baaa","aaab"};
        String queryWoman = "Bertha";
        
        Map<String, String> nameAns = new HashMap<String, String>();
        
        nameAns = mm.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
        
        PrintStream.print("Women-1 (aaba)::"+nameAns.get("Constance"));
        PrintStream.print("Women-2 (baab)::"+nameAns.get("Bertha"));
        PrintStream.print("Women-3 (aaaa)::"+nameAns.get("Alice"));
        
        

    }

}
