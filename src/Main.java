public class Main {
    public static void main(String[] args) {
        // Создаем массив героев
        Hero[] heroes = {
                new Magic(250, 50),
                new Medic(200, 20, 100),
                new Warrior(300, 70)
        };

        // Применяем суперспособности каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Увеличение опыта лечения у медика
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;  // Приведение типа (Type Casting)
                medic.increaseExperience();
            }
        }
    }
}
