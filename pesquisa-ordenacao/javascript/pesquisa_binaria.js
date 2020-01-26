// Pesquisa e ordenação
// Descrição : Pesquisa binária
// Problema  : Dado um elemento x e um conjunto de dados que está estritamente
//             em ordem numérica ascendente, verifique se x está ou não
//             presente no conjunto.

var v = [10, 12, 20, 23, 27, 30, 31, 39, 42, 44, 45, 49, 57, 63, 70];
var inicio = 0;
var fim = v.length - 1;
var meio;

var x = prompt("Informe o número a ser pesquisado:");

while (inicio <= fim) {
    meio = Math.floor((inicio + fim)/2);

    if (x == v[meio]) {
        break;
    }

    if (x > v[meio]) {
        inicio = meio + 1;
    }

    if (x < v[meio]) {
        fim = meio - 1;
    }
}

if (x == v[meio]) {
    document.write("O número " + x + " está na posição " + meio);
}
else {
    document.write("O número " + x + " não está no vetor.");
}
