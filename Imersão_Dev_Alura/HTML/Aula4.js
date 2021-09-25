/*var CARREGAR= function(){
 //populando a lista de animes
var listaAnimes =['Yu Yu Hakusho','Sailor Moon','Bleach','Angel Beats!'];

for(var i=0; i<listaAnimes.length;i++){
    document.write("<h1>"+listaAnimes[i]+"</h1><br>")
}
}
*/


//
    //var nome=   document.getElementById("anime").value;
   // var url=   document.getElementById("URL").value;
  
   
    var listaAnime =["https://i.ytimg.com/an/MX1uc647SNk/15433402904955609189_mq.jpg?v=612907bc",
                 "https://br.web.img3.acsta.net/c_310_420/pictures/16/04/11/16/56/089875.jpg",
                 "https://upload.wikimedia.org/wikipedia/pt/4/45/Bleach_vol._01.jpg",
                  "https://www.nivelepico.com/wp-content/uploads/2020/08/fairy-tail-01.jpg"]

    var nomeAnime=["One Piece","Naruto","Bleach","Fairy Tail"]
  
   

 

   for(var i=0; i<listaAnime.length;i++){
   
    document.write(nomeAnime[i]);
    document.write("<img src="+listaAnime[i]+">")
   }
  

    
    
    
//}