package weekSix.overLoaded;

public class Character {
    String Name, Move;
    private int Speed, HP, Attack;
    Character(){
    }
    Character(String name){
        this.Name = name;
    }
    Character(String name, String move, int speed, int hp, int attack){
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
    public void setAttack(int attack, int speed){
        if(speed > 20){
            this.Attack = attack - (attack/5);
        }
    }
    public void displayStats(){
        System.out.printf("Character Stats\nName: %s\nMove: %s\nSpeed: %d\nHP: %d\nAttack: %d\n",Name,Move,Speed,HP,Attack);
    }
}


