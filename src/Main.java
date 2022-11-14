public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int apple = 40000;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte banana = 4;
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        short pen = 500;
        System.out.println("Значение переменной pen с типом short равно " + pen);
        float rub = 5.55555f;
        System.out.println("Значение переменной rub с типом float равно " + rub);
        double eur = 15.5555555555;
        System.out.println("Значение переменной eur с типом double равно " + eur);
        long file = 1200000000;
        System.out.println("Значение переменной file с типом long равно " + file);
        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short five = 569;
        short six = -159;
        short seven = 27897;
        byte eight = 67;
        boolean nine = eight >= 100;
        System.out.println(nine);

        System.out.println("Задача 3");
        byte learnerOfLudmila = 23;
        byte learnerOfAnna = 27;
        byte learnerOfEkaterina = 30;
        int paper = 480;
        int learnerAll = learnerOfLudmila + learnerOfAnna + learnerOfEkaterina;
        int paperForOneLearner = paper / learnerAll;
        System.out.println("На каждого ученика рассчитано " + paperForOneLearner + " листов бумаги");

        System.out.println("Задача 3");
        byte productivityFor1Minute = 16 / 2;
        byte minute = 1;
        int minuteInOneDay = minute * 60 * 24;
        int minuteInMonth = minuteInOneDay * 30;
        int productivityFor20Minute = productivityFor1Minute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + productivityFor20Minute + " штук");
        int productivityForOneDay = productivityFor1Minute * minuteInOneDay;
        System.out.println("За сутки машина произвела бутылок " + productivityForOneDay + " штук");
        int productivityForThreeDays = productivityForOneDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + productivityForThreeDays + " штук");
        int productivityForOneMonth = productivityForOneDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + productivityForOneMonth + " штук");

        System.out.println("Задача 4");
        int allBanksPaints = 120;
        int whitePaintsForOneKlass = 2;
        int brownPaintsForOneKlass = 4;
        int allPaintsForOneKlass = whitePaintsForOneKlass + brownPaintsForOneKlass;
        int totalNumberOfKlasses = allBanksPaints / allPaintsForOneKlass;
        int whitePaintBuy = totalNumberOfKlasses * whitePaintsForOneKlass;
        int brownPaintBuy = totalNumberOfKlasses * brownPaintsForOneKlass;
        System.out.println("В школе, где " + totalNumberOfKlasses + " классов, нужно " + whitePaintBuy + " банок белой краски и " + brownPaintBuy + " банок коричневой краски");

        System.out.println("Задача 5");
        int bananaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggWeight = 70;
        bananaWeight = bananaWeight * 5;
        milkWeight = milkWeight * 2;
        icecreamWeight = icecreamWeight * 2;
        eggWeight = eggWeight * 4;
        int totalWeghtGramm = bananaWeight + milkWeight + icecreamWeight + eggWeight;
        double totalWeightKg = totalWeghtGramm * 0.001;
        System.out.println( "Общий вес продуктов " + totalWeghtGramm + " грамм");
        System.out.println( "Общий вес продуктов " + totalWeightKg + " килограмм");

        System.out.println("Задача 6");



    }
}