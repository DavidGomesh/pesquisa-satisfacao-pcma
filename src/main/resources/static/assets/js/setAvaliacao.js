
// Scrip para controlar a mudança de opção na Avaliação
let idUtimaAvaliacao = null;
let classUltimaAvaliacao = "";

function setAvaliacao(avaliacao) {
    let idAvaliacao = "";

    let rowAvaliacaoAtual;
    let lblAvaliacaoAtual;

    let rowUltimaAvaliacao;
    let lblUltimaAvaliacao;

    switch (avaliacao) {
        case 1: idAvaliacao = "avaliacao-pessimo"; break;
        case 2: idAvaliacao = "avaliacao-ruim"; break;
        case 3: idAvaliacao = "avaliacao-regular"; break;
        case 4: idAvaliacao = "avaliacao-bom"; break;
        case 5: idAvaliacao = "avaliacao-otimo"; break;
    }

    // Deixa a opcao selecionada em negrito e muda a cor
    rowAvaliacaoAtual = document.querySelector(`#row-${idAvaliacao}`);
    rowAvaliacaoAtual.classList.add(`avaliacao-${avaliacao}`);
    
    lblAvaliacaoAtual = document.querySelector(`#icon-${idAvaliacao}`);
    lblAvaliacaoAtual.classList.remove("far");
    lblAvaliacaoAtual.classList.add("fas");
    
    // Tira o negrito e a cor da ultima opcao selecionada
    if (idUtimaAvaliacao != null && idUtimaAvaliacao != idAvaliacao) {
        rowUltimaAvaliacao = document.querySelector(`#row-${idUtimaAvaliacao}`);
        rowUltimaAvaliacao.classList.remove(classUltimaAvaliacao);
        
        lblUltimaAvaliacao = document.querySelector(`#icon-${idUtimaAvaliacao}`);
        lblUltimaAvaliacao.classList.remove("fas");
        lblUltimaAvaliacao.classList.add("far");
    }
    
    // Define a avaliacao atual como a ultima selecionada e guarda a class tbm
    classUltimaAvaliacao = `avaliacao-${avaliacao}`;
    idUtimaAvaliacao = idAvaliacao;
}