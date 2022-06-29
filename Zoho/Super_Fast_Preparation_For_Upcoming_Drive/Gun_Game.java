import java.util.*;
class Game{

    private char map[][];
    private Random random;
    private int playerOne_x,playerOne_y;
    private int playerTwo_x,playerTwo_y;
    private int gun_x,gun_y;
    private char gotGun = 'G';
    private int gunChances = 3;

    Game(){
        this.map = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                map[i][j] = '-';
            }
        }
        random = new Random();
    }

    public void printMap(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void placeGun(){
        int x = random.nextInt(9);
        int y = random.nextInt(9);
        while(!isValidPlace(x, y)){
            x = random.nextInt(9);
            y = random.nextInt(9);
        }
        map[x][y] = 'G';
        gun_x = x;
        gun_y = y;
    }
    
    public void placePlayer(){
        int x = random.nextInt(9);
        int y = random.nextInt(9);
        while(!isValidPlace(x, y)){
            x=random.nextInt(9);
            y=random.nextInt(9);
        }
        map[x][y] = 'P';
        playerOne_x = x;
        playerOne_y = y;
    }

    public boolean isValidPlace(int x,int y){
        if(map[x][y]!='-') return false;
        if(y+1<9 && map[x][y+1]!='-') return false;
        if(y-1>0 && map[x][y-1]!='-') return false;
        if(x+1<9 && map[x+1][y]!='-') return false;
        if(x-1>0 && map[x-1][y]!='-') return false;
        if(x-1>0 && y-1>0 && map[x-1][y-1]!='-') return false;
        if(x+1<9 && y+1<9 && map[x+1][y+1]!='-') return false;
        if(x+1<9 && y-1>0 && map[x+1][y-1]!='-') return false;
        if(x-1>0 && y+1<9 && map[x-1][y+1]!='-') return false;
        return true;
    }

    public void simulate() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        char active_player = 'K';
        int player_x = 0;
        int player_y = 0;
        boolean ableToShoot = false;
        while(true){
            ableToShoot = checkAbleToShoot();
            printMap();
            if(active_player=='P'){
                active_player = 'K';
                player_x = playerTwo_x;
                player_y = playerTwo_y;                
            }else{
                active_player = 'P';
                player_x = playerOne_x;
                player_y = playerOne_y;                
            }
            playerGotGunCheck();
            System.out.println("Enter your choice: "+"  "+ (active_player=='K' ? "Player Two(K)" : "Player One(P)"));
            System.out.println("1. Move UP, 2. Move DOWN, 3. Move LEFT, 4. Move RIGHT"+( (ableToShoot && gotGun==active_player) ? ", 5. Shoot( Chances - "+gunChances+")" : ""));
            n = sc.nextInt();
            if(n==1){
                moveUp(active_player,player_x,player_y);
            }else if(n==2){
                moveDown(active_player,player_x,player_y);            
            }else if(n==3){
                moveLeft(active_player,player_x,player_y);            
            }else if(n==4){
                moveRight(active_player,player_x,player_y);                
            }else if(n==5){
                System.out.println("Exiting...");
                System.exit(0);
            }else{
                System.out.println("Invalid choice");
            }
        }
    }

    private boolean checkAbleToShoot() {
        if((playerOne_x == playerTwo_x) || (playerOne_y == playerTwo_y)){
            return true;
        }
        return false;
    }

    private void moveRight(char c,int player_x,int player_y) {  
        int x_copy=player_x;
        int y_copy=player_y;
        int steps = random.nextInt(3)+1;
        player_y += steps;
        if(player_y>8) player_y = 8;

        if(map[player_x][player_y]!='G' && map[player_x][player_y]!='-'){
            return;
        }            

        map[x_copy][y_copy] = '-';

        
        

        map[player_x][player_y] = c;
        if(c=='K'){
            playerTwo_x = player_x;
            playerTwo_y = player_y;
        }else{
            playerOne_x = player_x;
            playerOne_y = player_y;
        }
    }

    private void moveDown(char c,int player_x,int player_y) {
        int x_copy=player_x;
        int y_copy=player_y;
        int steps = random.nextInt(3)+1;
        player_x += steps;
        if(player_x>8) player_x = 8;

        if(map[player_x][player_y]!='G' && map[player_x][player_y]!='-'){
            return;
        }      
        map[x_copy][y_copy] = '-';

        map[player_x][player_y] = c;
        if(c=='K'){
            playerTwo_x = player_x;
            playerTwo_y = player_y;
        }else{
            playerOne_x = player_x;
            playerOne_y = player_y;
        }
    }

    private void moveLeft(char c,int player_x,int player_y) {
        int x_copy=player_x;
        int y_copy=player_y;

        int steps = random.nextInt(3)+1;
        player_y -= steps;
        if(player_y<0) player_y = 0;

        if(map[player_x][player_y]!='G' && map[player_x][player_y]!='-'){
            return;
        }      

        map[x_copy][y_copy] = '-';
        map[player_x][player_y] = c;
        if(c=='K'){
            playerTwo_x = player_x;
            playerTwo_y = player_y;
        }else{
            playerOne_x = player_x;
            playerOne_y = player_y;
        }
    }

    private void moveUp(char c,int player_x,int player_y) {
        int x_copy=player_x;
        int y_copy=player_y;
        int steps = random.nextInt(3)+1;
        player_x -= steps;
        if(player_x<0) player_x = 0;


        if(map[player_x][player_y]!='G' && map[player_x][player_y]!='-'){
            return;
        }      
        map[x_copy][y_copy] = '-';

        map[player_x][player_y] = c;
        if(c=='K'){
            playerTwo_x = player_x;
            playerTwo_y = player_y;
        }else{
            playerOne_x = player_x;
            playerOne_y = player_y;
        }
    }

    public void playerGotGunCheck() {
        if(playerOne_x==gun_x && playerOne_y==gun_y){
            System.out.println("Player one got a gun");
            gotGun = 'P';
            gunChances=3;
        }else if(playerTwo_x==gun_x && playerTwo_y==gun_y){
            System.out.println("Player two got a gun");
            gotGun = 'K';
            gunChances=3;
        }
        if(gotGun!='G'){
            gunChances--;
        }
        if(gunChances==0){
            System.out.println("Gun placed again failed to shoot");
            gotGun='G';
            placeGun();
        }
    }

    public void placePlayerTwo() {
        int x = random.nextInt(9);
        int y = random.nextInt(9);
        while(!isValidPlace(x, y)){
            x=random.nextInt(9);
            y=random.nextInt(9);
        }
        map[x][y] = 'K';
        playerTwo_x = x;
        playerTwo_y = y;
    }
}

public class Gun_Game {
    
    public static void main(String[] args) {
        Game g = new Game();
        g.placeGun();
        g.placePlayer();
        g.placePlayerTwo();             
        g.simulate();
    }
    
}
