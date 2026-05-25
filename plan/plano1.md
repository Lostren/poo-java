# Projeto — RPG Orientado a Objetos inspirado em The Lord of the Rings

## Visão Geral

O projeto consiste no desenvolvimento de um jogo RPG textual em Java utilizando os conceitos de Programação Orientada a Objetos (POO).

O jogador poderá escolher uma raça pertencente aos Povos Livres da Terra-média e enfrentar criaturas das forças sombrias em batalhas por turnos, evoluindo seus atributos, habilidades e equipamentos ao longo da gameplay.

O sistema será inspirado no universo de The Lord of the Rings e também incorporará elementos da Primeira Era presentes em The Silmarillion.

---

# Objetivo do Jogo

O jogador deverá:
- escolher uma raça;
- enfrentar inimigos das forças sombrias;
- vencer batalhas;
- ganhar experiência;
- evoluir atributos;
- desbloquear habilidades;
- obter itens e relíquias lendárias.

O jogo possuirá progressão contínua baseada em níveis, equipamentos e habilidades especiais.

---

# Facções

## Povos Livres (Jogador)

- Elfos
- Anões
- Hobbits
- Istari
- Numenorianos

## Forças Sombrias (Inimigos)

- Uruk-hai
- Dragões
- Nazgûl
- Balrogs

---

# Estrutura Geral do Sistema

O sistema será baseado em:
- combate por turnos;
- progressão de personagem;
- sistema de níveis;
- inventário;
- itens lendários;
- habilidades especiais;
- bosses;
- NPCs.

---

# Conceitos de Programação Orientada a Objetos Utilizados

## Herança

Todos os personagens herdarão características da classe abstrata `Personagem`.

Exemplo:

```java
Personagem
 ├── Elfo
 ├── Anao
 ├── Hobbit
 ├── Istari
 ├── Numenoriano
 ├── UrukHai
 ├── Dragao
 ├── Nazgul
 └── Balrog
```

---

## Polimorfismo

Cada raça executará comportamentos de forma diferente.

Exemplo:

```java
personagem.atacar();
personagem.usarHabilidade();
```

---

## Encapsulamento

Os atributos serão privados e manipulados por getters e setters.

Exemplo:

```java
private int vida;
private int mana;
private int nivel;
private int xp;
```

---

## Abstração

A classe `Personagem` será abstrata e servirá como base para todas as raças.

---

## Interfaces

Interfaces serão utilizadas para comportamentos específicos.

Exemplo:

```java
interface Voador {
    void voar();
}

interface Magico {
    void usarMagia();
}
```

---

# Estrutura de Pacotes

```text
src/
 ├── personagens/
 ├── itens/
 ├── habilidades/
 ├── interfaces/
 ├── combate/
 ├── inventario/
 ├── jogo/
 └── util/
```

---

# Sistema de Atributos

Todos os personagens possuirão atributos básicos:

```java
vida
mana
forca
defesa
agilidade
nivel
xp
```

---

# Sistema de Progressão

Ao vencer batalhas, o jogador ganhará experiência.

Quando atingir determinada quantidade de XP:
- sobe de nível;
- aumenta atributos;
- desbloqueia habilidades;
- obtém acesso a novos itens.

Exemplo:

```java
ganharXp()
subirNivel()
```

---

# Características das Raças

## Elfos
- alta agilidade;
- precisão elevada;
- bônus com arco.

## Anões
- alta defesa;
- resistência física;
- bônus com machado.

## Hobbits
- furtividade;
- evasão;
- velocidade.

## Istari
- uso de magia;
- ataques mágicos;
- alta mana.

## Numenorianos
- equilíbrio entre ataque e defesa;
- bônus com espada.

---

# Sistema de Itens

O sistema de equipamentos será unificado na classe `Item`.

Exemplo:

```java
Item
 ├── Arma
 ├── Artefato
 ├── Armadura
 └── Consumivel
```

