////Console.WriteLine("Este e minha priemira linha em c#");
//
//Console.WriteLine("Digite seu nome: ");
//string nome = Console.ReadLine();
//
//Console.WriteLine("Digite sua idade: ");
//int idade = int.Parse(Console.ReadLine());
//
//Console.WriteLine($"Ola {nome}, sua idade e {idade}");
//
//if(idade >= 18)
//{
//    Console.WriteLine($"{nome}, voce e maior de idade");
//}else
//{
//    Console.WriteLine($"{nome}, voce e menor de idade");
//
//}

static double somar(double a, double b)
{
    return a + b;
}

static double sub(double a, double b)
{
    return a - b;
}

static double mult(double a, double b)
{
    return a * b;
}

static double div(double a, double b)
{
    return a / b;
}

double resultado;

List<double> historico = new List<double>();

bool refazer = true;
bool menu = true;

Console.WriteLine("---- Bem vindo a calculadora em C# ----");
Console.WriteLine(" ");

while(menu)
{

    Console.WriteLine("-- O que deseja para hoje? --");
    Console.WriteLine(" ");
    Console.WriteLine("1 - Calcular");
    Console.WriteLine("2 - Ver Historico");

    int op = int.Parse(Console.ReadLine());

    if(op == 1)
    {
        

        while (refazer)
        {

            Console.WriteLine("-- Digite um numero:  --");
            Console.WriteLine(" ");
            double n1 = double.Parse(Console.ReadLine());

            Console.WriteLine("-- Digite outro numero:  --");
            Console.WriteLine(" ");
            double n2 = double.Parse(Console.ReadLine());    

            Console.WriteLine("-- Digite a operacao que deseja --");
            Console.WriteLine("Digite 0 para sair");
            Console.WriteLine("+, -, *, /");
            Console.WriteLine(" ");
            String operacao = Console.ReadLine();

            if(n1 == 0 || n2 == 0 && operacao == "/")
            {
                Console.WriteLine("Nao pode se dividir por 0");
                break;
            }

            switch (operacao)
            {
                case "+":
                    resultado = somar(n1, n2);
                    Console.WriteLine($"Resultado: {resultado}");
                    historico.Add(resultado);

                    break;
                case "-":
                    resultado = sub(n1, n2);
                    Console.WriteLine($"Resultado: {resultado}");
                    historico.Add(resultado);

                    break;
                case "*":
                    resultado = mult(n1, n2);
                    Console.WriteLine($"Resultado: {resultado}");
                    historico.Add(resultado);

                    break;
                case "/":
                    resultado = div(n1, n2);
                    Console.WriteLine($"Resultado: {resultado}");
                    historico.Add(resultado);

                    break;
                case "0":
                    refazer = false;
                    break;
                default:
                    Console.WriteLine("Porfavor digite um operador valido");
                    break;
            }
        }

    }

    else if(op == 2)
    {
        Console.WriteLine("\n--- Historico de Resultados ---");
        if(historico.Count == 0)
        {
            Console.WriteLine("Nada Registrado ainda");
        }
        else{
            Console.WriteLine("-- Ultimos 10 resultados --");
            var ultimos10 = historico.TakeLast(10);

            foreach(var(numero, i) in historico.Select((valor, i) => (valor, i)))
            {
            Console.WriteLine($"Resultado {i}: {numero}");
            }
        }
        
    }
}

//if(operacao == "+")
//{
//    resultado = numero1 + numero2;
//    Console.WriteLine($"Resultado {resultado}");
//}
//else if(operacao == "-")
//{
//    resultado = numero1 - numero2;
//    Console.WriteLine($"Resultado: {resultado}");
//}
//else if(operacao == "*")
//{
//    resultado = numero1 * numero2;
//    Console.WriteLine($"Resultado: {resultado}");
//} else if(operacao == "/")
//{
//    if(numero1 != 0 && numero2 != 0)
//    {
//        resultado = numero1 / numero2;
//        Console.WriteLine($"Resultado: {resultado}");
//    }
//    else
//    {
//        Console.WriteLine("Erro: Divisao por zero nao e permitido!!");
//    }
//}
//else
//{
//    Console.WriteLine("Sua operacao foi invalida, tente novamente!");
//}
