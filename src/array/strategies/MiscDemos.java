/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.strategies;

/**
 *
 * @author Adam
 */
public class MiscDemos {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "hello";
        words[1] = "Meow";
        words[2] = "Woof";
        
        String[] moreWords = {"hello", "meow", "woof"};
        
        //traditional loop
        for (int i=0 ; i <words.length ; i++) {
            String s = words[i];
            System.out.println(s);
        }
        
        //new for loop
        for (String s : moreWords) {
            System.out.println(s);
        }
        
        //for use in project
        String[] awords = new String[0];
        String[] temp = new String[awords.length+1];
        for (int i=0; i<awords.length ; i++) {
            temp[i] = words[i];
        }
        awords=temp;
        temp=null;
        awords[awords.length-1] = "Mew mew";
        
        System.out.println(awords[awords.length-1]);
        
        //Final option, using above logic
        String[] words1 = {"Jim"};
        String[] temp1 = new String[words1.length+1];
        System.arraycopy(words1, 0, temp1, 0, words.length);
        words1=temp1;
        words1[words1.length-1] = "hello";
        temp1=null;
        
        for (String s : words1) {
            System.out.println(s);
        }
        
    } 
}
