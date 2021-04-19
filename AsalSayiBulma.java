public class AsalSayiBulma {
        public static boolean asal(int a){
            boolean kontrol = true;
            for (int i=2;i<a;i++){
                if (a%i == 0 && a!=2){
                    kontrol = false;
                }
            }
            if (kontrol){
                System.out.println(a+" bir asal sayıdır.");
            }
            else {
                System.out.println(a+" bir asal sayı değildir.");
            }
            return kontrol;

        }
        public static void main(String[] args) {
            asal(5);
            asal(14);
            asal(709);
            asal(188);
        }
}
