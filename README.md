# Padrão Memento

## Descrição:
### Basicamente o padrão Observer tem como função observar possíveis eventos de algum projeto, só que além dessa função de observar ele pode também ter a função de noticiar essa mudança, ou evento que ocorreu, pois ele criado especificamente para notificar certo evento, em um determinado projeto.

## Motivação:
### Após assistir um seminário de um ex aluno de Engenharia elétrica, falando sobre a construção de um sistema como o google Earth, perguntei a ele algo mais prático, um dos exemplos mais praticos que ele me disse, foi de existir a possibilidade de haver como se fosse um monitor, observando possiveis mudanças de uma montanha, ou algo que possa causar algum desastre.

## Aplicação:
### Possivel de ver o aumento de distância de uma montanha a outro lugar.


## Estrutura:
![structure](https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/500px-Observer.svg.png)


## Pasta com o codigo:
[CODEPASTE](/trabalhoPadraoObserver/src/trabalhoPadraoObserver)

### Classe googleEarthObserver.
Nesta classe  nota-se a presença da interface Subject e da sua classe concreta googleEarthObserver que define o comportamento dos objetos para se registrarem (Attach) .
 E a existncia do método update() que é chamado quando o estado do Subject é alterado.

### Classe Subject e Observer.
Classes aonde o principio do padrão observer são criados.
O subject sendo aonde será montado a possivel lista de seus dependentes chamados de “observers”, e os notifica automaticamente de eventuais mudanças de estado, geralmente, chamando um dos seus métodos.
E a classe abstrata Observer aonde será criado o que será observado e a forma de atualizar, para assim poder notificar.

