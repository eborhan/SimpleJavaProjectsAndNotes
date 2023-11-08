public class Main {
    public static void main(String[] args) {
        Fighter tyson = new Fighter("Mike Tyson", 15,100,90,50);
        Fighter ali = new Fighter("Muhammad Ali",25,120,95,0);
        Match championship = new Match(ali, tyson, 85,100);
        championship.run();
    }
}
