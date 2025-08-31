import java.util.Scanner;

public class Zadaci{

    public static void main(String[] args){
        System.out.println("Zadaci");

        //System.out.println("1. Promjena(2, 3): " + promjena(2, 3));
        //System.out.println("1. Promjena(-2, 3): " + promjena(-2, 3));
        //System.out.println("2. zbirIntervala(2, 10): " + zbirIntervala(2, 10));
        //System.out.println("3. duzinaDuzi(1, 1, 2, 2): " + duzinaDuzi(1, 1, 2, 2));
        //System.out.println("4. pripadaIntervalu (1, 10, 6): " + pripadaIntervalu (1, 10, 11));
        //System.out.println("5. spisakDjelilaca (24): "); spisakDjelilaca (24);
        //System.out.println("6. brojDjelilaca(24): " + brojDjelilaca(24));
        //System.out.println("7. zbirDjelilaca(24): " + zbirDjelilaca(24));
        //System.out.println("8. zbirCifara(12345): " + zbirCifara(12345));
        //System.out.println("9. najvecaCifara(129345): " + najvecaCifara(12945));
        //System.out.println("10. minMaxCifra(128345): " + minMaxCifra(12845));
        //System.out.println("11. stepen(2, 3): " + stepen(2, 3));
        //
        //System.out.println("13. fakt(4): " + fakt(4));
        //System.out.println("14. stepenDvojke(4): " + stepenDvojke(4));
        //System.out.println("15. minStepenDvojke(17): " + minStepenDvojke(17));
        //System.out.println("16. trougaoPostoji(1, 1, 2, 2, 3, 3): " + trougaoPostoji(1, 1, 2, 2, 3, 3));
        //System.out.println("16. trougaoPostoji(1, 1, 2, 2, 3, 1): " + trougaoPostoji(1, 1, 2, 2, 3, 1));

        //System.out.println("17. povrsinaTrougla(1, 1, 2, 2, 3, 3): " + povrsinaTrougla(1, 1, 2, 2, 3, 3));
        //System.out.println("17. povrsinaTrougla(1, 1, 2, 2, 5, 1): " + povrsinaTrougla(1, 1, 2, 2, 5, 1));
        //System.out.println("18. redEX(2, 3.0): " + redEX(2, 3.0));
        //System.out.println("19. red(0.5, 3.0): " + red(0.5, 3.0));
        //System.out.println("20. prosjekOcjena(5): " + prosjekOcjena(5));
        //System.out.println("21. manjiOdX(5): "); manjiOdX(5);
        //System.out.println("22. nadjiZbir(5): " + nadjiZbir(5));
        //System.out.println("23. nadjiNajveci(int n): " + nadjiNajveci(5));
        //System.out.println("24. najveciNeparniDjelilac(12): " + najveciNeparniDjelilac(12));
        //System.out.println("25. nadjiNajveciTrougao(2): " + nadjiNajveciTrougao(2));
        //System.out.println("26. jeProst(23): " + jeProst(23));
        //System.out.println("27. prostInterval(1, 47): "); prostInterval(1, 47);
        //System.out.println("28. prostiDjelioci(25): "); prostiDjelioci(25);
        //System.out.println("29. gcd(252, 105): " + gcd(252, 105));
        //System.out.println("29. euklidovAlg(105, 252): " + euklidovAlg(105, 252));
        //System.out.println("30. isArmstrong(371): " + isArmstrong(371));
        System.out.println("31. isHemming(3): " + isHemming(3));
       // Scanner input = new Scanner(System.in);
       // System.out.println("Unesi vrijednosti: ");
       // double d = input.nextDouble();
    }
//1
    public static double promjena(double x, double a){
        if(x >= 0){
            return x * a;
        }else{
            return a / x;
        }
    }
//2
    public static int zbirIntervala(int a, int b){
        int sum = 0;

        while(a < b){
            sum = sum + a;
            a++;
        }
        return sum;
    }
//3
    public static double duzinaDuzi(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2*x2 - 2*x2*x1 + x1*x1) + (y2*y2 - 2*y2*y1 + y1*y1));
    }
