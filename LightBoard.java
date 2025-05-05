public class LightBoard
{

private boolean[][] lights;

public LightBoard(int numRows, int numCols)
{
    lights = new boolean[numRows][numCols];
    for(int i = 0; i < numRows; i++)
    {
        for(int k = 0; k < numCols; k++)
        {
            if(Math.random() < .4) lights[i][k] = true;
        }
    }
}
public LightBoard(boolean[][] prelit)
{
    lights = prelit;
}
public String getboard()
{
    String s = "";
    for (int i = 0; i < lights.length; i++) 
    {
        for (int j = 0; j < lights[0].length; j++) 
        {
            s+= lights[i][j] + " ";
        }
        s+= "\n";
    }
    return s;
}
public boolean evaluateLight(int row, int col)
{
    int count = 0;
    if(lights[row][col])
    {
        for(int i = 0; i < lights.length; i++)
        {
            if(lights[i][col]) count ++;
        }
        if(count % 2 == 0) return false;
    }
    else
    {
        for(int i = 0; i < lights.length; i++)
        {
            if(lights[i][col]) count ++;
        }
        if(count % 3 == 0) return true;
    }
    return(lights[row][col]);
}

  
}