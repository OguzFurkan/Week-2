public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Mike Tyson" , 20 , 100, 90, 0);
        Fighter alex = new Fighter("Muhammed Ali" , 20 , 100, 100, 0);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}
