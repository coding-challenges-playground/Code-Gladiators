/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {

    public static int[] arrayToString(String[] string){
        int size=string.length;
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            if(!string[i].equals("")){
            arr[i]=Integer.parseInt(string[i]);
            }
        }
        return arr;
    }
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner= new Scanner(System.in);
        int testCases= scanner.nextInt();

        int enemyCount=scanner.nextInt();
        int playerCount=enemyCount;
        String enemyString[]= scanner.nextLine().split(" ");
        for(int i=0;i<enemyCount;i++){
           
        }
        String playerString[]= scanner.nextLine().split(" ");
        int[] enemies= arrayToString(enemyString);
        int[] players= arrayToString(playerString);


        Arrays.sort(enemies);
        Arrays.sort(players);
        Boolean isVictory=true;
        for(int i=0;i<enemies.length;i++){
            if(players[i]<enemies[i]){
                isVictory=false;
                break;
            }
        }
        System.out.println(isVictory? "WIN": "LOSE");
        scanner.close();
        
   }
}
