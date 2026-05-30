# Sistema de Itens

## Estrutura Geral

O sistema de itens é responsável por fornecer progressão de equipamentos, fortalecimento do personagem e integração com a exploração do universo do jogo.

Os itens são obtidos principalmente através de:

- bosses;
- mini-bosses;
- eventos especiais;
- progressão da campanha.

O sistema busca manter simplicidade de implementação e clareza de progressão.

## Categorias de Itens

Os itens são divididos em três categorias principais.

### Armas

Responsáveis principalmente pelo aumento de dano e fortalecimento ofensivo.

O sistema de armas utilizará categorias simples para manter clareza, organização, progressão consistente e identidade entre as raças.

Cada tipo de arma possui:

- usuários principais;
- progressão por tier;
- versões lendárias inspiradas no universo de Tolkien.

#### Categorias de Armas

| Tipo de Arma | Usuários Principais |
|--------------|---------------------|
| Espadas | Numenorianos, Istari |
| Arcos | Elfos |
| Machados | Anões |
| Cajados | Istari |
| Adagas | Hobbits |
| Lanças | Numenorianos |
| Armas Sombrias | UrukHai, Nazgûl |

#### Progressão por Tipo de Arma

##### Espadas

| Tier | Equipamento |
|------|-------------|
| Inicial | Espada Curta |
| Intermediário | Espada Númenoriana |
| Avançado | Lâmina Élfica |
| Final | **Andúril** |

> **Andúril** — Espada lendária inspirada na arma de Aragorn. Possíveis bônus: aumento de Força, bônus contra criaturas sombrias, aumento de dano físico.

##### Arcos

| Tier | Equipamento |
|------|-------------|
| Inicial | Arco Simples |
| Intermediário | Arco Élfico |
| Avançado | Arco de Lórien |
| Final | **Arco Lendário Élfico** |

> **Arcos Élficos** — Focados em precisão, Agilidade e ataques rápidos. Possíveis bônus: aumento de chance crítica, aumento de esquiva, prioridade em turnos.

##### Machados

| Tier | Equipamento |
|------|-------------|
| Inicial | Machado de Ferro |
| Intermediário | Machado Anão |
| Avançado | Machado Rúnico |
| Final | **Machado do Rei Sob a Montanha** |

> **Machados Anões** — Focados em dano pesado, resistência e combate corpo a corpo. Possíveis bônus: aumento de Defesa, aumento de dano físico, resistência elevada.

##### Cajados

| Tier | Equipamento |
|------|-------------|
| Inicial | Cajado Simples |
| Intermediário | Cajado Branco |
| Avançado | Cajado Arcano |
| Final | **Glamdring e Cajado Supremo** |

> **Glamdring** — Arma lendária inspirada na espada utilizada por Gandalf. Possíveis bônus: aumento de Poder Mágico, redução de cooldown, fortalecimento de habilidades mágicas.

##### Adagas

| Tier | Equipamento |
|------|-------------|
| Inicial | Adaga Curta |
| Intermediário | Adaga Élfica |
| Avançado | Lâmina Furtiva |
| Final | **Sting** |

> **Sting** — Arma lendária inspirada na espada utilizada por Bilbo e Frodo. Possíveis bônus: aumento de Agilidade, aumento de esquiva, ataques rápidos, bônus contra criaturas sombrias.

##### Lanças

| Tier | Equipamento |
|------|-------------|
| Inicial | Lança Simples |
| Intermediário | Lança Númenoriana |
| Avançado | Lança Real |
| Final | **Lança dos Reis do Oeste** |

> **Lanças Númenorianas** — Focadas em equilíbrio, alcance e combate versátil. Possíveis bônus: equilíbrio entre ataque e defesa, bônus moderados de Agilidade, ataques de alcance intermediário.

##### Armas Sombrias

| Tier | Equipamento |
|------|-------------|
| Inicial | Lâmina Orc |
| Intermediário | Machado UrukHai |
| Avançado | Lâmina de Morgul |
| Final | **Arma Sombria Ancestral** |

> **Lâmina de Morgul** — Arma inspirada nas lâminas utilizadas pelos Nazgûl. Possíveis bônus: dano elevado, efeitos sombrios, fortalecimento de inimigos sombrios.

#### Estrutura Conceitual

O sistema poderá utilizar herança, especialização de itens, enums de categorias e tiers de raridade.

```java
enum TipoArma {
    ESPADA,
    ARCO,
    MACHADO,
    CAJADO,
    ADAGA,
    LANCA
}
```

### Armaduras

O sistema de armaduras busca reforçar identidade racial, complementar estilos de combate, ampliar progressão de equipamentos e manter simplicidade de balanceamento.

