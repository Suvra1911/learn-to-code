/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author sbork1
 */
public class BettingMoney {
    
   public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult){
        int totalBetAmount = 0;
        for(int i = 0; i < amounts.length; i++){
            if(i!=finalResult){
                totalBetAmount += amounts[i];
            }
        }
        return totalBetAmount*100 - amounts[finalResult]*centsPerDollar[finalResult];
    }
}
