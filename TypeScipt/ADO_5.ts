//Nome: Kevin da Silva Lima

// Exercício 01: Naturais de 1 até número informado[cite: 16]
function exercicio06_01(n: number): void {
    for (let i = 1; i <= n; i++) console.log(i);
}

// Exercício 02: Naturais regressivos de número até 1[cite: 17]
function exercicio06_02(n: number): void {
    for (let i = n; i >= 1; i--) console.log(i);
}

// Exercício 03: Naturais de início a fim[cite: 18]
function exercicio06_03(inicio: number, fim: number): void {
    for (let i = inicio; i <= fim; i++) console.log(i);
}

// Exercício 04: Naturais regressivos de fim a início[cite: 19]
function exercicio06_04(inicio: number, fim: number): void {
    for (let i = fim; i >= inicio; i--) console.log(i);
}

// Exercício 05: Pares naturais de início a fim[cite: 20]
function exercicio06_05(inicio: number, fim: number): void {
    for (let i = inicio; i <= fim; i++) {
        if (i % 2 === 0) console.log(i);
    }
}

// Exercício 06: Linha de asteriscos[cite: 21]
function exercicio06_06(qtd: number): void {
    console.log("*".repeat(qtd));
}

// Exercício 07: Quadrado de asteriscos[cite: 22]
function exercicio06_07(lado: number): void {
    for (let i = 0; i < lado; i++) {
        exercicio06_06(lado);
    }
}

// Exercício 08: Retângulo de asteriscos (base x altura)[cite: 23]
function exercicio06_08(base: number, altura: number): void {
    for (let i = 0; i < altura; i++) {
        exercicio06_06(base);
    }
}

// Exercício 09: Tabuada[cite: 24]
function exercicio06_09(n: number): void {
    for (let i = 1; i <= 10; i++) {
        console.log(`${n} x ${i} = ${n * i}`);
    }
}

// Exercício 10: Soletrar frase[cite: 25]
function exercicio06_10(frase: string): void {
    for (const char of frase) {
        console.log(char);
    }
}

// Exercício 11: Soletrar com contagem e verificação de espaços[cite: 26]
function exercicio06_11(frase: string): void {
    let contador = 1;
    for (const char of frase) {
        if (char === ' ') {
            console.log("Espaço");
        } else {
            console.log(`Letra ${contador++} = ${char}`);
        }
    }
}

// Exercício 12: Triângulo alinhado à esquerda[cite: 27]
function exercicio06_12(altura: number): void {
    for (let i = 1; i <= altura; i++) {
        exercicio06_06(i);
    }
}

// Exercício 13: Triângulo alinhado à direita[cite: 28]
function exercicio06_13(altura: number): void {
    for (let i = 1; i <= altura; i++) {
        const espacos = " ".repeat(altura - i);
        const asteriscos = "*".repeat(i);
        console.log(espacos + asteriscos);
    }
}