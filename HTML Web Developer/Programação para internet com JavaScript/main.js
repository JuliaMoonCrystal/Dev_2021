/*
var nome="Julia Farias"
alert("Bem-vindo a página "+ nome);
*/

/*exemplo usando o conole.log*/

var nome ="Julia";
//var idade=22;
/* 
console.log(nome);
console.log(idade);
*/


/*String no alert e no console
var frase="O Brasil é o melhor time do mundo";
console.log(frase);
alert(frase);


console.log(" esse vai trocar brasil por japão "+frase.replace("Brasil","Japão"));
alert(frase.replace("Brasil","Japão"));

console.log(frase.toUpperCase());
alert(frase.toUpperCase());
*/

/* é possivel fazer contas também*/

var n1=10;
var n2=9

//console.log(n1+n2);

/*Trabalhando com listas*/

//var lista=['maça','pera','laranja']

//lista.push("Uva")
//console.log(lista.toString());
//console.log(lista[0]);

//alert(lista.join(" | "));
//alert(lista[1]);

/*Condicionais*/

//var idade=prompt("Qual a sua idade?");
//if(idade >=18){
//    alert("Usuário é maior de idade");
//}
//else{
 //   alert("Usuário menor de idade");
//}

/* laçõs de repetição*/

//var cont=0;
//while(cont <5){
 // console.log(cont);
//  cont++;
//}

/*TRABALHANDO COM FUNÇÕES*/

/*function soma(n1,n2){
  return n1+n2;
}

function setReplace(frase,nome,novo_nome){
  return frase.replace(nome,novo_nome);
}

function validaIdade(idade){
    var valido;
    if(idade =>18){
        valido=true;
    }
    else{
        valido=false;
    }
    return valido;
}

var idade=prompt("Digite a sua idade: ");
console.log(validaIdade(idade));

alert(setReplace("Vai Japão","Brasil","Japão"));

console.log(soma(5,10));
alert(soma(7,7));
*/

/*Manipulando elementos da pagina*/
function btn(){
//alert("Botão clicado");
 document.getElementById("obrigado").innerHTML="<b>Obrigado por clicar</b>";
 //window.open("https://unionmangas.top/home");
 window.location.href="https://unionmangas.top/home";
}


