/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinbaik;
import java.util.Random;
import was.Move;
import was.GameBoard;

/**
 *
 * @author Konnoke
 */

public class Sheep extends was.SheepPlayer{
    
    
    
    private static Random rand = new Random();
    Move direction = null;
    GameBoard board = null;

    //@Override
    public void initialize() {
        // you cannot call "getGameBoard" in the constructor, as the
        // game board is created after all the players.
        board = getGameBoard();
    }

    //@Override
    public Move move() {
       
       
       if (direction == null) {
            direction = new Move(rand.nextFloat() * 2.0 - 1.0, rand.nextFloat() * 2.0 - 1.0);
            // scale direction to lenght and quantize it to maximize distance covered.
            direction = direction.scaledToLength(getMaxAllowedDistance()).quantized();
        }
        return direction;
       
    } //*/
    
    public void run(){
        
    }
    
}
