
using System;

namespace BeginningConsoleApp1
{
    class Program
    {

        const String gay = "truly gay";

        static void Main(string[] args)
        {
            Console.WriteLine("Hey there, type your age! I wanna know!");
            int age = Convert.ToInt32(Console.ReadLine());
            if(age > 10)
            {
                if (age >= 16)
                {
                    Console.WriteLine("good lez phucc");
                } else
                {
                    Console.WriteLine("Um, you're good... but still not enough!");
                }
            } else
            {
                Console.WriteLine("Way way below the required!");
            }

            Console.WriteLine("OK enough, let's see if you got some vowels!");
            char vowelornot = Convert.ToChar(Console.ReadLine());
            switch (vowelornot)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    Console.WriteLine("IT is a vowel! Congratulations!");
                    break;
               default:
                    Console.WriteLine("Not a vowel!");
                    break;
            }

            int num = 1;
            while (num < 6)
            {
                Console.WriteLine(num += 2);
            }
            int x = 1;
            while (x < 8) // -1, 2, -3, 4, -5, 6, -7, 8
            {
                if (x % 2 == 1)
                {
                    int y = x * -1 ;
                    Console.Write("{0}, ", y);
                    x++;
                } else
                {
                    Console.Write("{0}, ", x);
                    x++;
                }
            }

            int b1 = -1, b2 = 1, b3;
            Console.WriteLine("");

            for (int yy = 0; yy < 10; ++yy)
            {
                b3 = b1 + b2;
                Console.WriteLine(b3 + ", ");
                b1 = b2;
                b2 = b3;
            }
            Console.WriteLine("====================================================");
            int aaa = 15;

            for (int pp = 1; pp <= 5; pp++)
            {
                for (int jj = 1; jj <= pp; jj++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //Multiplication Table!

            for (int outer = 1; outer <= 10; outer++)
            {   
                Console.Write(outer);
                for (int inner = 2; inner <= 10; inner++) 
                {
                    int innerValue = inner * outer;
                    Console.Write(" {0} ", innerValue);
                }
                Console.WriteLine();
                
            }

            for (int divider = 0; divider < 20; divider++)
            {
                Console.Write("- ");

            }

            

           


                


        }
    }
}

