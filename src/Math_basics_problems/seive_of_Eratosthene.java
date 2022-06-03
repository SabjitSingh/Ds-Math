
package Math_basics_problems;
import java.util.*;
public class seive_of_Eratosthene {
    /*package whatever //do not write package name here */

        static void sieve(int n)
        {
            if(n <= 1)
                return;

            boolean isPrime[] = new boolean[n+1];

            Arrays.fill(isPrime, true);

            for(int i=2; i*i <= n; i++)
            {
                if(isPrime[i])
                {
                    for(int j = 2*i; j <= n; j = j+i)
                    {
                        isPrime[j] = false;
                    }
                }
            }

            for(int i = 2; i<=n; i++)
            {
                if(isPrime[i])
                    System.out.print(i+" ");
            }
        }

        public static void main (String[] args) {

            int n = new Scanner(System.in).nextInt();

            sieve(n);

        }
    }

=======
package Math_basics_problems;
import java.util.*;
public class seive_of_Eratosthene {
    /*package whatever //do not write package name here */

        static void sieve(int n)
        {
            if(n <= 1)
                return;

            boolean isPrime[] = new boolean[n+1];

            Arrays.fill(isPrime, true);

            for(int i=2; i*i <= n; i++)
            {
                if(isPrime[i])
                {
                    for(int j = 2*i; j <= n; j = j+i)
                    {
                        isPrime[j] = false;
                    }
                }
            }

            for(int i = 2; i<=n; i++)
            {
                if(isPrime[i])
                    System.out.print(i+" ");
            }
        }

        public static void main (String[] args) {

            int n = new Scanner(System.in).nextInt();

            sieve(n);

        }
    }


