package LekcijaViens.Majasdarbs;

public class Main {
    public static void main(String[] args) {
        String valsts = "Malta.";
        String teksts = "Valsts ir ";
        System.out.println(teksts + valsts);

        String galvaspilseta = "Valleta.";
        String teksts1 = "Maltas galvaspilsēta ir ";
        System.out.println(teksts1 + galvaspilseta);

        String valoda = "maltiešu, angļu.";
        String teksts2 = "Oficiālās valodas ir ";
        System.out.println(teksts2 + valoda);

        int iedzivotajuSkaits = 520971;
        System.out.println("Iedzīvotāju skaits ir:" + iedzivotajuSkaits);
        int platiba = 315;
        System.out.println("Platība km2 ir:" + platiba);

        String valoda1 = "Jā";
        String teksts3 = "Vai ir ES dalībvalsts? ";
        System.out.println(teksts3 + valoda1);


        char valuta = '€';
        String teksts4 = "Valūta ir ";
        System.out.println(teksts4 + valuta);

        System.out.println(teksts + valsts + teksts1 + galvaspilseta + teksts2 + valoda);

        String valstsIekarta = "parlamentāra republika,";
        String teksts5 = "Malta ir ";
        String president = " kurai ir valdības vadītājs (premjerministrs) un valsts vadītājs (prezidents). ";
        String loma = "Prezidenta loma ir galvenokārt ceremoniāla. ";
        String region = "Valsts ir iedalīta 5 reģionos.";
        System.out.println(teksts5 + valstsIekarta + president + loma + region);

        int a=50;
        int b=20;
        int c=5;
        int d=2;
        int e=10;
        int rezultats = a+b;
        System.out.println(rezultats);
        rezultats = d+c;
        System.out.println(rezultats);
        rezultats = c+e;
        System.out.println(rezultats);


        rezultats = a-b;
        System.out.println (rezultats);
        rezultats = e-d;
        System.out.println(rezultats);
        rezultats = c-d;
        System.out.println(rezultats);


        rezultats = a*b;
        System.out.println(rezultats);
        rezultats = d*e;
        System.out.println(rezultats);
        rezultats = c*e;
        System.out.println(rezultats);

        rezultats = a/c;
        System.out.println(rezultats);
        rezultats = e/d;
        System.out.println(rezultats);
        rezultats = b/e;
        System.out.println(rezultats);

        rezultats = (a+b)*c;
        System.out.println(rezultats);
        rezultats = (a+b+c)*d;
        System.out.println(rezultats);











    }
}
