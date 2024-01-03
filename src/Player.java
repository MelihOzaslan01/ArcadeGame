public class Player {
    private int health;
    private int damage;
    private int money;
    private String Type;
    private String characterName;

    public Player(String characterName){
        this.characterName = characterName;
    }
    public void selectChar(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Karakter Tipi :Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
        System.out.println("Karakter Tipi :Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
        System.out.println("Karakter Tipi :Şovalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5");
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public String getType() {
        return Type;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}


