
function Inverter(){
    document.getElementById("romano").innerHTML="<b>Digite o número</b>";
    document.getElementById("convertido").innerHTML="<b>Número Romano</b>";
}

function Converter(){
    var romano=document.querySelector("#romano");

    var ro=romano.value;
    console.log(ro);
}