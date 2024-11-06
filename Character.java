public class Character{
  double life = 1000.00;
  boolean blocking = false;
  int starup;

  public void block(){
    blocking = true;
  }  

  public int lightpunch(){
    blocking = false;
    starup = 4;
    int damage = 30;
    return damage;
  }

  public int mediumpunch(){
    blocking = false;
    starup = 6;
    int damage = 60;
    return damage;
  }

  public int heavypunch(){
    blocking = false;
    starup = 8;
    int damage = 80;
    return damage;
  }
  
}
