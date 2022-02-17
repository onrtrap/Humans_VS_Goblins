public class land {

    private final String[][] grid = new String[0][0];

    public String toString()
    {
        String output = "";
        return output;
    }
    public land(String grid [][])
    {
        grid = this.grid;
        for (int j = 0; j < 28; j++) {
            for (int i = 0; i < 14; i++) {
                grid[i][j] = "~";
            }
        }
    }
    
    public void navigation()
    {
        String grid [][] = this.grid;
        String map;
        for (int k = 0; k < 14; k++) {
            map = "";
            for (int g = 0; g < 28; g++) {
                map += (grid[k][g]);
            }
            System.out.println(map);
        }
    }
}
