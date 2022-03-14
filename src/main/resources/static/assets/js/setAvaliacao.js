
// Scrip para controlar a mudança de opção na Avaliação
let idUtimaAvaliacao = null;

function setAvalicao(avalicao) {
    let idAvaliacao = "";
    let lblAvaliacaoAtual;
    let lblUltimaAvaliacao;

    switch (avalicao) {
        case 1: idAvaliacao = "icon-avalicao-otimo"; break;
        case 2: idAvaliacao = "icon-avalicao-bom"; break;
        case 3: idAvaliacao = "icon-avalicao-regular"; break;
        case 4: idAvaliacao = "icon-avalicao-ruim"; break;
        case 5: idAvaliacao = "icon-avalicao-pessimo"; break;
    }

    // Deixa a opcao selecionada em negrito
    lblAvaliacaoAtual = document.querySelector(`#${idAvaliacao}`);
    lblAvaliacaoAtual.classList.remove("far");
    lblAvaliacaoAtual.classList.add("fas");

    // Tira o negrito da ultima opcao selecionada
    if (idUtimaAvaliacao != null && idUtimaAvaliacao != idAvaliacao) {
        lblUltimaAvaliacao = document.querySelector(`#${idUtimaAvaliacao}`);
        lblUltimaAvaliacao.classList.remove("fas");
        lblUltimaAvaliacao.classList.add("far");
    }

    // Define a avaliacao atual como a ultima selecionada
    idUtimaAvaliacao = idAvaliacao;
}