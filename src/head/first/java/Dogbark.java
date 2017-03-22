package head.first.java;


public class Dogbark {

    public static void main(String[] args) {

        //Создаем объекты собак присваиваем им имена и размер
        Dog dog1 = new Dog();
        dog1.size = 70;

        Dog dog2 = new Dog();
        dog2.size = 35;

        Dog dog3 = new Dog();
        dog3.size = 8;

        // Отправляем обьекты в метод реализующий лай собак и присваиваем количество гавканий
        dog1.bark("Рекс", 2);
        dog2.bark("Пират", 5);
        dog3.bark("Булька", 7);
   }

    private static class Dog {

        public int size;

        // Метод реализующий лай собак, в соответствии размерам собаки
        public void bark(String name, int i) {
            if(size > 60) {
                System.out.print(name + ":");
                for (int j = 0; j < i; j++) {
                    System.out.print(" Гав гав!");

                }
                System.out.println("");
            }else if(size > 14) {
                System.out.print(name + ":");
                for (int j = 0; j < i; j++) {
                    System.out.print(" Вуф вуф!");
                }
                System.out.println("");
            }else {
                System.out.print(name + ":");
                for (int j = 0; j < i; j++) {
                    System.out.print(" Тяф тяф!");
                }
                System.out.println("");
            }

        }
    }
}
