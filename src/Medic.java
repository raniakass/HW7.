public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    // Геттер для healPoints
    public int getHealPoints() {
        return healPoints;
    }

    // Метод для увеличения опыта лечения
    public void increaseExperience() {
        healPoints *= 1.1;
        System.out.println("Medic увеличил свои healPoints до: " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING");
    }
}