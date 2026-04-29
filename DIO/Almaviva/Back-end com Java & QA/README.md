## 📋 APRESENTAÇÃO

Este repositório documenta meu progresso no **Bootcamp Back-end com Java & QA** da DIO. Criado para registrar conquistas, praticar commits no Git e aprimorar habilidades em Markdown, visando usufruir ao máximo de todos os conceitos ensinados.

Comprometo-me a aplicar continuamente novos conhecimentos em códigos e documentos, utilizando-os como ferramentas de prática para evoluir e enriquecer meus repositórios ao longo do tempo. Cada atualização reflete meu crescimento profissional e técnico.

---

## 📖 STATUS

- ✅ **Concluído**: Módulos ou atividades finalizadas com sucesso.
- ⌛ **Em Andamento**: Conteúdo atualmente em estudo ou prática.
- ⏳ **Próximo Tópico**: Itens pendentes, aguardando sequência no bootcamp.

---

## REGISTRO DE PROGRESSO

✅ Onboard do Bootcamp e Fundamentos de Colaboração no GitHub

✅ Fundamentos da linguagem de programação Java

⌛ Orientação a Objeto em java na Prática

⏳ Debug, Exeções,I/O e Gestão de Dependências

⏳ Domínio de Collections e Stream API com Projeto Aplicado

⏳ APIs REST com Java e Spring Boot e Persistência de Dados

⏳ Banco de Dados para Backend na Prática com java

⏳ Fundamentos de Qualidade de Software

⏳ Testes de Software em Projetos java

## EXERCICIOS

