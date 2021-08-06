
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

function IniciarJogo(){
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

