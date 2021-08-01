var cliente=[];
var pedidos;

function adicionar(){
    var num=prompt("Quantos clientes quer addicionar?");
    for(var i=0;i<num;i++){
       var nome=prompt("Digite um nome");
       var clientes= cliente.push(nome);
    }

    console.log(clientes[0]);
}
