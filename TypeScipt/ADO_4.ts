//Nome: Kevin da Silva Lima

// Exercício 01: Cálculo de ingressos de cinema[cite: 3]
function exercicio01(tipo: string, quantidade: number): void {
    const precoBase = 28.50;
    const valor = tipo.toLowerCase() === "meia" ? precoBase / 2 : precoBase;
    console.log(`O total a pagar é R$ ${(valor * quantidade).toFixed(2)}`);
}

// Exercício 02: Ações do semáforo[cite: 4]
function exercicio02(cor: string): void {
    const corLower = cor.toLowerCase();
    if (corLower === "vermelho") console.log("Espere");
    else if (corLower === "verde") console.log("Atravesse");
    else console.log("Farol Inoperante");
}

// Exercício 03: Situação do orçamento familiar[cite: 5]
function exercicio03(ganhos: number, gastos: number): void {
    if (ganhos >= gastos) console.log("Você está dentro do orçamento!");
    else console.log("Você está fora do orçamento! Não gaste mais!");
}

// Exercício 04: Dia da semana por extenso[cite: 6]
function exercicio04(dia: number): void {
    const dias = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"];
    if (dia >= 0 && dia <= 6) console.log(dias[dia]);
    else console.log("Dia da semana inválido");
}

// Exercício 05: Mês por extenso[cite: 7]
function exercicio05(mes: number): void {
    const meses = ["", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                   "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];
    if (mes >= 1 && mes <= 12) console.log(meses[mes]);
    else console.log("Mês inválido");
}

// Exercício 06: Compra na sorveteria (usando ?)[cite: 8]
function exercicio06(gramas: number): void {
    if (gramas <= 0) {
        console.log("Peso Inválido");
        return;
    }
    const precoPor100g = gramas >= 1000 ? 3.00 : 3.50;
    const total = (gramas / 100) * precoPor100g;
    console.log(`O total a pagar é R$ ${total.toFixed(1)}`);
}

// Exercício 07: Avaliação de temperatura[cite: 9]
function exercicio07(temp: number): void {
    let situacao = "";
    if (temp >= 41) situacao = "Hipertermia";
    else if (temp >= 39.6) situacao = "Febre Alta";
    else if (temp >= 37.6) situacao = "Febre";
    else if (temp >= 36) situacao = "Normal";
    else situacao = "Hipotermia";
    console.log(`A situação para sua temperatura é ${situacao}`);
}

// Exercício 08: Média e situação do aluno[cite: 10]
function exercicio08(n1: number, n2: number, n3: number): void {
    const media = (n1 + n2 + n3) / 3.0;
    let situacao = "";
    if (media >= 8) situacao = "Aprovado com Sucesso";
    else if (media >= 6) situacao = "Aprovado";
    else if (media >= 3) situacao = "Recuperação";
    else if (media > 0) situacao = "Reprovado";
    else situacao = "Desistente";
    console.log(`A média do aluno é ${media.toFixed(1)}\nSituação: ${situacao}`);
}

// Exercício 09: Cálculo e faixa de IMC[cite: 11]
function exercicio09(altura: number, peso: number): void {
    const imc = peso / (altura * altura);
    let classificacao = "";
    if (imc >= 40) classificacao = "Obesidade Grau III";
    else if (imc >= 35) classificacao = "Obesidade Grau II";
    else if (imc >= 30) classificacao = "Obesidade Grau I";
    else if (imc >= 25) classificacao = "Sobrepeso";
    else if (imc >= 18.5) classificacao = "Peso Normal";
    else classificacao = "Abaixo do Peso";
    console.log(`Seu IMC é ${imc.toFixed(2)}\nSua classificação é ${classificacao}`);
}

// Exercício 10: Mensagem de confirmação de envio com datas[cite: 12]
function exercicio10(dia: number, diaSemana: number, mes: number, ano: number): void {
    const dias = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"];
    const meses = ["", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                   "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];
    console.log(`Enviado ${dias[diaSemana]}, ${dia} de ${meses[mes]} de ${ano}`);
}