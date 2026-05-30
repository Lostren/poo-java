# Sistema de Inventário

## Estrutura Geral

O sistema de inventário é responsável por armazenar os equipamentos e itens obtidos pelo jogador ao longo da progressão.

O sistema busca:

- simplicidade;
- clareza;
- facilidade de implementação;
- integração com a progressão e combate.

O inventário não terá foco em gerenciamento complexo de recursos.

## Estrutura do Inventário

O jogo utilizará um **único inventário** responsável por armazenar todos os itens obtidos pelo jogador.

O inventário armazenará:

- armas;
- armaduras;
- acessórios;
- artefatos;
- equipamentos desbloqueados.

O jogo não utiliza consumíveis.

## Limite de Itens

O inventário **não possuirá limite de armazenamento**.

Considerando o escopo reduzido do projeto e a quantidade limitada de itens disponíveis ao longo da campanha, o jogador não acumulará itens em excesso.

## Sistema de Equipamento

Os personagens poderão equipar itens diretamente do inventário.

Ao equipar um novo item, o equipamento anterior é **substituído automaticamente**. O item removido retorna ao inventário.

### Estrutura Simplificada

```
Inventário
   ↓
equipar item
   ↓
slot correspondente atualizado
```

### Slots de Equipamento

Cada personagem possui 3 slots de equipamento:

- **Arma**
- **Armadura**
- **Acessório**

### Equipamentos Iniciais

Os equipamentos iniciais das raças já começam **equipados no personagem**. Eles não dependem de gerenciamento de espaço e podem ser substituídos normalmente durante a progressão.

### Artefatos

Artefatos são itens lendários especiais que ocupam slots já existentes, principalmente **arma** e **acessório**.

O jogador pode utilizar **apenas um acessório equipado por vez**.

### Itens Duplicados

O inventário pode armazenar itens repetidos quando necessário. A presença de itens duplicados não é foco principal do sistema.

## Obtenção de Itens

Os itens são obtidos principalmente através de:

- bosses;
- mini-bosses;
- eventos especiais;
- progressão da campanha.

Bosses e mini-bosses podem adicionar equipamentos diretamente ao inventário do jogador após serem derrotados.

## Visualização do Inventário

O inventário será exibido inicialmente através de:

- listas textuais;
- menus simples;
- interfaces baseadas em `JOptionPane` / `InOut`.

Futuramente, o sistema poderá ser integrado a interfaces gráficas mais avançadas utilizando `JFrame`.

## Organização dos Itens

Os itens serão exibidos automaticamente pelo sistema em **listas simples**.

O jogo não possuirá:

- organização manual;
- grid;
- separação por bolsas;
- peso;
- crafting;
- durabilidade;
- gerenciamento avançado de armazenamento.

## Integração com Classes

Os equipamentos continuam respeitando:

- afinidade racial;
- identidade das classes;
- estilos de combate.

Alguns itens podem ser universais e utilizados por qualquer raça.

## Objetivo do Sistema

O sistema de inventário busca:

- apoiar a progressão do jogador;
- reforçar identidade das classes;
- simplificar gerenciamento;
- integrar equipamentos ao combate;
- manter o escopo do projeto controlado e viável.
