var adicionarFilme = function(){
    var campoFilme=document.getElementById("filme").value;

    if(campoFilme.endsWith(".jpg")){
    var elemento= "<img src="+campoFilme+" >";
    var listaFilmes=document.getElementById("listaFilmes");

    listaFilmes.innerHTML= listaFilmes.innerHTML+elemento;

    //Limpar o campo da variavel
    document.getElementById("filme").value="";
    }
    else{
       // alert("URL inválido");
       console.error("URL inválida")
        document.getElementById("filme").value="";
    }
}