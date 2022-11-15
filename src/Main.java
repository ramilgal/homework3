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
        long file = 1200000000L;
        System.out.println("Значение переменной file с типом long равно " + file);

        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        boolean h = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println("Задача 3");
        byte learnerOfLudmila = 23;
        byte learnerOfAnna = 27;
        byte learnerOfEkaterina = 30;
        int paper = 480;
        int learnerAll = learnerOfLudmila + learnerOfAnna + learnerOfEkaterina;
        int paperForOneLearner = paper / learnerAll;
        System.out.println("На каждого ученика рассчитано " + paperForOneLearner + " листов бумаги");

        System.out.println("Задача 4");
        byte productivityFor1Minute = 16 / 2;
        int minuteInOneDay = 60 * 24;
        int productivityFor20Minute = productivityFor1Minute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + productivityFor20Minute + " штук");
        int productivityForOneDay = productivityFor1Minute * minuteInOneDay;
        System.out.println("За сутки машина произвела бутылок " + productivityForOneDay + " штук");
        int productivityForThreeDays = productivityForOneDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + productivityForThreeDays + " штук");
        int productivityForOneMonth = productivityForOneDay * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + productivityForOneMonth + " штук");

        System.out.println("Задача 5");
        int allBanksPaints = 120;
        int whitePaintsForOneClass = 2;
        int brownPaintsForOneClass = 4;
        int allPaintsForOneClass = whitePaintsForOneClass + brownPaintsForOneClass;
        int totalNumberOfClass = allBanksPaints / allPaintsForOneClass;
        int whitePaintBuy = totalNumberOfClass * whitePaintsForOneClass;
        int brownPaintBuy = totalNumberOfClass * brownPaintsForOneClass;
        System.out.println("В школе, где " + totalNumberOfClass + " классов, нужно " + whitePaintBuy + " банок белой краски и " + brownPaintBuy + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceWeight = 100;
        int eggWeight = 70;
        bananaWeight = bananaWeight * 5;
        milkWeight = milkWeight * 2;
        iceWeight = iceWeight * 2;
        eggWeight = eggWeight * 4;
        int totalWeightGram = bananaWeight + milkWeight + iceWeight + eggWeight;
        int oneKg = 1000;
        float totalWeightKg = (float)totalWeightGram / oneKg;
        System.out.println( "Общий вес продуктов " + totalWeightGram + " грамм");
        System.out.println( "Общий вес продуктов " + totalWeightKg + " килограмм");

        System.out.println("Задача 7");
        int targetOfWeight = 7;
        targetOfWeight = targetOfWeight * oneKg;
        int loseWeightInDayFirst = 250;
        int loseWeightInDaySecond = 500;
        int daysToTargetOfWeightBy250 = targetOfWeight / loseWeightInDayFirst;
        System.out.println(daysToTargetOfWeightBy250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        int daysToTargetOfWeightBy500 = targetOfWeight / loseWeightInDaySecond;
        System.out.println(daysToTargetOfWeightBy500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int averageDaysToTargetOfWeight = (daysToTargetOfWeightBy250 + daysToTargetOfWeightBy500) / 2;
        System.out.println("Может потребоваться " + averageDaysToTargetOfWeight + " дней в среднем, чтобы добиться результата похудения");

        //задача 6
        System.out.println("Задача 8");
        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;
        byte year = 12;
        int oldPayMashaYear = payMasha * year;
        int oldPayDenisYear = payDenis * year;
        int oldPayKristinaYear = payKristina * year;
        double increasePercent = 1.1;
        int newPayMasha = (int) (payMasha * increasePercent);
        int newPayDenis = (int) (payDenis * increasePercent);
        int newPayKristina = (int) (payKristina * increasePercent);
        int newPayMashaYear = newPayMasha * year;
        int newPayDenisYear = newPayDenis * year;
        int newPayKristinaYear = newPayKristina * year;
        int differenceOfPayMashaYear = newPayMashaYear - oldPayMashaYear;
        int differenceOfPayDenisYear = newPayDenisYear - oldPayDenisYear;
        int differenceOfPayKristinaYear= newPayKristinaYear - oldPayKristinaYear;
        System.out.println("Маша теперь будет получать " + newPayMasha + " рублей. Её годовой доход вырос на " + differenceOfPayMashaYear + " рублей");
        System.out.println("Денис теперь будет получать " + newPayDenis + " рублей. Его годовой доход вырос на " + differenceOfPayDenisYear + " рублей");
        System.out.println("Кристина теперь будет получать " + newPayKristina + " рублей. Её годовой доход вырос на " + differenceOfPayKristinaYear + " рублей");
    }
}