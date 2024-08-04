public class Main {
    public static void main(String[] args) {
        // ( я совместил 1 и 2 задачу)
        int a = 569;
        byte b = 67;
        short c = -159;
        short c1 = 27897;
        long d = 987678965549L;
        float fff = 2.786f;
        System.out.println("Значение переменной а с типом int равно" + a);
        System.out.println("Значение переменной b c типом byte равно" + b);
        System.out.println("Знвчение переменной с c типом short равно" + c);
        System.out.println("Значение переменной d с типом long равно" + d);

        System.out.println();
        byte l = 23;
        byte a1 = 27;
        byte e = 30;
        short paper = 480;
        int all = paper / (l + a + e);
        System.out.printf("На каждого ученика рассчитано" + all + "листов");

        System.out.println();
        var bottleForMin = 16 / 2;
        var bottleFor20 = bottleForMin * 20;
        var bottleForDay = bottleForMin * 24 * 60;
        var bottleForThree = bottleForDay * 3;
        var bottleForM = bottleForDay * 30;
        System.out.println("За 20 минут машина производит" + bottleFor20 + "бутылок");
        System.out.println("За день машина производит" + bottleForDay + "бутылок");
        System.out.println("За три дня машина производит" + bottleForThree + "бутылок");
        System.out.println("За месяц машина производит" + bottleForM + "бутылок");

        System.out.println();
        int all1 = 120;
        int w = 2;
        int b1 = 4;
        float cclass =all1 / (w + b1);
        System.out.println("В школе где" + cclass +"нужно" + w * cclass +"банок белой" + b1 * cclass +"коричневой краски");

        System.out.println();
        var banana = 80;
        var milk100 = 105;
        var icec = 100;
        var eggs = 70;
        var needs = banana * 5 + milk100 * 2 + icec * 2 + eggs * 4;
        var all2 = needs / 1000;
        System.out.println(all);

        System.out.println();
        var need = 7;
        var gramskg = 1000;
        var needToLoose = need * gramskg;
        var min = 250;
        var max = 500;
        var mind = needToLoose / min;
        var maxd = needToLoose / max;
        var total = mind + maxd / 2;
        System.out.println("min" + mind);
        System.out.println("max" + maxd);
        System.out.println("totall" + total);

        System.out.println();
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        int percent = 10;
        float newJ = 1 + (percent / 100f);
        int masha1 = (int) (masha * newJ);
        int denis2 = (int) (denis * newJ);
        int kristina2 = (int) (kristina * newJ);
        int mashaTotal = masha1 - masha * 12;
        int deinsTotal = denis2 - denis * 12;
        int kristinaTotal = kristina2 - kristina * 12;
        System.out.println("Маша теперь получает" + masha1 +"доход вырос на" + mashaTotal);
        System.out.println("Денис теперь получает" + denis2 + "доход вырос на" + deinsTotal);
        System.out.println("Кристина теперь получает" + kristina2 + "доход вырос на" + kristinaTotal);
    }
}
