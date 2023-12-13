package projectOne;

public class Player{
    String Name, Move;
    private int Speed, HP, Attack;
    Player(String name, String move, int speed, int hp, int attack){
        this.Name = name;
        this.Move = move;
        this.Speed = speed;
        this.HP = hp;
        this.Attack = attack;
    }
    public String getName(){
        return Name;
    }
    public String getMove(){
        return Move;
    }
    public int getSpeed(){
        return Speed;
    }
    public int getHP(){
        return HP;
    }
    public int getAttack(){
        return Attack;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setMove(String move){
        this.Move = move;
    }
    public void setSpeed(int speed){
        this.Speed = speed;
    }
    public void setHP(int hp){
        this.HP = hp;
    }
    public void setAttack(int attack){
        this.Attack = attack;
    }
    public void setHP(int hp, int damage){
        if(hp-damage <= 0){
            this.HP = 0;
        }
        else {
            this.HP = hp - damage;
        }
    }
    public void displayStats(){
        System.out.printf("Character Stats\nName: %s\nMove: %s\nSpeed: %d\nHP: %d\nAttack: %d\n",Name,Move,Speed,HP,Attack);
    }
}