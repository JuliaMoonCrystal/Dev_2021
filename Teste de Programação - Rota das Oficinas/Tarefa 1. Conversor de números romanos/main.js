
function Inverter(){
    document.getElementById("romano").innerHTML="<b>Digite o número</b>";
    document.getElementById("convertido").innerHTML="<b>Número Romano:</b>";
}

function Converter(){
    var romano=document.getElementById("romano");
    var aux=romano.value;
    
}
  var MatrizRomana=[[1000, 'M'],[900, 'CM'],[500, 'D'],[400, 'CD'],[100, 'C'],[90, 'XC'],[50, 'L'],[40, 'XL'],[10, 'X'],[9, 'IX'],
  [5, 'V'],
  [4, 'IV'],
  [1, 'I']];

  /*Testando para ver se a matriz foi populada*/
  console.log(MatrizRomana);

  function convertToRoman(num) {
    if (num === 0) {
      return '';
    }
    for (var i = 0; i < romanMatrix.length; i++) {
      if (num >= romanMatrix[i][0]) {
        return romanMatrix[i][1] + convertToRoman(num - romanMatrix[i][0]);
      }
    }
  }