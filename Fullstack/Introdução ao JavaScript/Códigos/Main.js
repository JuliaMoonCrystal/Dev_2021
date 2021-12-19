//var y =0; --> comentario no javascript
/*var x=0;
var f=9;  --> comentario de várias linhas*/

/*var a = 9;
var b = 8;

var valor = soma(a, b);
console.log(valor);

function soma(a, b) {
    return a + b;
}
*/

function troca() {
    const frase = document.getElementById('h1');
    console.log(frase);

    h1.style.color = 'red';
}

function volta() {
    const frase = document.getElementById('h1');

    h1.style.color = 'black';
}

var num= document.getElementById('currentNumber');
var cont=0;

function increment() {
    cont+=1;
    num.innerHTML= cont;
}

function decrement() {
    cont-=1;
    num.innerHTML= cont;
}