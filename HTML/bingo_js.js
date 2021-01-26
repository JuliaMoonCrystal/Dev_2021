var cartela=[];
var chute=[];
var num_user=document.getElementById('num');
var acertos=0;
var erros=0;

var btABingo=function(){
    alert('Cartela de bingo gerada');
    for(var c=0;c<6;c++){
     var sorteio=Math.round(Math.random()*100);
     cartela[c]=sorteio;

     console.log(cartela[c])
   
   }
}
var numeros=function(){
    for(var y=0;y<6;y++){
        chute[y]=parseInt(num_user);
    
      
        console.log(chute[y]);
      
      } 
}


var btVerificar=function(){
    for(var x=0;x<6;x++){
        if(cartela[x]==num_user){
            alert('Acertou 1 numero');
            acertos++;
        }
        else{
            alert('Esse numero não está na cartela');
            erros++
        }
    }
    console.log(' Acertos: '+acertos+' , <br> Erros: '+erros);
}

var btChute=document.getElementById('add');
btChute.onclick=numeros;

var btGerar=document.getElementById('gerar');
btGerar.onclick=btABingo;