/*console.log('Teste do Typescript no console');
document.write('<h1>Testando o Typescript na página html</h1>');
alert('Testando o Typescript no Alert');

//soma(a : number, b: number)
//soma(4,4);

function soma(a, b){
    return a + b;
}
*/

//types

interface Canino extends Animal {
    porte: 'pequeno' | 'médio' | ' grande'
}

type Domestico = Felinos | Canino;

//interfaces

interface Animal {
    nome: string;
    tipo: 'terrestre' | 'aquatico';
    som(som: string): void;
    domestico: boolean;
}

interface Felinos extends Animal {
    visaoNoturna: boolean;
}

const animal: Animal = {  /* --> Domestico */
    nome: 'Elefante',
    tipo: 'terrestre',
    som: (som) => (`${som}`),
    domestico: false
}

const felino: Felinos = {
    nome: 'Leão',
    tipo: 'terrestre',
    visaoNoturna: true,
    som: (som) => (`${som}`),
    domestico: false
}
console.log('O animal' + animal.nome + ' é do tipo ' + animal.tipo);

const input = document.getElementById('input') as HTMLInputElement;
input.addEventListener('input', (event) => {
    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value);
})

//Generic Types
function adicionar(array: any[], valor: any): any { //vai conferir os tipos de acordo com oo que o usuário colocarn
    return array.map(item => item + valor);
}

adicionar([1, 2, 3, 4, 5], 1);

interface Usuario {
    id: number,
    email: string
}

interface Adimonistrador extends Usuario {
    cargo: 'supervisor' | 'coordernador' | 'normal';
}

function redirecionar(usuario: Usuario | Adimonistrador) {
    if ('cargo' in usuario) {
        ///área de adiministração
    } else {
        //redirecionar para a área do usuário
    }
}

function redirecionar2(usuario: Adimonistrador) {
    if (usuario.cargo) {
        ///redireciona cargo
    }
    else {
        //redireciona para a área normal
    }
}

interface Cachorro {
    nome: string,
    idade: number,
    localFavorito?: string;
}

const myDog : Cachorro ={
    nome :'Artemis',
    idade :12,
    localFavorito :'Praça'
}