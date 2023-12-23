public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    //Construcktor atandı.
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    //Saldırı durumu atandı.
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        //Dodge'lama durumu atandı.
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        //Can <= 0 2'dan maçı bitirip kazanan belirlenecek. Değilse verilen hasar ve güncel can bildirilecek.
        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    //Hasardan dodge'lamasını hesaplama
    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    // Hangi dövüşçünün başlayacağı rastgele atandı.
    boolean isFighterStart() {
        double randomNum = Math.random() * 100;
        return randomNum > 50;
    }
}