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
        Samuray samuray = new Samuray();
        Okcu okcu = new Okcu();
        Sovalye sovalye = new Sovalye();

        Chars[] charsList = {new Samuray(),new Okcu(),new Sovalye()};
        System.out.println("------------------------------------------------------------");
        for(Chars chars :charsList){
            System.out.println(" Karakterin Türü : "+chars.getName()+
                    " Karakterin Canı : "+chars.getHealth()+
                    " Karakterin Hasarı : "+ chars.getDamage()+
                    " Karakterin Parası : "+chars.getMoney());
        }
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