As armaduras são divididas em quatro tipos:

- **Leves**
- **Médias**
- **Pesadas**
- **Mágicas**

Cada categoria influencia diretamente atributos do personagem.

#### Armaduras Leves

Focadas em mobilidade, evasão e velocidade.

| Característica | Valor |
|----------------|-------|
| Benefício | +Agilidade |
| Limitação | Menor Defesa |
| Usuários Principais | Elfos, Hobbits |

| Tier | Equipamento |
|------|-------------|
| Inicial | Armadura de Couro |
| Intermediário | Armadura Élfica |
| Avançado | Manto de Lórien |
| Final | **Armadura dos Eldar** |

#### Armaduras Médias

Focadas em equilíbrio, resistência moderada e versatilidade.

| Característica | Valor |
|----------------|-------|
| Benefício | Equilíbrio entre Defesa e Agilidade |
| Limitação | Sem penalidade forte |
| Usuários Principais | Numenorianos |

| Tier | Equipamento |
|------|-------------|
| Inicial | Armadura de Ferro |
| Intermediário | Armadura Númenoriana |
| Avançado | Armadura Real |
| Final | **Armadura dos Reis do Oeste** |

#### Armaduras Pesadas

Focadas em resistência, combate corpo a corpo e absorção de dano.

| Característica | Valor |
|----------------|-------|
| Benefício | Alta Defesa |
| Limitação | -Agilidade |
| Usuários Principais | Anões |

| Tier | Equipamento |
|------|-------------|
| Inicial | Armadura de Placas |
| Intermediário | Armadura Anã |
| Avançado | Armadura Rúnica |
| Final | **Armadura do Rei Sob a Montanha** |

#### Armaduras Mágicas

Focadas em fortalecimento arcano, Mana e Poder Mágico.

| Característica | Valor |
|----------------|-------|
| Benefício | +Mana, +Poder Mágico |
| Limitação | Menor Defesa |
| Usuários Principais | Istari |

| Tier | Equipamento |
|------|-------------|
| Inicial | Vestes Arcanas |
| Intermediário | Manto Branco |
| Avançado | Vestes de Valinor |
| Final | **Vestimenta dos Maiar** |

#### Balanceamento das Armaduras

| Tipo | Benefício | Limitação |
|------|-----------|-----------|
| Leve | +Agilidade | Menor Defesa |
| Média | Equilíbrio | Sem penalidade forte |
| Pesada | +Defesa | -Agilidade |
| Mágica | +Mana, +Poder Mágico | Menor Defesa |

### Acessórios

Os acessórios funcionam como equipamentos de suporte. Seu objetivo é complementar builds, fortalecer atributos, adicionar identidade ao personagem e conectar progressão e lore.

Os acessórios possuem bônus simples e efeitos únicos. O sistema evita múltiplos efeitos complexos, combinações excessivas e buffs acumulativos exagerados.

#### Categorias de Acessórios

| Categoria | Função |
|-----------|--------|
| **Anéis** | Bônus mágicos e utilitários |
| **Amuletos** | Fortalecimento de atributos |
| **Relíquias** | Efeitos especiais |

##### Anéis

Inspirados nos artefatos do universo Tolkien.

| Item | Efeito |
|------|--------|
| Anel Élfico | +Mana |
| Anel Arcano | +Poder Mágico |
| Anel da Fortaleza | +Defesa |

##### Amuletos

Focados em fortalecimento direto de atributos.

| Item | Efeito |
|------|--------|
| Amuleto de Valinor | +Poder Mágico |
| Relicário Real | +Vida |
| Símbolo Númenoriano | Equilíbrio geral |

##### Relíquias

Itens raros conectados ao universo e narrativa.

| Item | Efeito |
|------|--------|
| Relíquia Élfica | +Agilidade |
| Relíquia Anã | +Defesa |
| Relicário Arcano | Redução de cooldown |

#### Compatibilidade de Acessórios

| Item | Restrição |
|------|-----------|
| Relicário Arcano | Apenas Istari |
| Relicário Élfico | Apenas Elfos |
| Relíquia Anã | Apenas Anões |

## Artefatos

Artefatos **não são uma categoria separada** de equipamento. Funcionam como **classificação lendária transversal** — uma raridade especial e identificação narrativa que pode estar presente em qualquer categoria de item.

Dessa forma, armas, armaduras e acessórios podem possuir classificação de artefato.

Exemplos:

