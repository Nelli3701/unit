//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
//        который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
//        Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//        Если метод calculateDiscount получает недопустимые аргументы,
//        он должен выбрасывать исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.


public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        //return 0; Метод должен возвращать сумму покупки со скидкой
        if (discountAmount < 0) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("Discount can't be more then 100");
        }

        return purchaseAmount - discountAmount / 100.0 * purchaseAmount;
    }
}