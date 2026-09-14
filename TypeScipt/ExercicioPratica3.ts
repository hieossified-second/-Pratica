let Kevin = {
    nome: "Kevin",
    idade:  15,
    estudante: true
};

let pessoa: {
    nome: string;
    idade: number;
    estudante: boolean;
};

pessoa = {
    nome: "Kevin",
    idade: 18,
    estudante: true
};

console.log(Kevin.nome)
console.log(pessoa.idade)

let carro: {
    marca: string;
    modelo: string;
    ano: number;
    preco: number;
}

carro = {
    marca: "Chrevollet",
    modelo: "Sla",
    ano: 1998,
    preco: 25.670
}

console.log(carro.modelo, carro.preco);

let Conta: {
    titular: string;
    saldo: number;
    mostrarSaldo: () => void;
};

Conta = {
    titular: "Kevin",
    saldo: 1500,

    mostrarSaldo: function(){
        console.log("Saldo: " + this.saldo);
    }
}

console.log(Conta.titular)
Conta.mostrarSaldo();

let conta2: {
    titular: string;
    saldo: number;
    depositar: (valor: number) => void;
    mostrarSaldo: () => void;
}

conta2 = {
    titular: "Kevin",
    saldo: 1500,

    depositar: function(valor: number): void{
        this.saldo += valor
    },

    mostrarSaldo: function(){
        console.log("Saldo: " + this.saldo);
    }
}

conta2.depositar(1000)
conta2.mostrarSaldo();