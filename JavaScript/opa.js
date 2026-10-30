function nomeUsuario(){
    let nome = window.prompt("Qual é seu nome?");

    if(nome) {
        window.alert(`Ola ${nome}!, seja bem-vindo`);
    }else{
        window.alert("Voce nao Digitou nenhum nome");
    }
}

function aparecerMsg(){
    let mensagem = window.prompt("exibir mensagem?");

    if(mensagem == "sim"){
        window.alert("Ola");
    }else if(mensagem == "nao"){
        window.alert("poooooooooooooooooooooxa")
    }else{
        window.alert("NUNCA mais ta solex")
    }
}

function Irpagina(){
    let ir = window.confirm("Voce esta saindo da propriedade de nosso site\ndeseja sair mesmo assim?");

    if(ir){

        let a= [3, 2 ,1]
        
        a.forEach(element => {
            window.alert("Redirecionando em " + element);
        });
        window.location.href("https://osu.ppy.sh/");
    }else{
        window.alert("Voce cancelou a operacao");
    }
}

function reset(){
    let carregar = window.confirm("Deseja recarregar a pagina?");

    if(carregar){
        window.location.reload();
    }
}

function criarParagrafo(){
    let crirar = document.createElement("p")
    crirar.textContent = "P criado pelo JS"

    document.body.appendChild(crirar)
}

function somar(){
    let num1 = parseInt(document.getElementById("val1"));
    let num2 = parseInt(document.getElementById("val2"));

    if(isNaN(num1) || isNaN(num2)){
        document.getElementById("resultado").innerHTML = "Digite os valores";
        return;
    }

    let soma = num1 + num2;

    document.getElementById("resultado").innerHTML = "Resultado: " + soma;
}