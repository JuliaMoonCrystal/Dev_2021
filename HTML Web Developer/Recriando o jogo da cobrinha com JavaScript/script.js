let canvas =document.getElementById("cobra");
let context =canvas.getContext("2d");
let bax= 32;

function criarBG(){
    context.fillstyle="Lightgreen";
    context.fillRect(0,0,16 * bax, 16*bax);
}