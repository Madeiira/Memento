# Padrão Memento

## Descrição:
### Memento é um padrão de design de software registrado no catálogo "Gang of Four" e é considerado um padrão de comportamento. Ele permite que você armazene o estado interno do objeto em um determinado momento para que ele possa ser retornado a este estado sem causar problemas de encapsulamento.

## Motivação:
### Após ver o exemplo dado do professor, criei algo seguindo a mesma linha, apenas para melhor fixação do aprendizado.

## Aplicação:
### Possivel catalogar edições especiais de revistas.

## Estrutura:
![structure](https://www.baeldung.com/wp-content/uploads/2019/08/Memento-Design-Pattern-1.png)


## Pasta com o codigo:
[CODEPASTE](/Memento/src/trabalhoMemento/)

### Classe Revista.
Neste exemplo, estamos criando memento para um Revista que possui três atributos básicos - id, título e conteúdo.

### Classe RevistaMemento.
RevistaMemento é usada como memento para Revista

### Classe Main.
A classe Main atua como um Caretaker que cria e restaura os objetos memento.

