public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
        int maxi=range-1;
        int mini=2;
        double random = Math.random()*(maxi-mini+ 1)+ mini;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "";
        int c=0;
        for (int i = 1; i <= random; i++) {
            if(random % i == 0){
                c++;
            }
        }
        isPrime=(c>2)?"COMPOSITE":"PRIME";
        return isPrime;
    }
}
