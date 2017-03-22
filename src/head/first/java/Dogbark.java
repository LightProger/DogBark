package head.first.java;

/*
Класс показывает наглядно, как создавать объекты, инкапсулировать переменную, и обратиться к ней с помощью
методов Get и Set, так же обращение объектов к одному и тому же методу, с передачей разных параматров.
 */
public class Dogbark {

    public static void main(String[] args) {

        //Создаем объекты собак присваиваем им размер
        Dog dog1 = new Dog();
        dog1.setSize(70);

        Dog dog2 = new Dog();
        dog2.setSize(35);

        Dog dog3 = new Dog();
        dog3.setSize(8);

        // Отправляем обьекты в метод реализующий лай собак и присваиваем имя собаке и количество гавканий
        dog1.bark("Рекс", 2);
        dog2.bark("Пират", 5);
        dog3.bark("Булька", 7);
   }

    private static class Dog {

        // Инкапсулируем переменную size, чтобы не обращаться к ней напрямую
        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        private int size;

        // Метод реализующий лай собак, в соответствии размерам собаки
        public void bark(String name, int i) {
            if(getSize() > 60) {
                System.out.print(name + ":");
                for (int j = 0; j < i; j++) {
                    System.out.print(" Гав гав!");

                }
                System.out.println("");
            }else if(getSize() > 14) {
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
