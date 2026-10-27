public class GolfScore {
    static void main() {
    String[] shotNames = { "Hole in one!", "Eagle", "Birdie", "Par", "Bogey", "Double Bogey", "Quit" };
    int par = 3;
    int strokes = 2;

    if(strokes == 1){
        System.out.println(shotNames[0]); //Hole in One
    } else if( strokes <= par - 2) {
        System.out.println(shotNames[1]); //Eagle
    } else if( strokes == par - 1) {
        System.out.println(shotNames[2]); //Birdie
    } else if( strokes == par) {
        System.out.println(shotNames[3]); //Par
    } else if(strokes == par + 1) {
        System.out.println(shotNames[4]); // Bogey
    }else if (strokes == par + 2){
        System.out.println(shotNames[5]); // Double Bogey
    }else if( strokes >= par + 3){
        System.out.println(shotNames[6]); //Quit
    }
    }
}
