
var btEnviar=function(){
    alert('Botão foi usado');
}

var btlIMPAR=function(){
   console.log("Botão limpar foi usado");
}

var btAux=document.getElementById('enviar');
btAux.onclick=btEnviar;

var bt=document.getElementById("Limpar");
bt.onclick=btlIMPAR;