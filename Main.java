class Mobile{
    public void playGame(){
        System.out.println("Playing Genshin Impact....");
    }
}
public class Main {

    public static void main(String[] args) {
    Mobile obj = new Mobile(){
        public void playGame(){
            System.out.println("Playing Mobile Legends......");
        }
    };
    obj.playGame();
    }
    
}
