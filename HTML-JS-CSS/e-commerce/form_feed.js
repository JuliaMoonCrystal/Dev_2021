function enviar(){
  var nome=document.getElementById('nome');
  var email=document.getElementById('email');
  

  if(nome.value !="" && email.value !=""){
      alert('Obrigado pela sua opinião');
      console.log('testando os comandos no console');
  }
  else{
      alert('Digite alguma coisa pra que possamos registrar o seu comentário')
      console.log('testando os comandos no console')
    }
}