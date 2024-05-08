
/**
 * Write a description of class GameSetUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSetUp
{
    Key greyKey;
    Key blueKey;
    Key redKey;
    Key orangeKey;
    Key whiteKey;
    Key purpleKey;
    Key greenKey;
    Key endKey;

    public void gameSetUP(){
        greyKey.setCoords(0,0);
        blueKey.setCoords(0,1);
        redKey.setCoords(1,0);
        orangeKey.setCoords(0,2);
        whiteKey.setCoords(1,1);
        purpleKey.setCoords(2,0);
        greenKey.setCoords(1,2);
        endKey.setCoords(2,1);
    }
}
