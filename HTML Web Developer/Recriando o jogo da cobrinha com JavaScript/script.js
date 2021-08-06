
/*
 Variaveis
 */
let canvas =document.getElementById("cobra");
let context =canvas.getContext("2d");
let box= 32;
let cobra=[];

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

    criarBG();
    CriarCobrinha();

    let cobrax= cobra[0].x;
    let cobray= cobra[0].y;

    if(direcao == "right") cobrax+= box;
    if(direcao == "left") cobrax-= box;
    if(direcao == "up") cobray-= box;
    if(direcao == "down") cobray+= box;

    cobra.pop();

    let newHead={
        x: cobrax,
        y: cobray
    }

    cobra.unshift(newHead);
    
}

