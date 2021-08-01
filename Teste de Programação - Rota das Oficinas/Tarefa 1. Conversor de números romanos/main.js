
function Inverter(){
  
    document.getElementById("Romano").innerHTML="<b>Digite o número</b>";
    document.getElementById("convertido").innerHTML="<b>Número Romano:</b>";

}

var MatrizRomana=[[1000, 'M'],[900, 'CM'],[500, 'D'],[400, 'CD'],[100, 'C'],[90, 'XC'],[50, 'L'],[40, 'XL'],[10, 'X'],[9, 'IX'],
  [5, 'V'],
  [4, 'IV'],
  [1, 'I']];

var aux1= document.getElementById();

function ConverterNumPRomano(){
    if (aux === 0) {
        return '';
      }
      for (var i = 0; i < MatrizRomana.length; i++) {
        if (aux >= MatrizRomana[i][0]) {
          return MatrizRomana[i][1] + Converter(aux - MatrizRomana[i][0]);
        }
      }
}  

function Converter(){
    var romano=document.getElementById("romano");
    var aux=romano.value;
   // document.getElementById("resultado").innerHTML=aux;
}

  /*Testando para ver se a matriz foi populada*/
  //console.log(MatrizRomana);

  