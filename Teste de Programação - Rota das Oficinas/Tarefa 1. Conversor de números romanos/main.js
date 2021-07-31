
function Inverter(){
    document.getElementById("romano").innerHTML="<b>Digite o número</b>";
    document.getElementById("convertido").innerHTML="<b>Número Romano</b>";
}

function Converter(){
    var romano=document.getElementById("romano");
    var ro=romano.value;
    
}
  var MatrizRomana=[[1000, 'M'],[900, 'CM'],[500, 'D'],[400, 'CD'],[100, 'C'],[90, 'XC'],[50, 'L'],[40, 'XL'],[10, 'X'],[9, 'IX'],
  [5, 'V'],
  [4, 'IV'],
  [1, 'I']]