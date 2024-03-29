
/*
 Variaveis
 */
let canvas =document.getElementById("cobra");
let context =canvas.getContext("2d");
let box= 32;
let cobra=[];
let food={
   x: Math.floor(Math.random() * 15 + 1)* box,
   y: Math.floor(Math.random() * 15 +1)* box
}

cobra[0]={
    x: 8*box,
    y: 8*box
}


let direcao="right";
let jogo= setInterval(IniciarJogo, 100);


/*Funções*/
function criarBG(){
    context.fillStyle="yellow";
    context.fillRect(0,0,16 * box, 16*box);
}


function CriarCobrinha(){
    for (let i=0; i<cobra.length; i++){
        context.fillStyle="black";
        context.fillRect(cobra[i].x,cobra[i].y, box,box);
    }
}

function drawFood(){
    context.fillStyle ="Red";
    context.fillRect(food.x, food.y , box, box);
}

document.addEventListener('keydown', update);

function update(event){
    if(event.keyCode == 37 && direcao != "rigth") direcao="left";
    if(event.keyCode == 38 && direcao != "down") direcao="up";
    if(event.keyCode == 39 && direcao != "left") direcao="right";
    if(event.keyCode == 40 && direcao != "up") direcao="down";
}

function IniciarJogo(){
    if(cobra[0].x > 15 * box && direcao == "right") cobra[0].x=0;
    if(cobra[0].x < 0  && direcao == "left") cobra[0].x=16 * box;
    if(cobra[0].y > 15 * box && direcao == "down") cobra[0].y=0;
    if(cobra[0].y < 0  && direcao == "up") cobra[0].x=16 * box;

    for(i=1;i <cobra.length;i++){
        if(cobra[0].x == cobra[i].x  && cobra[0].y == cobra[i].y){
            clearInterval(jogo);
            alert('Game Over!');
        }
    }

    criarBG();
    CriarCobrinha();
    drawFood();

    let cobrax= cobra[0].x;
    let cobray= cobra[0].y;

    if(direcao == "right") cobrax+= box;
    if(direcao == "left") cobrax-= box;
    if(direcao == "up") cobray-= box;
    if(direcao == "down") cobray+= box;

    if(cobrax != food.x || cobray != food.y){
        cobra.pop();
    }
    else{
      food.x = Math.floor(Math.random() * 15 + 1)* box;
      food.y = Math.floor(Math.random() * 15 +1)* box  ;
    }

    let newHead={
        x: cobrax,
        y: cobray
    }

    cobra.unshift(newHead);
    
}

