/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinbaik;
import java.util.ArrayList;
import java.util.Random;
import was.Move;
import was.GameBoard;
import was.GameLocation;

/**
 *
 * @author Konnoke
 */

public class Sheep extends was.SheepPlayer{
    
    
    
    private static Random rand = new Random();
    Move direction = null;
    Move squareDirection = null;
    GameBoard board = null;
    int s = 0;
    
    
    //@Override
    public void initialize() {
        // you cannot call "getGameBoard" in the constructor, as the
        // game board is created after all the players.
        board = getGameBoard();
    }

    //@Override
    public Move move() {
       direction = circle();
       
       /*
       if (direction == null) {
            //direction = new Move(rand.nextFloat() * 2.0 - 1.0, rand.nextFloat() * 2.0 - 1.0);
            // scale direction to lenght and quantize it to maximize distance covered.
            direction = new Move(2, 2);
            
            direction = direction.scaledToLength(getMaxAllowedDistance()).quantized();
            
            
        } */
        return direction;
       
        
        
    } //*/
    
    public Move circle(){
        
        //while(s < 21){
            
            if(s < 5){
                squareDirection = new Move(2,0);
                s++;
            }else if(s < 10){
                squareDirection = new Move(0,2);
                s++;
            } else if (s < 15){
                squareDirection = new Move(-2,0);
                s++;
            }else if (s < 19){
                squareDirection = new Move(0, -2);
                s++;
            }else{
                s = 0;
            }
        //}
        
        
        return squareDirection;
    }
    
    /**
     * Get the positions of all the pastures on the board
     *
     * @return an ArrayList containing was.GameLocation objects, with x,y
     * positions
     */
    
    public void getPasturePositions(){
        board.getPasturePositions();
        
        
    }
    
    public void getDistance(){
        
    }
    
    public void run(){
        
    }
    
}
