public class GameRockPaper{
    //This is a simple game of rock paper scissors. The computer randomly chooses between 3 options: Rock, Paper, or Sc
    private String player1; 
    private String player2;
    //Constructor for the game
    public GameRockPaper(String p1, String p2){
        this.player1 = p1;
        this.player2 = p2;
        }
        //Method to play a round of Rock Paper Scissors 
        public void playGame(){
            Random rand = new Random();
            int randomNum = rand.nextInt(3);
            if (randomNum == 0) {
                System.out.println("Player 1 chose rock");
                } else if (randomNum == 1) {
                    System.out.println("Player 1 chose paper");
                    } else {
                        System.out.println("Player 1 chose scissors");
                        }
                        int randomNum2 = rand.nextInt(3);
                        if (randomNum2 == 0) {
                            System.out.println("Player 2 chose rock");
                            } else if (randomNum2 == 1) {
                                System.out.println("Player 2 chose paper");
                                } else {
                                    System.out.println("Player 2 chose scissors");
                                    }
                                    //Checking who wins or loses based on the rules of RPS
                                    
                                    


                                    




                

        
}