Os itens possuirão:
- nome;
- raridade;
- bônus;
- efeitos especiais;
- restrições de uso.

---

# Sistema de Raridade

```text
Comum
Raro
Épico
Lendário
Relíquia Ancestral
```

---

# Itens Exclusivos por Raça

Alguns itens só poderão ser utilizados por determinadas raças.

## Exemplos

### Elfos
- Arco Élfico
- Relíquias élficas

### Anões
- Machado de Guerra
- Armaduras pesadas

### Istari
- Cajados mágicos

### Numenorianos
- Espadas lendárias

---

# Itens Universais

Alguns itens poderão ser utilizados por qualquer personagem.

Exemplo:
- poções;
- armaduras simples;
- artefatos especiais.

---

# Relíquias e Artefatos Lendários

O jogo possuirá itens importantes do universo de Tolkien.

## Artefatos

- The One Ring
- Silmarils

## Armas Lendárias

- Andúril
- Glamdring
- Sting

## Relíquias

- Capacete de Túrin
- Armadura de Hador
- Lâmina de Morgul

---

# Sistema de Habilidades

Cada raça possuirá habilidades especiais.

## Elfo

```java
chuvaDeFlechas()
```

## Istari

```java
relampago()
```

## Hobbit

```java
furtividade()
```

## Dragão

```java
soproDeFogo()
```

## Balrog

```java
infernoArdente()
```

---

# NPCs e Personagens Lendários

Personagens famosos do universo poderão aparecer durante a gameplay como:
- aliados;
- NPCs;
- mentores;
- bosses;
- eventos especiais.

---

# NPCs Aliados

- Gandalf
- Aragorn
- Legolas
- Gimli
- Elrond
- Galadriel

Esses personagens poderão:
- ajudar em batalhas;
- fornecer buffs;
- entregar itens;
- ensinar habilidades.

---

# Personagens da Primeira Era

O jogo também contará com figuras lendárias da Primeira Era.

## NPCs especiais

- Lúthien
- Fëanor
- Eärendil

Esses personagens estarão associados a:
- eventos raros;
- itens ancestrais;
- buffs especiais;
- upgrades lendários.

---

# Bosses

O jogo possuirá bosses especiais.

## Bosses principais

- The Witch-king of Angmar
- Smaug
- Durin's Bane
- Saruman

---

# Boss Secreto

## Ancalagon the Black

Ancalagon será um boss secreto desbloqueado apenas em condições especiais.

Características:
- enorme quantidade de vida;
- dano em área;
- voo;
- fogo;
- batalha final opcional.

---

# Sistema de Combate

O combate será baseado em turnos.

Exemplo:

```java
atacar()
defender()
usarHabilidade()
correr()
```

O dano será calculado utilizando:
- atributos;
- arma equipada;
- habilidade utilizada.

---

# Sistema de Inventário

O jogador poderá:
- equipar itens;
- trocar equipamentos;
- armazenar itens;
- utilizar consumíveis.

Exemplo:

```java
ArrayList<Item> inventario;
```

---

# Tratamento de Exceções

O projeto utilizará tratamento de exceções para:
- entradas inválidas;
- erros de seleção;
- inventário;
- ações impossíveis.

Exemplo:

```java
try {
    escolherItem();
}
catch(Exception e) {
    System.out.println("Opção inválida.");
}
```

---

# Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Collections (`ArrayList`)
- Tratamento de Exceções
- `InOut.java`

---

# Diferenciais do Projeto

O projeto pretende expandir significativamente o modelo base proposto na atividade, adicionando:
- sistema de progressão;
- itens lendários;
- bosses;
- NPCs;
- habilidades especiais;
- eventos raros;
- elementos da Primeira Era;
- combate estratégico;
- sistema de raridade;
- inventário completo.

---

# Possíveis Melhorias Futuras

- Interface gráfica com JFrame
- Background do jogo
- Sistema de missões
- Loja de itens
- Salvamento de progresso
- Eventos aleatórios
- Multiplayer local