| Item | Categoria | Artefato |
|------|-----------|----------|
| Andúril | Arma | Sim |
| Sting | Arma | Sim |
| Armadura dos Eldar | Armadura | Sim |
| Fragmento de Silmaril | Acessório / Relíquia | Sim |

### Artefatos Narrativos

Alguns artefatos podem possuir importância narrativa, função de progressão e valor simbólico, sem necessariamente serem completamente balanceados para combate.

O sistema de consumíveis foi removido para reduzir complexidade e manter o escopo do projeto mais controlado.

O jogo **não** utilizará:

- poções;
- itens de cura;
- recuperação manual de Mana;
- gerenciamento de recursos consumíveis.

### Recuperação de Recursos

A recuperação de **Vida** e **Mana** ocorre automaticamente em momentos importantes da progressão:

- ao subir de nível;
- checkpoints;
- eventos principais.

## Sistema de Raridade

Os itens possuem diferentes níveis de raridade.

| Raridade | Descrição |
|----------|-----------|
| **Comum** | Itens básicos encontrados no início do jogo |
| **Raro** | Itens mais fortes obtidos em desafios intermediários |
| **Épico** | Itens avançados associados a bosses importantes |
| **Lendário** | Itens únicos relacionados a bosses finais, eventos especiais, conteúdos pós-jogo e artefatos do universo |

## Progressão de Equipamentos

A progressão dos equipamentos ocorre principalmente através da derrota de:

- mini-bosses;
- bosses principais;
- eventos especiais.

O desbloqueio de equipamentos é vinculado à **progressão da campanha** e não diretamente ao nível do jogador.

### Equipamentos por Tier

| Tier | Armas | Armaduras | Acessórios | Origem |
|------|-------|-----------|------------|--------|
| **Inicial** | Espada Curta, Arco Simples, Machado de Ferro, Cajado Simples, Adaga Curta, Lança Simples | Armadura de Couro, Armadura de Ferro, Armadura de Placas, Vestes Arcanas | Itens básicos | Início do jogo |
| **Intermediário** | Espada Númenoriana, Arco Élfico, Machado Anão, Cajado Branco, Adaga Élfica, Lança Númenoriana | Armadura Élfica, Armadura Númenoriana, Armadura Anã, Manto Branco | Relíquias menores | Mini-bosses |
| **Avançado** | Lâmina Élfica, Arco de Lórien, Machado Rúnico, Cajado Arcano, Lâmina Furtiva, Lança Real | Manto de Lórien, Armadura Real, Armadura Rúnica, Vestes de Valinor | Artefatos raros | Dragões |
| **Final** | Andúril, Arco Lendário Élfico, Machado do Rei Sob a Montanha, Glamdring, Sting, Lança dos Reis do Oeste | Armadura dos Eldar, Armadura dos Reis do Oeste, Armadura do Rei Sob a Montanha, Vestimenta dos Maiar | Artefatos lendários | Balrog / Eventos |

## Slots de Equipamento

Os personagens possuem 3 slots de equipamento:

- **Arma**
- **Armadura**
- **Acessório**

## Equipamentos Iniciais

Cada raça inicia com equipamentos básicos compatíveis com sua identidade.

## Restrições por Raça

### Itens Universais

Podem ser utilizados por qualquer raça.

Exemplos: equipamentos básicos, acessórios simples, armas comuns, itens iniciais.

### Itens Exclusivos

Alguns equipamentos possuem afinidade racial ou temática.

| Raça | Equipamentos | Restrições |
|------|--------------|------------|
| **Elfo** | Arcos, espadas leves, armaduras leves, artefatos élficos | Armadura dos Eldar (exclusiva) |
| **Anão** | Machados, martelos, armaduras pesadas | Armadura Anã, Armadura do Rei Sob a Montanha (exclusivas) |
| **Hobbit** | Adagas, equipamentos leves, itens furtivos | — |
| **Istari** | Cajados, artefatos mágicos, vestes mágicas | Vestimenta dos Maiar, Relicário Arcano (exclusivos) |
| **Numenoriano** | Espadas, lanças, armaduras médias, relíquias reais | Armadura dos Reis do Oeste (exclusiva) |

## Balanceamento

O sistema de itens busca:

- simplicidade;
- clareza;
- progressão perceptível;
- coerência com as raças;
- integração com a campanha.

## Limitações do Sistema

O jogo **não** possuirá sistemas complexos de:

- crafting;
- encantamentos avançados;
- combinações extensas de itens.

## Objetivo do Sistema

O sistema de itens busca fornecer:

- sensação de recompensa;
- progressão constante;
- fortalecimento do jogador;
- integração com o universo do jogo;
- variedade de gameplay;
- identidade para cada raça e estilo de combate.