✅ [Fundamentos da Sintaxe da Linguagem Java](https://github.com/Theu-dev/Bootcamps/tree/c302ac3b7cbaab7e07846d0935ff008da2e58103/DIO/Almaviva/Back-end%20com%20Java%20%26%20QA/src/com/Exercicios/FundamentosDaSintaxeDaLinguagemJava)
✅ [Estruturas de Controle](https://github.com/Theu-dev/Bootcamps/tree/c302ac3b7cbaab7e07846d0935ff008da2e58103/DIO/Almaviva/Back-end%20com%20Java%20%26%20QA/src/com/Exercicios/EstruturasDeControle)
⌛ [Abstracao com Classes e Encapsulamento](https://github.com/Theu-dev/Bootcamps/tree/c302ac3b7cbaab7e07846d0935ff008da2e58103/DIO/Almaviva/Back-end%20com%20Java%20%26%20QA/src/com/Exercicios/AbstracaocomClassesEEncapsulamento)

## PROJETOS CONCLUIDOS

✅ [Contribuindo em um Projeto Open Source no GitHub](https://github.com/Theu-dev/dio-lab-open-source.git)

## DESAFIOS DE CÓDIGO

✅ [Aperfeiçoe sua Lógica e Pensamento Computacional]

## LIVES ASSISITIDAS

✅ [Live de Lançamento - Almaviva - Back-end com Java & QA](https://www.youtube.com/live/a0HtHFkKyjk?si=SusFylu7WxhJXqdY)
✅ [Boas Práticas de Desenvolvimento em Java no Mundo Real](https://www.youtube.com/live/1CWO9j_i_P0?si=3SI6YCZa1Mc-IDnF)

## 🤝 MATERIAL DE APOIO

- [Documentação Git](https://git-scm.com/docs/git/pt_BR)
- [Documentação GitHub](https://docs.github.com/pt)
- [Repositório de Exercicios](https://github.com/digitalinnovationone/exercicios-java-basico)
- [Java keywords](https://www.w3schools.com/java/java_ref_keywords.asp)


## 🧰 FERRAMENTAS E LINGUAGENS

| Ferramentas | Linguagens |
|:-:|:-:|
| `IntelliJ IDEA` | `Java` |
| `Git` | `-` |

## 🤖 COMANDOS GIT PRATICADOS

| Comando | Explicação Técnica | Exemplo | Retorno |
|---------|--------------------|---------|---------|
| `git config --global --add safe.directory "Caminho do diretório"` | Define um repositório como seguro para add ao repositório remoto. | `git config --global user.name "\E"` | Repositório como seguro. |
| `git config --global user.name "Nome do dev"` | Define o nome do autor usado pelo Git em todos os commits feitos na máquina. | `git config --global user.name "Maria Silva"` | Normalmente não exibe mensagem; a configuração fica salva globalmente. |
| `git config --global user.email "email do dev"` | Define o e-mail do autor usado pelo Git em todos os commits feitos na máquina. | `git config --global user.email "maria@email.com"` | Normalmente não exibe mensagem; a configuração fica salva globalmente. |
| `git config --global --list` | Exibe todas as configurações globais atualmente salvas no Git. | `git config --global --list` | Lista no terminal pares como `user.name` e `user.email`. |
| `git branch -m master main` | Renomeia a branch local `master` para `main`. | `git branch -m master main` | A branch passa a se chamar `main`, sem saída se ocorrer com sucesso. |
| `git init` | Inicializa um repositório Git na pasta atual. | `git init` | Exibe mensagem informando que um repositório vazio foi inicializado. |
| `git status` | Mostra o estado atual dos arquivos, da staging area e da branch ativa. | `git status` | Exibe arquivos modificados, staged, não rastreados e a branch atual. |
| `git remote add origin "URL DO REPOSITORIO"` | Adiciona um repositório remoto ao projeto local com o nome `origin`. | `git remote add origin "https://github.com/user/projeto.git"` | Normalmente não exibe mensagem; o remoto `origin` passa a existir. |
| `git add "Nome do arquivo/pacote"` | Envia alterações para a staging area, preparando o conteúdo para commit. | `git add README.md` | Normalmente não exibe mensagem; o arquivo fica staged. |
| `git reset "Nome do arquivo/pacote"` | Remove um arquivo da staging area sem apagar as alterações locais. | `git reset README.md` | O arquivo sai da staging area e volta para modified/untracked conforme o caso. |
| `git restore "Nome do arquivo/pasta"` | Descarta alterações locais e restaura a última versão rastreada do arquivo. | `git restore README.md` | O arquivo retorna ao último estado versionado e as mudanças locais são descartadas. |
| `git commit --amend -m "escrever nova mensagem"` | Altera a mensagem do commit mais recente e pode incluir mudanças já adicionadas à staging area. | `git commit --amend -m "docs: corrige tabela git"` | Cria um novo hash para o último commit e mostra o resumo do commit atualizado. |
| `git reset --soft "hash"` | Move o HEAD para um commit anterior e mantém as alterações na staging area. | `git reset --soft a1b2c3d` | O ponteiro volta para o commit indicado e os arquivos continuam staged. |
| `git reset "hash" ou git reset --mixed "hash"` | Move o HEAD para um commit anterior e mantém as alterações apenas no diretório de trabalho. | `git reset --mixed a1b2c3d` | O ponteiro volta para o commit indicado e os arquivos saem da staging area. |
| `git reset --hard "hash"` | Restaura o repositório exatamente ao estado de um commit anterior, descartando alterações locais e staged. | `git reset --hard a1b2c3d` | O Git volta ao commit escolhido e apaga alterações locais não salvas. |
| `git reflog` | Exibe o histórico de movimentação do HEAD, útil para recuperar referências e commits perdidos. | `git reflog` | Lista os movimentos recentes do HEAD com hashes e descrições de ação. |
| `git checkout -b teste` | Cria uma nova branch e já troca para ela no mesmo comando. | `git checkout -b teste` | Exibe mensagem indicando criação da branch e mudança para ela. |
| `git branch -v` | Lista as branches locais mostrando o último commit de cada uma. | `git branch -v` | Exibe as branches com hash curto e mensagem do último commit. |
| `git merge "Nome da branch que desejamos mesclar com a main"` | Integra o histórico de outra branch na branch atualmente ativa. | `git merge feature-login` | Pode criar merge commit ou fast-forward e exibe o resumo da mesclagem. |
| `git branch` | Lista as branches locais e marca com `*` a branch em uso no momento. | `git branch` | Exibe a lista de branches locais com destaque para a atual. |
| `git branch -d "nome da branch que desejamos excluir"` | Exclui uma branch local já mesclada. | `git branch -d feature-login` | Exibe mensagem confirmando a exclusão da branch. |
| `git branch -D "nome da branch que desejamos excluir"` | Exclui uma branch local de forma forçada, mesmo sem merge. | `git branch -D feature-login` | Exibe mensagem confirmando a exclusão forçada da branch. |
| `git fetch origin main` | Baixa as atualizações da branch remota sem fazer merge automático na branch local. | `git fetch origin main` | Atualiza as referências remotas locais e mostra o progresso do download. |
| `git diff "Branch remota" "Branch local por exemplo(origin/main)"` | Compara duas referências e mostra as diferenças de conteúdo entre elas. | `git diff origin/main main` | Exibe no terminal as linhas adicionadas, removidas e alteradas. |
| `git merge origin/main` | Mescla a referência remota já baixada com a branch local atual. | `git merge origin/main` | Aplica as mudanças remotas localmente e exibe o resultado do merge. |
| `git clone "colar a URL" --branch "nome da branch que deseja clonar" --single-branch` | Clona apenas uma branch específica de um repositório remoto. | `git clone "https://github.com/user/projeto.git" --branch develop --single-branch` | Cria a pasta do projeto, baixa os arquivos da branch e configura o remoto `origin`. |
| `git stash` | Salva temporariamente alterações não commitadas em uma pilha de stashes. | `git stash` | Exibe uma mensagem confirmando que as alterações foram armazenadas. |
| `git stash list` | Lista todos os stashes salvos no repositório atual. | `git stash list` | Mostra uma lista como `stash@{0}`, `stash@{1}` com suas descrições. |
| `git stash pop` | Aplica o stash mais recente e o remove da pilha. | `git stash pop` | Restaura as alterações e remove o stash aplicado da lista. |
| `git stash apply` | Aplica um stash sem removê-lo da pilha. | `git stash apply` | Restaura as alterações, mas mantém o stash salvo na lista. |
| `git stash apply stash@{"Numero da pilha"} ou git stash pop stash@{"Numero da pilha"}` | Aplica ou recupera um stash específico quando há vários itens salvos. | `git stash apply stash@{1}` | Restaura o stash escolhido; com `pop`, ele também é removido da pilha. |

---
