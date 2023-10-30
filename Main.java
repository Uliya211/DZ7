/* Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
Реализацию info() в каждом классе-наследнике.
Создать объекты каждого класса-наследника и проверить метод Info().
 */
public class Main {
    public static void main(String[] args) {
        Phone p=new SamsungPhone("89130604846","S1310",120);
        p.info();
        System.out.println(p.getNumber());

        Phone p1=new XiaomiPhone("89201890000","KT0110");
        p1.info();
        System.out.println(p1.getNumber());

        Phone p2=new ApplePhone();
        p2.info();

    }
}