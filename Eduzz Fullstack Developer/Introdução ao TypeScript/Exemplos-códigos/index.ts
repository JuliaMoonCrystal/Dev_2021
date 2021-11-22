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