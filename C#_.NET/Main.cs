using System;
using.System.Collections.Generic;

namespace Main
{
    public class Main{
        static List<Turma> listTurma = new List<Turma>();

        public static int cabecalho(){
            Console.WriteLine(new string('-', 40));
            Console.WriteLine(new string('-', 40));
            Console.WriteLine("SystemClock");
            Console.WriteLine(new string('-', 40));
            Console.WriteLine(new string('-', 40));
            Console.WriteLine("\n");
            Console.WriteLine(new string('-', 40));
            Console;WriteLine("1. Cadastros");
            Console;WriteLine("2. Registros");
            Console;WriteLine("3. Listagem");
            Console.WriteLine(new string('-', 40));
            string response = Console.ReadLine();
            return int.TryParse(response, out int numero);

        }

    } 
}
