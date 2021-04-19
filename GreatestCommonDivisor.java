public class GreatestCommonDivisior {
    public static int gdc (int a,int b,int c){
        int condition = 0;
        condition = Math.min(a, b);
        condition = Math.min(condition,c);
        int answer = 1;
        int i = 1;
        while (i<condition){
            i++;
            if (a%i == 0 && b%i == 0 && c%i == 0){
                a/=i;
                b/=i;
                c/=i;
                answer *=i;
                if (a%i == 0 && b%i == 0 && c%i == 0){
                    i-=1;
                    continue;
                }
            }
        }
        System.out.println(answer);
    return answer;
    }

    public static void main(String[] args) {
      gdc(16,34,7);
      gdc(4,8,16);
      gdc(36,48,84);

    }
}
