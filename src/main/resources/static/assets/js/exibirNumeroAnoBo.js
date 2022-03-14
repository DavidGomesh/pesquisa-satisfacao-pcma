
// Script para controlar a exibicao do Numero do BO e o ano, dependendo da opcao selecionada
let selectServico = document.querySelector("#servico");
selectServico.addEventListener("change", exibirNumeroAnoBo);

function exibirNumeroAnoBo() {
    let numeroAnoBo = document.querySelector("#numeroAnoBo");

    // Se a opcao de Registro de Ocorrencia for selecionada
    // Ativa as opcoes de numero e ano do BO 
    // sr-only: Classe do Bootstrap 4 para ocultar elemento
    if (selectServico.selectedIndex == 2) {
        numeroAnoBo.classList.remove("sr-only");
    } else {
        numeroAnoBo.classList.add("sr-only");
    }
}
