let canvas =document.getElementById("cobra");
let context =canvas.getContext("2d");
let box= 32;
let cobra=[];

cobra[0]={
    x: 8*box,
    y: 8*box
}

function criarBG(){
    context.fillStyle="yellow";
    context.fillRect(0,0,16 * box, 16*box);
}

criarBG();

function CriarCobrinha(){
    for (let i=0; i<cobra.length; i++){
        context.fillStyle="black";
        context.fillRect(cobra[i].x,cobra[i].y, box,box);
    }
}

CriarCobrinha();