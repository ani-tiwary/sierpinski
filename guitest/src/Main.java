public class Main {
    public static void main(String[] args){
        new gui();
    }
}
//BELOW IS OLD SOLUTION WITH RANDOM POINTS (was in sierp.java)
        /*g2D.setStroke(new BasicStroke(1));
        Random rand = new Random();
        int randy = rand.nextInt(50);
        int[] coords = {750 + randy, (int)(750 * Math.sqrt(3)/2 + randy)};
        int count = 0;
        while(count < 100000){
            Random rando = new Random();
            int randCorner = rando.nextInt(3);
            if (randCorner == 0){
                coords[0] = coords[0] / 2;
                coords[1] = coords[1] / 2;
                g2D.drawLine(coords[0], coords[1], coords[0], coords[1]);
            }
            if (randCorner == 1){
                coords[0] = (coords[0] + 750) / 2;
                coords[1] = coords[1] / 2;
                g2D.drawLine(coords[0], coords[1], coords[0], coords[1]);
            }
            if (randCorner == 2){
                coords[0] = (coords[0] + 375) / 2;
                coords[1] = (int)(coords[1] + 375 * Math.sqrt(3)) / 2;
                g2D.drawLine(coords[0], coords[1], coords[0], coords[1]);
            }
            count++;*/
