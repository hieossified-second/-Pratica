using System.ComponentModel;

class Programa
{
    public class Aluno
    {
        public string ? Nome;
        public int Idade;
        public double Media;

        public string ? Situacao;

        

        public double CalcularMedia(double n1, double n2, double n3)
        {
            Media = (n1 + n2 + n3) / 3;
            return Media;
            
        }
    }

    
    static List<Aluno> alunos = new List<Aluno>();

    static void Main(String[] args)
    {
        while(true){
        Aluno aluno = new Aluno();
        String nomeA;

        Console.WriteLine("Ola ADM");
        Console.WriteLine("Bem-Vindo ao Sistema de Alunos");
        Console.WriteLine("O que deseja para hoje");
        Console.WriteLine("1 - Registrar aluno");
        Console.WriteLine("2 - Ver todos os alunos");
        Console.WriteLine("0 - Sair");
        Console.WriteLine(" ");

        int op = int.Parse(Console.ReadLine());
        Console.WriteLine(" ");

        switch (op)
        {
            case 1:
                Console.WriteLine("Digite o nome do aluno");
                nomeA = Console.ReadLine();
                aluno.Nome = nomeA;

                Console.WriteLine("Digite a idade do aluno");
                int IdadeA = int.Parse(Console.ReadLine());
                aluno.Idade = IdadeA;

                Console.WriteLine("Digite as notas");
                Console.WriteLine(" ");

                Console.WriteLine("1 Nota");
                Console.WriteLine(" ");
                double n1 = double.Parse(Console.ReadLine());

                Console.WriteLine("2 Nota");
                Console.WriteLine(" ");
                double n2 = double.Parse(Console.ReadLine());
                
                Console.WriteLine("3 Nota");
                Console.WriteLine(" ");
                double n3 = double.Parse(Console.ReadLine());

                double result = aluno.CalcularMedia(n1, n2, n3);

                if(result >= 6)
                {
                    Console.WriteLine("Este aluno esta aprovado!");
                    aluno.Situacao = "Aprovado";
                }else if (result == 5)
                {
                    Console.WriteLine("Aluno precisa assinar sua nota e concordar que passou com dificuldade!");
                    aluno.Situacao = "Aprovado com Dificuldade";
                }
                else
                {
                    Console.WriteLine("Aluno esta de recuperacao ou reprovado!");
                    aluno.Situacao = "DP/Reprovado";
                }

                aluno.Media = result;
                
                Console.WriteLine(" ");
                Console.WriteLine("Aluno registrado com sucesso");
                Console.WriteLine($"Nome: {aluno.Nome}");
                Console.WriteLine($"Idade: {aluno.Idade}");
                Console.WriteLine($"Media: {aluno.Media}");
                Console.WriteLine($"Situacao: {aluno.Situacao}");        
                
                alunos.Add(aluno);
                
            break;

            case 2: 
                foreach(var al in alunos)
                {
                    Console.WriteLine($"Nome: {al.Nome}");
                    Console.WriteLine($"Idade: {al.Idade}");
                    Console.WriteLine($"Media: {al.Media}");
                    Console.WriteLine($"Situacao: {al.Situacao}");
                }
                break;

            case 0:
                return;
        }
        }

    }
}





