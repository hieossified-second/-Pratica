let produto: string[] = ["Arroz", "Feijao", "Batata", "Macarrao"]
let preco: number[] = [12.99, 10.99, 5.99, 10.50]
let estoque:number[] = [200, 350, 1000, 0]

function statusDisponivel(estoque: number[], i: number): string{
    if(estoque[i] > 0){
        return 'Disponivel no Armazem: ' + produto[i]
    }
    else{
        return 'Nenhum Disponivel' 
    }
}

console.log(statusDisponivel(estoque, 2))


function cacularMedia(n1: number, n2:number , n3: number): number{
    let calculo: number;

    calculo = (n1+n2+n3) / 3;
    return calculo;
}

cacularMedia(10, 7, 9)


function verificarIdade(idade: number): string{
    let Emaior: string;
    if(idade >= 18){
        Emaior = 'É maior de idade: ' + idade
        return Emaior
    }
    else{
        Emaior = 'É menor de idade: ' + idade
        return Emaior
    }
}

console.log(verificarIdade(20))
console.log(verificarIdade(15))

function calcularDesconto(preco:number, desconto: number): number{
    let calculo: number = preco - (preco * desconto / 100);

    return calculo;
}

calcularDesconto(100, 20)

function calcularDobro(n1: number): number{
    let calcular: number = n1 * 2;

    return calcular;
}

console.log(calcularDobro(10))


const somar = (n1: number, n2: number): number => {
    return n1 + n2;
}

console.log(somar(10, 20))