//4
    public static boolean pripadaIntervalu (int a, int b, int x){
        if(x>=a && x<= b){
            return true;
        }
        return false;
    }
//5
    public static void spisakDjelilaca(int n){
        int i = 1;

        while (i <= n/2){

            if(n%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
//6
    public static int brojDjelilaca(int n){
        int i = 1;
        int broj = 0;

        while (i <= n/2){
            if(n%i == 0){
                broj++;
            }
            i++;
        }
        return broj;
    }
//7
    public static int zbirDjelilaca(int n){
        int i = 1;
        int sum = 0;

        while (i <= n/2){
            if(n%i == 0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
//8
    public static int zbirCifara(int n){
        int sum = 0;
        int z;

        while (n > 0){

            z = zadnjaCifra(n);
            sum = sum + z;
            n = ukloniZadnjuCifru(n, z);
        }

        return sum;
    }
        public static int zadnjaCifra(int n){
            return n % 10;
        }
        public static int ukloniZadnjuCifru(int n, int z){
           return n = (n - z) / 10;
        }
//9
   public static int najvecaCifara(int n){
        int max = 0;
        int z;

        while (n > 0){

            z = zadnjaCifra(n);

            if (z > max){
                max = z;
            }

             n = ukloniZadnjuCifru(n, z);
        }

        return max;
    }
//10
   public static int minMaxCifra(int n){
        int max = 0;
        int min = 1;
        int z;

        while (n > 0){

            z = zadnjaCifra(n);
            if (z > max){
                max = z;
            }
            if (z < min){
                min = z;
            }

            n = ukloniZadnjuCifru(n, z);
        }

        return max + min;
    }
//11
    public static double stepen(double x, int n){
        double s = 1;
        for(int i = 0; i < n; i++){
            s = s * x;
        }
        return s;
    }
//12
/*
    public static void print3K(int a, int b){

            while (a <= b){
            int  = 1;
            for(int = i; i < ){

                if(a == ){
                    System.out.println(a);
                }
            }
                a++;
            }
    }
*/
//13
    public static long fakt(long n){
        long f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
//14

    public static boolean stepenDvojke(int n){

        double korijen = Math.sqrt(n);

        if(korijen == Math.floor(korijen)){
            return true;
        }
        return false;
    }
//15
    public static int minStepenDvojke(int n){
        int i = 0;
        while (n > Math.pow(2, i)){
            i++;
        }
        return i-1;
    }
//16
    public static boolean trougaoPostoji(double x1, double y1, double x2, double y2, double x3, double y3){

        double povrsina = (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2;
        if(povrsina != 0){
            return true;
        }
        return false;
    }
//17
    public static double povrsinaTrougla(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2;
    }
//18
    public static double redEX(double x, double eps){
        long n = 0;
        double sum = 0;
        while(Math.abs(Math.pow(x, n) / fakt(n)) < eps){
            sum = sum + Math.abs(Math.pow(x, n) / fakt(n));
            n++;
        }
        return sum;
    }
//19
    public static double red(double x, double eps){
        int n = 0;
        double sum = 0;
        while(Math.abs(Math.pow(-1, n) * (n+1) * Math.pow(x, 2*n)) > eps){
            sum = sum + Math.abs(Math.pow(-1, n) * (n+1) * Math.pow(x, 2*n));
            n++;
        }
        return sum;
    }
//20
    public static double prosjekOcjena (int n){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double prosjek = 0;

        if (n > 0){

           for (int i = 0; i < n; i++){
                System.out.print("Unesi " + (i+1) + " ocjenu: ");
                sum = sum + input.nextInt();
            }

           prosjek = sum / n;
           return prosjek;

        }else{
            return 0;
        }
    }
//21
    public static void manjiOdX(int x){
        int ucitani = 0;
        int parniCount = 0;
        int ucitaniCount = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while(ucitani < x){

            System.out.print("Unesi " + (ucitaniCount+1) + ": ");
            ucitani = input.nextInt();

            sum = sum + ucitani;

            if(ucitani % 2 == 0){
                parniCount++;
            }

            ucitaniCount++;
        }
        System.out.println("Ucitani: " + ucitaniCount + "\nParni: " + parniCount + "\nSum: " + sum );
    }
//22
    public static int nadjiZbir(int n){
        int ucitani = 0;
        int ucitaniCount = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while(ucitani < n){

            System.out.print("Unesi " + (ucitaniCount+1) + ": ");
            ucitani = input.nextInt();

            sum = sum + ucitani;

            ucitaniCount++;
        }
        System.out.println("Ucitani: " + ucitaniCount + "\nSum: " + sum );

        return sum;
    }
//23
    public static int nadjiNajveci(int n){
        int ucitani = 0;
        int ucitaniCount = 0;
        int najveci = 0;
        Scanner input = new Scanner(System.in);

        while(ucitaniCount < n){

            System.out.print("Unesi " + (ucitaniCount+1) + ": ");
            ucitani  = input.nextInt();

            if(ucitani > najveci){
                najveci = ucitani;
            }

            ucitaniCount++;
        }

        return najveci;
    }
//24
    public static int najveciNeparniDjelilac(int n){
        int najveciNeparni = 1;

        for (int i = 1; i < n/2; i=i+2){

            if(n % i == 0){
                najveciNeparni = i;
            }
        }

        return najveciNeparni;
    }
//25
    public static double povrsinaTrougla(double a, double b, double c){
        double s = (a + b + c) / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static int nadjiNajveciTrougao(int n){
        double a, b, c;
        double povrsinaNajveceg = 0;
        int najveci = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= n; i++){
            System.out.print("i: " + i + ", a: ");
            a = input.nextInt();
            System.out.print("i: " + i + ", b: ");
            b = input.nextInt();
            System.out.print("i: " + i + ", c: ");
            c = input.nextInt();

            double povrsina = povrsinaTrougla(a, b, c);
            System.out.println("Povrsina: " + povrsina);
            if (povrsina > povrsinaNajveceg){
                povrsinaNajveceg = povrsina;
                najveci = i;
            }
        }

        return najveci;
    }
//26
    public static  boolean jeProst(int n){
        int i = 2;

        while(i <= Math.floor(Math.sqrt(n))){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
//27
    public static void prostInterval(int a, int b){

        while(a <= b){
            if(jeProst(a) == true){
                System.out.println(a);
            }
            a++;
        }
    }
//28
    public static void prostiDjelioci(int n){
        int i = 1;

        while(i <= n/2){

            if((n%i == 0) && jeProst(i)){
                System.out.println(i);
            }

            i++;
        }
    }
//29
    public static int gcd(int n, int m){
        int manji = n < m ? n : m;
        int najveciZajednicki = 1;
        int i = 1;

        while( i <= manji / 2){

            if((n % i == 0) && (m % i == 0)){
                najveciZajednicki = i;
            }
            i++;
        }

        return najveciZajednicki;
    }

    public static int euklidovAlg(int n, int m){
        int t;

        while (m != 0){
            t = m;
            m = n % m;
            n = t;
        }

        return n;
    }
//30
    public static boolean isArmstrong(int n){
        int u = n;
        double sum = 0;
        int cifra;

        while(n > 0){
            cifra = n % 10;
            n = n / 10;
            //System.out.println("n: " + n + ", cifra: " + cifra);
            sum = sum + Math.pow(cifra, 3);
        }

        if (sum == u){
            return true;
        }else{
            return false;
        }
    }
//31
    public static boolean isHemming(int n){
        int i = 2;
        boolean uslov = false;

        while(i <= n/2){

            if((n % i == 0) && jeProst(i) ){

                if((i != 2) && (i != 3) && (i != 5)){
                    //System.out.println("(i != 2) && (i != 3) && (i != 5): " + i);
                    return false;
                }
                uslov = true;
            }
            i++;
        }
        return uslov;
    }

}
















































